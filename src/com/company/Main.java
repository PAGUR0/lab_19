package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Singleton calculator = Singleton.getInstance();
        System.out.println(calculator.calculator(30, 60));
    }
}
