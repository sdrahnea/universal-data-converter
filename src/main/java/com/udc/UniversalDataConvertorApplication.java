package com.udc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by sdrahnea
 */
@SpringBootApplication
@EnableJpaRepositories
public class UniversalDataConvertorApplication {

    public static void main(String[] args) {
        SpringApplication.run(UniversalDataConvertorApplication.class, args);
    }
}
