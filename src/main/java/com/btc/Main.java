package com.btc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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

        System.out.println("Bitte geben sie den Namen für ihren Roboter ein:");
        Scanner scanner = new Scanner(System.in);
        String robotName = scanner.nextLine();
        System.out.println("Ihr Roboter heißt: " + robotName);
    }
}