package com.zipcodewilmington.froilansfarm;

public class EggStorage {
    ChickenCoop coop;
    Chicken chick;
    public int unFertilizedEggs() {
        Chicken chick = new Chicken();
        int totalEggs = 0;
        for (int i = 0; i < coop.size(); i++) {
            chick.layEgg();
            totalEggs += chick.getEggsLaid();
        }
        return totalEggs;
    }
}
