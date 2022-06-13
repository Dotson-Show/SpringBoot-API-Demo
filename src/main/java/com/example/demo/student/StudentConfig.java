package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student john = new Student(
                    "John",
                    "john@example.com",
                    LocalDate.of(2000, Month.JANUARY, 1)
            );

            Student peter = new Student(
                    "Peter",
                    "peter@example.com",
                    LocalDate.of(2001, Month.JANUARY, 1)
            );

            Student mariam = new Student(
                    "Mariam",
                    "mariam@example.com",
                    LocalDate.of(2002, Month.JANUARY, 1)
            );

            studentRepository.saveAll(List.of(john, peter, mariam));
        };
    }
}
