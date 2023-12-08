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
        String catWinner = fightclub.fight(manuCat, sulCat);
        System.out.println("Winner : " + catWinner);
    }
}
