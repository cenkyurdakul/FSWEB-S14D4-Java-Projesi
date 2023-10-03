package com.workintech.rpg;

public class WereWolf extends Monster implements Bleedable{
    public WereWolf(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double attack() {
        return getDamage() + bleed();
    }

    @Override
    public double bleed() {
        return getDamage() * 0.25;
    }

}
