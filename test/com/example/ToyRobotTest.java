package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;

class ToyRobotTest {
    private Robot robot;

    @BeforeEach
    void setUp() {
        robot = new Robot(Direction.NORTH);
    }

    @Test
    void testValidPlace() {
        robot.place("PLACE 1,2,WEST");
        Assertions.assertEquals("X: 1| Y: 2| DIR: WEST", robot.report());
        Assertions.assertTrue(robot.getIsPlaced());
    }

    @Test
    void testInvalidPlace() {
        robot.place("PLACE 1,2,NOR");
        assertNull(robot.report());
        Assertions.assertFalse(robot.getIsPlaced());
    }

    @Test
    void testReportBeforePlace() {
        robot.move();
        robot.left();
        assertNull(robot.report());
    }

    @Test
    void testPlaceAndMove() {
        robot.place("PLACE 1, 1, NORTH");
        robot.move();
        Assertions.assertEquals("X: 1| Y: 2| DIR: NORTH", robot.report());
    }

    @Test
    void testPlaceOutOfTheTable() {
        robot.place("PLACE 6, 6, NORTH");
        assertNull(robot.report());
    }

    @Test
    void testMoveOutOfTheTable() {
        robot.place("PLACE 0, 0, SOUTH");
        robot.move();
        Assertions.assertEquals("X: 0| Y: 0| DIR: SOUTH", robot.report());
    }

    @Test
    void testTurnLeft() {
        robot.place("PLACE 0, 0, SOUTH");
        robot.left();
        Assertions.assertEquals("X: 0| Y: 0| DIR: EAST", robot.report());
    }

    @Test
    void testTurnRight() {
        robot.place("PLACE 0, 0, SOUTH");
        robot.right();
        Assertions.assertEquals("X: 0| Y: 0| DIR: WEST", robot.report());
    }
}
