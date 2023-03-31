package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

public class Farm {

    List<FarmHouse> coopy = new ArrayList<>();
    List<Stable> stable = new ArrayList<>();

    public void addChickenCoop(FarmHouse<Chicken> coop){
        coopy.add(coop);
    }
    public List<FarmHouse> getChickenCoop(){
        return coopy;
    }

    public void removeChickenCoop(FarmHouse<Chicken> coop) {
        coopy.remove(coop);

    }
}
