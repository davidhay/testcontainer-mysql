package com.ealanta.test;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(properties = "spring.autoconfigure.exclude=org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration, org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration")
@ActiveProfiles("test")
public class LoggingTest {

		Logger logger = LoggerFactory.getLogger(LoggingTest.class);

		@Value("${source.location}")
		private String source;

		@Test
		void testLogging() {
			System.out.printf("source location [%s]%n",source);
			logger.debug("DEBUG MESSAGE");
			logger.info("INFO MESSAGE");
			logger.warn("WARN MESSAGE");
			logger.error("ERROR MESSAGE");
		}

}
