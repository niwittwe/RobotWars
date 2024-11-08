package com.btc.models;

public class Robot {
    private final String name;
    private int x;
    private int y;
    private final char symbol;

    public Robot(String name, int x, int y, char symbol) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.symbol = symbol;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public char getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
