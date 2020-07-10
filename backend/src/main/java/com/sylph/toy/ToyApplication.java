package com.sylph.toy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class ToyApplication {

    private static String APPLICATION = "spring.config.location=classpath:/application.yml";
    private static String GOOGLE = "spring.config.location=classpath:/application-google.yml";

    public static void main(String[] args){
        new SpringApplicationBuilder(ToyApplication.class)
                .properties(APPLICATION, GOOGLE)
                .run(args);
    }

}
