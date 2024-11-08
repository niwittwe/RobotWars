package com.btc.services;

import com.btc.models.Robot;

import java.util.Random;

public class RobotService {

    public static boolean checkCollision(Robot robot, Robot enemy) {
        return (robot.getX() == enemy.getX() && robot.getY() == enemy.getY());
    }

    public static Robot getWinner(Robot robot1, Robot robot2) {
        Random random = new Random();
        return (random.nextBoolean()) ? robot1 : robot2;
    }
}
