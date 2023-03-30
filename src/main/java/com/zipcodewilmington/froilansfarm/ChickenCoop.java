package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class ChickenCoop<Chicken> extends ArrayList<Chicken> {




    public int unFertilizedEggs() {
        int totalEggs = 0;
        for (Chicken chicken : ArrayList chickens) {
            chicken.layEgg();
            totalEggs += chicken.getEggsLaid();
        }
        return totalEggs;
    }


}
