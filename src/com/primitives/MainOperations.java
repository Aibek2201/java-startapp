package com.primitives;

public class MainOperations {
    public static void main(String[] args) {
        long  longVal = 15;
        int intVal = 14;
        short shortVal = 23;
        byte byteVal = 2;
        float floatVal = 5.2f;
        double doubleVal = 6.3;

        int result1 = shortVal + intVal;
        long result2 = longVal + intVal;
        double result3 = intVal + doubleVal;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
