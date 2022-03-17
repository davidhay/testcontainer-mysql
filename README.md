###handy commands
 
```
./gradlew clean test -i

./gradlew bootBuildImage --imageName=davidxhay/customers
```

###example test output for 
`com.ealanta.test.TestApplicationTests`
```

11:44:58.663 [Test worker] INFO  org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Neither @ContextConfiguration nor @ContextHierarchy found for test class [com.ealanta.test.TestApplicationTests], using SpringBootContextLoader
11:44:58.669 [Test worker] INFO  org.springframework.test.context.support.AbstractContextLoader - Could not detect default resource locations for test class [com.ealanta.test.TestApplicationTests]: no resource found for suffixes {-context.xml, Context.groovy}.
11:44:58.670 [Test worker] INFO  org.springframework.test.context.support.AnnotationConfigContextLoaderUtils - Could not detect default configuration classes for test class [com.ealanta.test.TestApplicationTests]: TestApplicationTests does not declare any static, non-private, non-final, nested classes annotated with @Configuration.
11:44:58.768 [Test worker] INFO  org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Found @SpringBootConfiguration com.ealanta.test.TestApplication for test class com.ealanta.test.TestApplicationTests
11:44:58.846 [Test worker] INFO  org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Loaded default TestExecutionListener class names from location [META-INF/spring.factories]: [org.springframework.boot.test.autoconfigure.restdocs.RestDocsTestExecutionListener, org.springframework.boot.test.autoconfigure.web.client.MockRestServiceServerResetTestExecutionListener, org.springframework.boot.test.autoconfigure.web.servlet.MockMvcPrintOnlyOnFailureTestExecutionListener, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverTestExecutionListener, org.springframework.boot.test.autoconfigure.webservices.client.MockWebServiceServerTestExecutionListener, org.springframework.boot.test.mock.mockito.MockitoTestExecutionListener, org.springframework.boot.test.mock.mockito.ResetMocksTestExecutionListener, org.springframework.test.context.web.ServletTestExecutionListener, org.springframework.test.context.support.DirtiesContextBeforeModesTestExecutionListener, org.springframework.test.context.event.ApplicationEventsTestExecutionListener, org.springframework.test.context.support.DependencyInjectionTestExecutionListener, org.springframework.test.context.support.DirtiesContextTestExecutionListener, org.springframework.test.context.transaction.TransactionalTestExecutionListener, org.springframework.test.context.jdbc.SqlScriptsTestExecutionListener, org.springframework.test.context.event.EventPublishingTestExecutionListener]
11:44:58.867 [Test worker] INFO  org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Using TestExecutionListeners: [org.springframework.test.context.support.DirtiesContextBeforeModesTestExecutionListener@7555b920, org.springframework.test.context.event.ApplicationEventsTestExecutionListener@4152d38d, org.springframework.boot.test.mock.mockito.MockitoTestExecutionListener@3591009c, org.springframework.boot.test.autoconfigure.SpringBootDependencyInjectionTestExecutionListener@5398edd0, org.springframework.test.context.support.DirtiesContextTestExecutionListener@b5cc23a, org.springframework.test.context.transaction.TransactionalTestExecutionListener@5cc5b667, org.springframework.test.context.jdbc.SqlScriptsTestExecutionListener@61edc883, org.springframework.test.context.event.EventPublishingTestExecutionListener@758f4f03, org.springframework.boot.test.autoconfigure.restdocs.RestDocsTestExecutionListener@182f1e9a, org.springframework.boot.test.autoconfigure.web.client.MockRestServiceServerResetTestExecutionListener@6928f576, org.springframework.boot.test.autoconfigure.web.servlet.MockMvcPrintOnlyOnFailureTestExecutionListener@660e9100, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverTestExecutionListener@69f63d95, org.springframework.boot.test.autoconfigure.webservices.client.MockWebServiceServerTestExecutionListener@9cd25ff, org.springframework.boot.test.mock.mockito.ResetMocksTestExecutionListener@27e0f2f5]
11:44:58.923 [Test worker] INFO  org.testcontainers.dockerclient.DockerClientProviderStrategy - Loaded org.testcontainers.dockerclient.UnixSocketClientProviderStrategy from ~/.testcontainers.properties, will try it first
11:44:59.310 [Test worker] INFO  org.testcontainers.dockerclient.DockerClientProviderStrategy - Found Docker environment with local Unix socket (unix:///var/run/docker.sock)
11:44:59.311 [Test worker] INFO  org.testcontainers.DockerClientFactory - Docker host IP address is localhost
11:44:59.352 [Test worker] INFO  org.testcontainers.DockerClientFactory - Connected to docker: 
  Server Version: 20.10.13
  API Version: 1.41
  Operating System: Docker Desktop
  Total Memory: 5943 MB
11:44:59.355 [Test worker] INFO  org.testcontainers.utility.ImageNameSubstitutor - Image name substitution will be performed by: DefaultImageNameSubstitutor (composite of 'ConfigurationFileImageNameSubstitutor' and 'PrefixingImageNameSubstitutor')
11:44:59.527 [Test worker] INFO  org.testcontainers.utility.RegistryAuthLocator - Credential helper/store (docker-credential-desktop) does not have credentials for index.docker.io
11:45:00.169 [Test worker] INFO  org.testcontainers.DockerClientFactory - Ryuk started - will monitor and terminate Testcontainers containers on JVM exit
11:45:00.170 [Test worker] INFO  org.testcontainers.DockerClientFactory - Checking the system...
11:45:00.171 [Test worker] INFO  org.testcontainers.DockerClientFactory - ✔︎ Docker server version should be at least 1.6.0
11:45:00.291 [Test worker] INFO  org.testcontainers.DockerClientFactory - ✔︎ Docker environment should have more than 2GB free disk space
11:45:00.338 [Test worker] INFO  🐳 [mysql:8.0.28] - Creating container for image: mysql:8.0.28
11:45:00.468 [Test worker] INFO  🐳 [mysql:8.0.28] - Container mysql:8.0.28 is starting: ccf463b9176fd89e2b48650d1df46315c412fe358a42f2d535410a2436d68a9b
11:45:00.809 [Test worker] INFO  🐳 [mysql:8.0.28] - Waiting for database connection to become available at jdbc:mysql://localhost:50139/test using query 'SELECT 1'
11:45:15.155 [Test worker] INFO  🐳 [mysql:8.0.28] - Container is started (JDBC URL: jdbc:mysql://localhost:50139/test)
11:45:15.155 [Test worker] INFO  🐳 [mysql:8.0.28] - Container mysql:8.0.28 started in PT14.861667S
11:45:15.161 [Test worker] INFO  org.testcontainers.ext.ScriptUtils - Executing database script from init.sql
11:45:15.227 [Test worker] INFO  org.testcontainers.ext.ScriptUtils - Executed database script from init.sql in 65 ms.

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v2.6.4)

11:45:15.591 [Test worker] INFO  com.ealanta.test.TestApplicationTests - Starting TestApplicationTests using Java 17.0.2 on Davids-MacBook-Pro.local with PID 94073 (started by davidhay in /Users/davidhay/DEV/TESTCONTAINER/test)
11:45:15.592 [Test worker] INFO  com.ealanta.test.TestApplicationTests - The following 1 profile is active: "test"
11:45:15.869 [Test worker] INFO  org.springframework.data.repository.config.RepositoryConfigurationDelegate - Bootstrapping Spring Data JPA repositories in DEFAULT mode.
11:45:15.901 [Test worker] INFO  org.springframework.data.repository.config.RepositoryConfigurationDelegate - Finished Spring Data repository scanning in 27 ms. Found 1 JPA repository interfaces.
11:45:16.239 [Test worker] INFO  org.hibernate.jpa.internal.util.LogHelper - HHH000204: Processing PersistenceUnitInfo [name: default]
11:45:16.284 [Test worker] INFO  org.hibernate.Version - HHH000412: Hibernate ORM core version 5.6.5.Final
11:45:16.430 [Test worker] INFO  org.hibernate.annotations.common.Version - HCANN000001: Hibernate Commons Annotations {5.1.2.Final}
11:45:16.499 [Test worker] INFO  com.zaxxer.hikari.HikariDataSource - HikariPool-1 - Starting...
11:45:16.626 [Test worker] INFO  com.zaxxer.hikari.HikariDataSource - HikariPool-1 - Start completed.
11:45:16.639 [Test worker] INFO  org.hibernate.dialect.Dialect - HHH000400: Using dialect: org.hibernate.dialect.MySQL8Dialect
11:45:17.014 [Test worker] INFO  org.hibernate.engine.transaction.jta.platform.internal.JtaPlatformInitiator - HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]
11:45:17.020 [Test worker] INFO  org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean - Initialized JPA EntityManagerFactory for persistence unit 'default'
11:45:17.321 [Test worker] INFO  com.ealanta.test.TestApplicationTests - Started TestApplicationTests in 2.055 seconds (JVM running for 19.504)
Hibernate: 
    select
        customer0_.id as id1_0_,
        customer0_.name as name2_0_ 
    from
        customer customer0_
Customer(id=1, name=Tom)
Customer(id=2, name=Dick)
Customer(id=3, name=Harry)
Hibernate: 
    select
        customer0_.id as id1_0_,
        customer0_.name as name2_0_ 
    from
        customer customer0_
source location [src/main/resources/application.properties]
11:45:17.638 [Test worker] INFO  com.ealanta.test.TestApplicationTests - INFO MESSAGE
11:45:17.638 [Test worker] WARN  com.ealanta.test.TestApplicationTests - WARN MESSAGE
11:45:17.638 [Test worker] ERROR com.ealanta.test.TestApplicationTests - ERROR MESSAGE
11:45:17.638 [Test worker] WARN  com.github.dockerjava.zerodep.shaded - PROBLEM @ WARN
11:45:17.638 [Test worker] ERROR com.github.dockerjava.zerodep.shaded - PROBLEM @ ERROR
```
