package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

public class Farm {

    List<FarmHouse> coopy;
    List<Stable> stable = new ArrayList<>();
    List<Field> field = new ArrayList<>();
    public Farm(){
        this.coopy = new ArrayList<>();
        this.stable = new ArrayList<>();
        this.field = new ArrayList<>();

    }

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
