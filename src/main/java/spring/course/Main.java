package spring.course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableConfigurationProperties
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);  // Used to tell application not to exit. Other words keeps the application running until killed

    }
}