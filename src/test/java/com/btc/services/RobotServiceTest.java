package com.btc.services;

import com.btc.models.Robot;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RobotServiceTest {

    @Test
    void checkCollision() {
        Robot robot1 = new Robot("Erster", 1, 1, '1');
        Robot robot2 = new Robot("Zweiter", 1, 1, '2');
        assertTrue(RobotService.checkCollision(robot1, robot2));

        robot1.setPosition(1,2);
        assertFalse(RobotService.checkCollision(robot1, robot2));

        robot2.setPosition(3,2);
        assertFalse(RobotService.checkCollision(robot1, robot2));
    }

    @Test
    void getWinnerReturnsOneOfTheFighters() {
        Robot robot1 = new Robot("Erster", 1, 1, '1');
        Robot robot2 = new Robot("Zweiter", 1, 1, '2');
        Robot winner = RobotService.getWinner(robot1, robot2);

        assertTrue(winner == robot1 || winner == robot2);
    }

}