package org.example.rpg;

public class Orc extends Monster implements Bleedable{
    public Orc(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double attack() {
        return getDamage() + bleed();
    }

    @Override
    public double bleed() {
        return getDamage() * 0.2;
    }
}
