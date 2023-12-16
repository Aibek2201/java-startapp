package com.javastart.inheritance;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------------------");
        British catBritish = new British(4, "John", "Lori");
        Scottish catScottish = new Scottish(3, "Alex", "Baxter");

        catScottish.sayMeow();
        catBritish.sayMeow();

        System.out.println("Cat name: " + catScottish.getName() + " Age: " + catScottish.getAge() + " Owner " + catScottish.getOwner());
        System.out.println("Cat name: " + catBritish.getName() + " Age: " + catBritish.getAge() + " Owner " + catBritish.getOwner());

        System.out.println(catScottish.toString());
        System.out.println(catBritish.toString());

        British firstCat = new British(4, "Manu", "Ala");
        British secondCat = new British(4, "Manu", "Ala");

        System.out.println(firstCat == secondCat);
        System.out.println(firstCat.equals(secondCat));
    }
}