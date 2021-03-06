package by.justi1;

import org.h2.tools.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/* Information Sources
RestService:
http://websystique.com/spring-boot/spring-boot-rest-api-example/
h2 database:
http://www.springboottutorial.com/spring-boot-and-h2-in-memory-database
jpa , @Entity;
https://docs.spring.io/spring-data/jpa/docs/1.5.0.RELEASE/reference/html/jpa.repositories.html
encoder:
https://www.baeldung.com/spring-security-registration-password-encoding-bcrypt
@Configuration and @Bean:
https://docs.spring.io/spring-javaconfig/docs/1.0.0.m3/reference/html/creating-bean-definitions.html
curl guide:
https://gist.github.com/subfuzion/08c5d85437d5d4f00e58
LocalDate using @RequestParam and @DateTimeFormat:
https://www.petrikainulainen.net/programming/spring-framework/spring-from-the-trenches-parsing-date-and-time-information-from-a-request-parameter/
Rest Security Spring:
https://www.baeldung.com/securing-a-restful-web-service-with-spring-security
*/

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    org.h2.tools.Server h2Server() {
        Server server = new Server();
        try {
            server.runTool("-tcp");
            server.runTool("-tcpAllowOthers");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return server;

    }
}
