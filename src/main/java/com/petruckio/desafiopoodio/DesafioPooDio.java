package com.petruckio.desafiopoodio;

import com.petruckio.desafiopoodio.model.Course;
import com.petruckio.desafiopoodio.model.Mentoring;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class DesafioPooDio {

    public static void main(String[] args) {
        SpringApplication.run(DesafioPooDio.class, args);

        var courseOne = Course.builder()
                .title("Java's Course")
                .description("Description of java's course")
                .durationInHours(8)
                .build();

        var courseTwo = Course.builder()
                .title("Kotlin's Course")
                .description("Description of kotlin's course")
                .durationInHours(12)
                .build();

        var mentoringOne = Mentoring.builder()
                .title("Java's mentoring")
                .description("Description of java's mentoring")
                .date(LocalDate.of(2022, 1, 31))
                .build();

        var mentoringTwo = Mentoring.builder()
                .title("Kotlin's mentoring")
                .description("Description of kotlin's mentoring")
                .date(LocalDate.of(2022, 1, 31))
                .build();

        System.out.println(courseOne);
        System.out.println(courseTwo);
        System.out.println(mentoringOne);
        System.out.println(mentoringTwo);
    }
}
