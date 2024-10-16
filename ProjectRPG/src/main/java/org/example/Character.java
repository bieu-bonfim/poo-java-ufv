package org.example;

public class Character {
    String name;
    int life, attack, defense;
    public Character(String name, int life, int attack, int defense ) {
        this.name = name;
        this.life = life;
        this.attack = attack;
        this.defense = defense;
    }

    public void status(){
        System.out.println("Name: " + this.name);
        System.out.println("Life: " + this.life);
        System.out.println("Defense: " + this.defense);
        System.out.println("Attack: " + this.attack);
        System.out.print("\n");
    }

    public void drinkPotion(Potion potion){
        System.out.println(this.name + " is drinking " + potion.name);
        System.out.print("\n");
        this.life += potion.heal_value;
    }

}

