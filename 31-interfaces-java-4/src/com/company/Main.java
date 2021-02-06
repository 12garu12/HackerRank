package com.company;

import java.util.Random;

public class Main {

    public static Character summonCharacter() {
        Random rand = new Random();
        int random = Math.abs(rand.nextInt());
        System.out.println(random);
        if (random % 2 == 0) {
            return new Enemy();
        } else {
            return new Hero();
        }
    }

    public static void main(String[] args) {
        // write your code here

        Enemy darthVader = new Enemy();
        Hero ObiWanKenobi = new Hero();

        darthVader.attack();
        ObiWanKenobi.attack();
        darthVader.heal();
        ObiWanKenobi.heal();
        System.out.println("Enemy weapon: " + darthVader.getWeapon());
        System.out.println("Hero weapon: " + ObiWanKenobi.getWeapon());
        Character spy = summonCharacter();
        spy.attack();
        spy.heal();

    }
}
