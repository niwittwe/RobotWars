package com.btc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        displayIntroScreen();
        String robotName = askUserForRoboterName();
        displayRobotname(robotName);
        displayBattlefield(15, 10);
    }

    /**
     * Displays a map of the battlefield
     */
    private static void displayBattlefield(int width, int height) {
        printHeaderRow(width);
        printTableBody(width, height - 1);
        printLastRow(width);
    }

    private static void printHeaderRow(int width) {
        printRow(width, "╔", "═╤", "═╗");
    }

    private static void printTableBody(int width, int height) {
        int rowCount = 0;
        while (rowCount < height) {
            printRow(width, "║", " │", " ║");
            printRow(width, "╟", "─┼", "─╢");
            rowCount++;
        }
    }

    private static void printLastRow(int width) {
        printRow(width, "║", " │", " ║");
        printRow(width, "╚", "═╧", "═╝");
    }

    private static void printRow(int width, String start, String main, String end) {
        System.out.print(start);
        int columnCount = 1;
        while (columnCount < width) {
            System.out.print(main);
            columnCount++;
        }
        System.out.println(end);
    }

    private static void displayRobotname(String robotName) {
        System.out.println("Ihr Roboter heißt: " + robotName);
    }

    private static String askUserForRoboterName() {
        System.out.println("Bitte geben sie den Namen für ihren Roboter ein:");
        Scanner scanner = new Scanner(System.in);
        String robotName = scanner.nextLine();

        return robotName;
    }

    private static void displayIntroScreen() {
        System.out.println("       __");
        System.out.println("  ___[LL]_______________________");
        System.out.println(" /                                 \\");
        System.out.println("|    _   _   _   _   _   _|      \\");
        System.out.println("|  | | | | | | | | | | | | |  __  |");
        System.out.println("|  |_| |_| |_| |_| |_| |_| |_|| |_|");
        System.out.println("|_________________________________|");
        System.out.println(" |_______________________________|");
        System.out.println();
        System.out.println("   // War Bot 1           War Bot 2 \\\\");
    }
}