package com.homework.arrayhomework;

import java.util.Scanner;

public class MainSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        System.out.println("Enter the operation for this numbers ");
        System.out.println("1: + \n" +
                "2: -\n" +
                "3: *\n" +
                "4: /");
        int operation = scanner.nextInt();

        switch (operation){
            case 1:
                System.out.println(firstNumber + secondNumber);
                break;
            case 2:
                System.out.println(firstNumber - secondNumber);
                break;
            case 3:
                System.out.println(firstNumber * secondNumber);
                break;
            case 4:
                System.out.println(firstNumber / secondNumber);
                break;
        }

    }
}