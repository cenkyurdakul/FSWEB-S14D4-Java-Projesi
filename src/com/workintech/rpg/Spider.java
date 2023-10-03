package com.workintech.rpg;

public class Spider extends Monster implements Poisonable{
    public Spider(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double attack() {
        return getDamage() + poison();
    }

    @Override
    public double poison() {
        return getDamage() * 0.3;
    }
}
