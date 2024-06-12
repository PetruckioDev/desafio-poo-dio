package com.petruckio.desafiopoodio.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Course {
    private String title;
    private String description;
    private int durationInHours;

    public void calculateXp() {
        // TODO document why this method is empty
    }
}
