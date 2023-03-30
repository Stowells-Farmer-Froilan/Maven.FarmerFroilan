package com.zipcodewilmington.froilansfarm;

public class Chicken extends Produce{
    Chicken chicken;
//    private int numberChickens = 15;
    private int eggsLaid;
    private Object unFertilizedEgg;
    private int fertilizedEggs;

    public Chicken(){
        eggsLaid = 0;
    }

    public String makeNoise() {
        String noise = "Cluck";
        return noise;
    }

    public void layEgg(){
        eggsLaid++;
    }

    public int getEggsLaid(){
        return eggsLaid;
    }

    public boolean hasBeenFertilized(Object unFertilizedEgg){
        boolean fertilized = false;
        return fertilized;
    }

}
