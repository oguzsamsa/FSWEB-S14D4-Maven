package org.example.rpg;

public class RpgMain {
    public static void main(String[] args) {
        Monster troll  = new Troll("Troll Warrior", 5, 100);
        Monster orc = new Orc("Uruk Hai", 10, 70);

        System.out.println(troll.attack());
        System.out.println(orc.attack());
    }
}
