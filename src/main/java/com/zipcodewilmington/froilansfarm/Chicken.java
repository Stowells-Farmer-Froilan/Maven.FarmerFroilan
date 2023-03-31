package com.zipcodewilmington.froilansfarm;

public class Chicken extends Produce {
    Chicken chicken;
    private int eggsLaid;
    private int cornEaten;
    private int tomatoEaten;
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
    public boolean hasBeenFertilized(){
        CropDuster duster = new CropDuster();
        boolean fertilized;
        if (duster.operates() != null) {
            fertilized = true;
        } else {
            fertilized = false;
        }
        return fertilized;
    }

    public int eatCorn(){
        if (cornStorage.size() > 3){
            cornEaten = 3;
        }
        return cornEaten;
    }

    public int eatTomato(){
        if (tomatoStorage.size() > 1){
            tomatoEaten = 1;
        }
        return tomatoEaten;
    }

}
