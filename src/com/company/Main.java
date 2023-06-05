package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Singleton calculator = Singleton.getInstance();
        calculator.setX(scanner.nextInt());
        calculator.setY(scanner.nextInt());
        System.out.println(calculator.calculator());
    }
}
