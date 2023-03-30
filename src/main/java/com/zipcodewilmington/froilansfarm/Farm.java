package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

public class Farm {

    List<ChickenCoop> coopy = new ArrayList<>();
    List<Stable> stable = new ArrayList<>();

    public void addChickenCoop(ChickenCoop<Chicken> coop){
        coopy.add(coop);
    }
    public List<ChickenCoop> getChickenCoop(){
        return coopy;
    }

    public void removeChickenCoop(ChickenCoop<Chicken> coop) {
        coopy.remove(coop);

    }
}
