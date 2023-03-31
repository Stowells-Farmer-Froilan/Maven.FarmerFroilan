package com.zipcodewilmington.froilansfarm;

public class EggStorage implements Storage{
    ChickenCoop coop;
    public int getUnFertilizedEggs() {
        Chicken chick = new Chicken();
        int totalEggs = 0;
        for (int i = 0; i < coop.size(); i++) {
            chick.layEgg();
            totalEggs += chick.getEggsLaid();
        }
        return totalEggs;
    }
}
