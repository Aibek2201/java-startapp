package com.javastart.constructor;

public class SayCatService {

    public void say(Cat cat, String message) {
        String catName = cat.getName();
        String result = catName + " : " + message;
        System.out.println(result);

    }
}
