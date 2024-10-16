package org.example;

public class Main {
    public static void main(String[] args) {
        Character warrior = new Character("Clyver", 16, 14, 16, 8, 10, 12, 1, 10, 16);
        Character mage = new Character("Bob", 8, 14, 14, 18, 12, 10, 1, 6, 10);

        warrior.status();
        mage.status();
    }
}