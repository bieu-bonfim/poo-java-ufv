package org.example;

public class Character {
    String name, classe;
    int life, maxLife, attack, defense;
    public Character(String name, String classe, int life, int maxLife, int attack, int defense ) {
        this.name = name;
        this.classe = classe;
        this.life = life;
        this.maxLife = life;
        this.attack = attack;
        this.defense = defense;
    }

    public void status(){
        System.out.println("About: " + this.name + ", " + this.classe);
        System.out.println("Life: " + this.life + "/" + this.maxLife);
        System.out.println("Defense: " + this.defense);
        System.out.println("Attack: " + this.attack);
    }

    public void drinkPotion(int heal){
        System.out.println("drinking potion");
        this.life += heal;
    }
}

