package com.btc.views;

import com.btc.models.Robot;

public class WinnerView {
    public static void display(Robot winner) {
        System.out.println(winner.getName() + " hat den Kampf gewonnen!");
    }
}
