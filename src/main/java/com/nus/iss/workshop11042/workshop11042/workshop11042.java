package com.nus.iss.workshop11042.workshop11042;

import java.util.Collections;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.DefaultApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class workshop11042 {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(workshop11042.class);

        String port = "8080";

        ApplicationArguments cliopts = new DefaultApplicationArguments(args);

        if (cliopts.containsOption("port"))
            port = cliopts.getOptionValues("port").get(0);

        System.out.println("Starting application on port:" + port);

        app.setDefaultProperties(Collections.singletonMap("server.port", port));

        app.run(args);
    }
    /*
     * @Bean
     * public CommonsRequestLoggingFilter log() {
     * CommonsRequestLoggingFilter logger = new CommonsRequestLoggingFilter();
     * logger.setIncludeClientInfo(true);
     * logger.setIncludeQueryString(true);
     * return logger;
     * 
     * }
     */

}
