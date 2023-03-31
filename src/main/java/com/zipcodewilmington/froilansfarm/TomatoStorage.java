package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class TomatoStorage implements Storage{
    ArrayList<Tomato> store;
    public int getTomatoStorage(){
        TomatoPlant stalk = new TomatoPlant();
        int totalTomato = 0;
        for (Tomato t : store){
            stalk.harvestTomato();
            totalTomato += stalk.getTomato();
        }
        return totalTomato;
    }

}
