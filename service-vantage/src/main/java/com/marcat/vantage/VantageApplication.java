package com.marcat.vantage;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class VantageApplication {

    public static void main(String[] args) {
        SpringApplication.run(VantageApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext context) {
        return args -> {
            System.out.println("Bean dump:");

            String[] beanNames = context.getBeanDefinitionNames();
            Arrays.sort(beanNames);

            for (String name : beanNames) {
                System.out.println(name);
            }
        };
    }
}
