package com.fucci.watchman.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@ComponentScan({"com.fucci.watchman.repository", "com.fucci.watchman.core", "com.fucci.watchman.job.routine"})
public class WatchmanApplication {

    public static void main(String[] args) {
        SpringApplication.run(WatchmanApplication.class, args);
    }

}
