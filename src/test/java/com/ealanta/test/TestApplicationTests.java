package com.ealanta.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

@SpringBootTest
@ActiveProfiles("test")
@Testcontainers
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestApplicationTests {

		Logger logger1 = LoggerFactory.getLogger(TestApplicationTests.class);
		Logger logger2 = LoggerFactory.getLogger("com.github.dockerjava.zerodep.shaded");

		@Autowired
		CustomerRepo repo;

		@Value("${source.location}")
		private String source;

		@Container
		static MySQLContainer<?> mysql = new MySQLContainer<>("mysql:8.0.28")
				.withDatabaseName("test")
				.withInitScript("init.sql");

		//	jdbc:mysql://mysql.db.server:3306/my_database
		@DynamicPropertySource
					static void registerPgProperties(DynamicPropertyRegistry registry) {

			String URL = String.format("jdbc:mysql://%s:%d/%s", mysql.getContainerIpAddress(), mysql.getFirstMappedPort(), mysql.getDatabaseName());
			registry.add("spring.datasource.url",
					() -> URL);
			registry.add("spring.datasource.username", () -> mysql.getUsername());
			registry.add("spring.datasource.password", () -> mysql.getPassword());
		}

		@Test
		@Order(1)
		public void testRepo() {
			repo.findAll().forEach(System.out::println);
			assertEquals(3, repo.findAll().size());
		}

		@Test
		@Order(2)
		void tearDown(){
			System.out.printf("source location [%s]%n",source);
			logger1.debug("DEBUG MESSAGE");
			logger1.info("INFO MESSAGE");
			logger1.warn("WARN MESSAGE");
			logger1.error("ERROR MESSAGE");

			logger2.debug("PROBLEM @ DEBUG");
			logger2.info("PROBLEM @ INFO");
			logger2.warn("PROBLEM @ WARN");
			logger2.error("PROBLEM @ ERROR");
		}

}
