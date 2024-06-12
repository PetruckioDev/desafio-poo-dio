package com.petruckio.desafiopoodio.model;

import com.petruckio.desafiopoodio.utils.UtilConstants;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public abstract class Content {
    protected final double experience = UtilConstants.getStandardExperience();
    private String title;
    private String description;

    public abstract double calculateExperience();

    @Override
    public String toString() {
        return "Content{" +
                "experience=" + experience +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
