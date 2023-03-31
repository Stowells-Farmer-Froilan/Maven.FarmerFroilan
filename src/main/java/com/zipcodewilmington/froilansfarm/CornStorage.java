package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class CornStorage implements Storage{
    ArrayList<Corn> store;

    public int getCornStorage(){
        CornStalk stalk = new CornStalk();
        int totalCorn = 0;
        for (Corn c : store){
            stalk.harvestCorn();
            totalCorn += stalk.getCorn();
        }
        return totalCorn;
    }

}
