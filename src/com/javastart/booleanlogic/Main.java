package com.javastart.booleanlogic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputFromLine = new Scanner(System.in);

        int firstNumber, secondNumber;

        String inputFirstNumber = "Enter the first number";
        String inputSecondNumber = "Enter the second number";


        System.out.println(inputFirstNumber);
        firstNumber = inputFromLine.nextInt();

        System.out.println(inputSecondNumber);
        secondNumber = inputFromLine.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println("First is bigger");
        } else if (firstNumber < secondNumber) {
            System.out.println("Second is bigger");
        } else {
            System.out.println("Numbers are equal");
        }

        int a = 10;
        short b = (short)a;
        System.out.println(b);

    }
}
