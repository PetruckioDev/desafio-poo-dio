package com.petruckio.desafiopoodio;

import com.petruckio.desafiopoodio.exception.EmptyContentException;
import com.petruckio.desafiopoodio.model.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class DesafioPooDioTests {
    private Developer devF;
    private Developer devM;
    private BootCamp bootcamp;

    @BeforeEach
    void setUp() {
        Content courseOne = Course.builder()
                .title("Java's Course")
                .description("Description of java's course")
                .durationInHours(8)
                .build();

        Content courseTwo = Course.builder()
                .title("Kotlin's Course")
                .description("Description of kotlin's course")
                .durationInHours(12)
                .build();

        Content mentoringOne = Mentoring.builder()
                .title("Java's mentoring")
                .description("Description of java's mentoring")
                .date(LocalDate.of(2022, 1, 31))
                .build();

        Content mentoringTwo = Mentoring.builder()
                .title("Kotlin's mentoring")
                .description("Description of kotlin's mentoring")
                .date(LocalDate.of(2022, 1, 31))
                .build();

        bootcamp = BootCamp.builder()
                .name("Bootcamp java developer")
                .description("Description Bootcamp java developer")
                .build();

        bootcamp.getContents().addAll(List.of(courseOne, courseTwo, mentoringOne, mentoringTwo));

        devF = Developer.builder()
                .name("Felipe")
                .build();

        devM = Developer.builder()
                .name("Maria")
                .build();
    }

    @Test
    void testBootcampSubscription() {
        devF.subscribedBootCamp(bootcamp);
        devM.subscribedBootCamp(bootcamp);

        assertEquals(4, devF.getSubscribedContents().size());
        assertEquals(4, devM.getSubscribedContents().size());
    }

    @Test
    void testProgressAndCompletion() {
        devF.subscribedBootCamp(bootcamp);
        devM.subscribedBootCamp(bootcamp);

        devF.progress();
        devF.progress();
        devM.progress();

        assertEquals(2, devF.getCompletedContents().size());
        assertEquals(2, devF.getSubscribedContents().size());

        assertEquals(1, devM.getCompletedContents().size());
        assertEquals(3, devM.getSubscribedContents().size());
    }

    @Test
    void testCalculateExperience() {
        devF.subscribedBootCamp(bootcamp);
        devF.progress();
        devF.progress();

        double expectedExperience = 10 + 10;

        assertEquals(expectedExperience, devF.calculateExperience(), 0.01);
    }

    @Test
    void testProgressThrowsExceptionWhenNoContent() {
        assertThrows(EmptyContentException.class, () -> devF.progress(), "You are not registered for any content");
    }
}