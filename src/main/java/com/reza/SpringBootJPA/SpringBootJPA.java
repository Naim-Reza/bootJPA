package com.reza.SpringBootJPA;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJPA {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootJPA.class);
    }

    private static final Logger log = LoggerFactory.getLogger(SpringBootJPA.class);
}
