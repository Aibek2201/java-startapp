package com.javastart.constructor;

public class Main {
    public static void main(String[] args) {
        Cat loriCat = new Cat("Lori");
        SayCatService sayCatService = new SayCatService();
        sayCatService.say(loriCat, "I want to eat");

        Cat manuCat = new Cat("Manu");
        sayCatService.say(manuCat, "I want to sleep");

        SayCatService.sayMeow();
        System.out.println(SayCatService.hello);
    }
}