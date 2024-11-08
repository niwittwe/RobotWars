package com.btc;

import com.btc.enums.Direction;
import com.btc.models.Battlefield;
import com.btc.models.Robot;
import com.btc.views.*;

public class GameController {
    public static void main(String[] args) {
        IntroScreenView.display();

        String robotName = AskForRobotNameView.display();
        Robot robot = new Robot(robotName, 1, 1, 'Θ');
        RobotView.display(robot);

        Robot enemy = new Robot("Fieser Matz", 15, 10, '█');

        Battlefield battlefield = new Battlefield(15, 10);

        battlefield.setField(robot.getX(), robot.getY(), robot.getSymbol());
        battlefield.setField(enemy.getX(), enemy.getY(), enemy.getSymbol());

        BattlefieldView.display(battlefield);

        int newX;
        int newY;
        do {
            Direction direction = MoveRobotView.display();
            newX = robot.getX() + direction.getX();
            newY = robot.getY() + direction.getY();
        } while (!battlefield.isValidField(newX, newY));

        battlefield.setField(robot.getX(), robot.getY(), ' ');
        robot.setPosition(newX, newY);
        battlefield.setField(robot.getX(), robot.getY(), robot.getSymbol());

        BattlefieldView.display(battlefield);
    }
}