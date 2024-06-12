package com.petruckio.desafiopoodio.model;

import lombok.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
public class BootCamp {
    private String name;
    private String description;
    private final LocalDate startDate = LocalDate.now();
    private final LocalDate endDate = startDate.plusDays(45);
    private final Set<Developer> developers = new HashSet<>();
    private final Set<Content> contents = new LinkedHashSet<>();
}
