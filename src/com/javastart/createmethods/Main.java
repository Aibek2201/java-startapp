package com.javastart.createmethods;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int first, second;

        first = input.nextInt();
        second = input.nextInt();

        System.out.println("Sum of numbers : " + sum(first, second));


    }
    public static int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}
