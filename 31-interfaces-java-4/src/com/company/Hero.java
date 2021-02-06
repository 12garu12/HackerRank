package com.company;

public class Hero implements Character {

    public String weapon = "The force";

    public String getWeapon() {
        return weapon;
    }

    @Override
    public void attack() {
        System.out.println("The hero attacks the enemy");
    }

    @Override
    public void heal() {
        System.out.println("the hero heals you");
    }
}
