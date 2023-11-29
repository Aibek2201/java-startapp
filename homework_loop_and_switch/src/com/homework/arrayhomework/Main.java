package com.homework.arrayhomework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter the number for create new array :");
        Scanner inputFromCommandLine = new Scanner(System.in);
        int massLength = inputFromCommandLine.nextInt();
        int mass[] = new int[massLength];
        Random random = new Random();

        for (int i = 0; i < mass.length; i++){
            mass[i] = random.nextInt(30);
        }
        System.out.println("Your array ");
        System.out.println(Arrays.toString(mass));

        int number = inputFromCommandLine.nextInt();
        for (int el : mass) {
            if (el == number){
                System.out.println(el);
            }
        }
        int maxEl = mass[0];
        for (int el : mass) {
            if (el > maxEl) {
                maxEl = el;
            }
        }
        System.out.println("The highest element is " + maxEl);



    }

}
