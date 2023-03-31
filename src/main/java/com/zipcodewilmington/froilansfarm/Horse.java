package com.zipcodewilmington.froilansfarm;

public class Horse<T extends Edible> extends Animal implements Rideable, Eater, NoiseMaker {
    int numberHorses = 10;
    boolean beingRidden;
    int cornEaten;
    int tomatoEaten;
    public Horse() {
    }
    public int getNumberHorses() {
        return numberHorses;
    }
    public void setNumberHorses(int numberHorses) {
        this.numberHorses = numberHorses;
    }
    public void speak() {
        String noise = "I'm a horse";
    }
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

    @Override
    public void eat() {

    }

    @Override
    public void makeNoise() {

    }

    @Override
    public void operates() {

    }

    // Todo: asdflk;jadsf
}




