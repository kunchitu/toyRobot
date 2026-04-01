package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Robot robot = new Robot(Direction.NORTH);
        final Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            final String input = scanner.nextLine().trim();
            final String line = input.toUpperCase();

            if (line.startsWith("PLACE")) {
                robot.place(line);
            } else if (line.equals("MOVE")) {
                robot.move();
            } else if (line.equals("LEFT")) {
                robot.left();
            } else if (line.equals("RIGHT")) {
                robot.right();
            } else if (line.equals("REPORT")) {
                System.out.println(robot.report());
            } else {
                System.out.println("Invalid input");
            }
        }
    }
}
