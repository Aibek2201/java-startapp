package com.primitives;

public class MainOperations {
    public static void main(String[] args) {
        long  longVal = 15;
        int intVal = 14;
        short shortVal = 23;
        byte byteVal = 2;
        float floatVal = 5.2f;
        double doubleVal = 6.3;

        sumOfIntAndDouble(intVal, doubleVal);
        sumOfLongAndInt(longVal, intVal);
        sumOfShortAndInt(shortVal, intVal);

    }

    public static void sumOfShortAndInt(short shortVal, int intVal) {
        System.out.println(shortVal + intVal);
    }

    public static void sumOfLongAndInt(long longVal, int intVal) {
        System.out.println(longVal + intVal);
    }

    public static void sumOfIntAndDouble(int intVal, double doubleVal) {
        System.out.println(intVal + doubleVal);
    }
}
