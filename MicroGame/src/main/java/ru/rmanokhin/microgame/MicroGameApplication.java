package ru.rmanokhin.microgame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class MicroGameApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroGameApplication.class, args);
    }

}
