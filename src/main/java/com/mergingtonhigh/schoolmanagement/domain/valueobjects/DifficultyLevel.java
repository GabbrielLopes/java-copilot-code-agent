package com.mergingtonhigh.schoolmanagement.domain.valueobjects;

/**
 * Value object representing the difficulty level of an activity.
 * Activities without a specified difficulty level are suitable for all levels.
 */
public enum DifficultyLevel {
    BEGINNER("Iniciante"),
    INTERMEDIATE("Intermediário"),
    ADVANCED("Avançado");

    private final String label;

    DifficultyLevel(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
