package com.company;

public class Main {

    public static void main(String[] args) {
        Singleton calculator = Singleton.getInstance();
        System.out.println(calculator.calculator(30, 60));
    }
}
