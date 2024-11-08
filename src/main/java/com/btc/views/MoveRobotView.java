package com.btc.views;

import com.btc.enums.Direction;

import java.util.Scanner;

public class MoveRobotView {

    public static Direction display() {

        System.out.println("Bitte gib die Richtung an, in die sich der Roboter bewegen soll.");
        System.out.println("[N]orden, [S]üden, [O]sten, [W]esten");
        Scanner scanner = new Scanner(System.in);

        Direction direction;
        do {
            direction = Direction.fromUserInput(
                    scanner.next().toLowerCase().charAt(0)
            );
        } while (null == direction);

        return direction;
    }
}
