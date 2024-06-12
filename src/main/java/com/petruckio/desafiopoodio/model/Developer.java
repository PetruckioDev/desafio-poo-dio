package com.petruckio.desafiopoodio.model;

import com.petruckio.desafiopoodio.exception.EmptyContentException;
import lombok.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
public class Developer {
    private String name;
    private final Set<Content> subscribedContents = new LinkedHashSet<>();
    private final Set<Content> completedContents = new LinkedHashSet<>();

    public void subscribedBootCamp(BootCamp bootCamp) {
        subscribedContents.addAll(bootCamp.getContents());
        bootCamp.getDevelopers().add(this);
    }

    public void progress() {
        if (subscribedContents.isEmpty()) {
            throw new EmptyContentException("You are not registered for any content");
        }

        subscribedContents.stream()
                .findFirst()
                .ifPresent(content -> {
                    completedContents.add(content);
                    subscribedContents.remove(content);
                });
    }

    public double calculateExperience() {
        return completedContents.stream()
                .mapToDouble(Content::getExperience).sum();
    }
}
