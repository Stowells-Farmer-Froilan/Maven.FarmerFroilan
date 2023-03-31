package com.zipcodewilmington.froilansfarm;

public class Chicken extends Animal {
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
//    public boolean hasBeenFertilized(){
//        CropDuster duster = new CropDuster();
//        boolean fertilized = false;
//        if (duster.operates() == true); {
//            fertilized = true;
//        }
//        return fertilized;
//    }

    public int eatCorn(){
        CornStorage store = new CornStorage();
        if (store.getCornStorage() > 3){
            cornEaten = 3;
        }
        return cornEaten;
    }

    public int eatTomato(){
        TomatoStorage store = new TomatoStorage();
        if (store.getTomatoStorage() > 1){
            tomatoEaten = 1;
        }
        return tomatoEaten;
    }

}
