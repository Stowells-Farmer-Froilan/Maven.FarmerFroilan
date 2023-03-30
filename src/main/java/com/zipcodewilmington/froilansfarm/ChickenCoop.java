package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class ChickenCoop<Chicken> extends ArrayList<Chicken> {

    public int unFertilizedEggs() {
        Chicken chicken = new Chicken();
        int totalEggs = 0;
        for (Chicken chicken : chickens) {
            chicken.layEgg();
            totalEggs += chicken.getEggsLaid();
        }
        return totalEggs;
    }


}
