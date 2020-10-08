package com.amrullah;

import com.amrullah.topic.TopicRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CourseAPIApp {
    public static void main(String[] args) {
        SpringApplication.run(CourseAPIApp.class, args);
    }
}
