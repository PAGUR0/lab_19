package com.company;

public class Singleton {
    private int x;
    private int y;

    private static Singleton instance;

    private Singleton(){}

    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double calculator(){
        return 2 * x + 3.0 / y;
    }
}
