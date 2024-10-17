package com.madzierski.daniel;

/**
 * @author student
 */
enum Position {
    ASSISTANT("Asystent"),
    LECTURER("Aduiunkt"),
    PROFESSOR("Profesor");

    private String name;

    Position(String name) {
        this.name = name;
    }
}
