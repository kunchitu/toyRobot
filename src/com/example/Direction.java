package com.example;

public enum Direction {
    NORTH,  // ordinal = 0
    EAST,   // ordinal = 1
    SOUTH,  // ordinal = 2
    WEST;   // ordinal = 3

    public String left() {
        return values()[(ordinal() + 3) % 4].name();
    }

    public String right() {
        return values()[(ordinal() + 1) % 4].name();
    }
}
