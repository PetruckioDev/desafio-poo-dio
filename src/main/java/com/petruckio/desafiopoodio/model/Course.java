package com.petruckio.desafiopoodio.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class Course extends Content {

    private int durationInHours;

    @Override
    public double calculateExperience() {
        return experience + 10d;
    }


    @Override
    public String toString() {
        return "Course{" +
                "title=" + super.getTitle() +
                ", description=" + super.getDescription() +
                ", durationInHours=" + durationInHours +
                '}';
    }
}

