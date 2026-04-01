package com.example;

public class Robot {
    private static final int MAX = 5;
    private int x, y;
    private boolean isPlaced = false;
    private Direction dir;

    public Robot(Direction dir) {
        this.dir = dir;
    }

    public void place(final String input) {
        try {
            final String[] parts = input.replace("PLACE ", "").split(",");
            final int x = Integer.parseInt(parts[0].trim());
            final int y = Integer.parseInt(parts[1].trim());
            final Direction direction = Direction.valueOf(parts[2].trim().toUpperCase());

            if (isValidPlace(x, y)) {
                this.x = x;
                this.y = y;
                this.dir = direction;
                this.isPlaced = true;
            } else {
                System.out.println("Invalid input");
            }
        } catch (Exception e) {
            System.out.println("Invalid input");
        }
    }

    public boolean isValidPlace(final int x, final int y) {
        return x >= 0 && x < MAX && y >= 0 && y < MAX;
    }

    public String report() {
        if (isPlaced) return "X: " + this.x + "| Y: " + this.y + "| DIR: " + this.dir;
        return null;
    }

    public void move() {
        if (isPlaced) {
            int newX = x;
            int newY = y;
            switch (dir) {
                case NORTH -> newY++;
                case SOUTH -> newY--;
                case EAST -> newX++;
                case WEST -> newX--;
            }
            if (isValidPlace(newX, newY)) {
                x = newX;
                y = newY;
            }
        }
    }

    public void left() {
        if (isPlaced) this.dir = Direction.valueOf(this.dir.left());
    }

    public void right() {
        if (isPlaced) this.dir = Direction.valueOf(this.dir.right());
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean getIsPlaced() {
        return isPlaced;
    }

    public Direction getDir() {
        return dir;
    }
}