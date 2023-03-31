package com.zipcodewilmington.froilansfarm;

public class TomatoPlant extends Crop {
    TomatoPlant plant;
    private int tomato;
    public TomatoPlant(){

    }
    public void harvestTomato(){

        tomato = tomato + 10;
    }
    public int getTomato(){
        return tomato;
    }
}
