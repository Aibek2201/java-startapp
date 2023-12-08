package com.javastart.fightclub;

public class Main {
    public static void main(String[] args) {
        Cat manuCat = new Cat();
        manuCat.setName("Manu");
        manuCat.setWeight(3);

        Cat sulCat = new Cat();
        sulCat.setName("Sulu");
        sulCat.setWeight(2);

        FightClub fightclub = new FightClub();
        System.out.println("Winner: " + fightclub.fight(manuCat, sulCat));
        sulCat.setWeight(5);
        System.out.println("Winner: " + fightclub.fight(manuCat, sulCat));
    }
}
