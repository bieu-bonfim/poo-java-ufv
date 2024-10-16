package org.example;

public class Main {
    public static void main(String[] args) {
        Character warrior = new Character("Antonio", 10, 6, 8);
        Character mage = new Character("Bob",  5, 10, 6);

        warrior.status();
        mage.status();

        Potion healing_potion = new Potion("Healing potion", 5);
        Potion poison = new Potion("Poison", -3);

        warrior.drinkPotion(healing_potion);
        mage.drinkPotion(poison);

        warrior.status();
        mage.status();
    }
}