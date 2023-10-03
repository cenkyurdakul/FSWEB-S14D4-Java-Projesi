package com.workintech.main;

import com.workintech.rpg.Monster;
import com.workintech.rpg.Spider;
import com.workintech.rpg.Troll;
import com.workintech.rpg.WereWolf;

public class Console {
    public static void main(String[] args) {
        Monster troll = new Troll("Shrek",1000, 40);
        System.out.println(troll.attack());

        Monster werewolf = new WereWolf("X", 700, 90);
        System.out.println(werewolf.attack());

        Monster spider = new Spider("Shelob", 400, 50);
        System.out.println(spider.attack());
    }
}
