package org.example;

public class Main {
    public static void main(String[] args) {
        Character warrior = new Character("Antonio", "Warrior", 10, 10, 10, 10);
        Character mage = new Character("Bob", "Wizard", 10, 10, 10, 10);
        warrior.status();
        mage.status();

        warrior.takeDamage(5);
        warrior.status();
    }
}