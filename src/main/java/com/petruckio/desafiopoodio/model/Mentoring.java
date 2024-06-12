package com.petruckio.desafiopoodio.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class Mentoring extends Content {
    private LocalDate date;

    @Override
    public double calculateExperience() {
        return experience + 10d;
    }

    @Override
    public String toString() {
        return "Course{" +
                "title=" + super.getTitle() +
                ", description=" + super.getDescription() +
                ", date=" + date +
                '}';
    }
}
