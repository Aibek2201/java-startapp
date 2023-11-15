package com.javastart.mass;

import java.util.Scanner;

public class MainMass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] mass = new int[5];

        for (int i = 0; i < 5; i++ ) {
            mass[i] = input.nextInt();

        }
        printMass(mass);
        caseEx(9);
    }

    public static void caseEx(int dayNumber) {
        switch (dayNumber) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            default:
                System.out.println("Another");
                break;
        }
    }

    public static void printMass(int[] mass) {
        for (int el : mass) {
            System.out.println("Value: " + el);
        }
     }
}