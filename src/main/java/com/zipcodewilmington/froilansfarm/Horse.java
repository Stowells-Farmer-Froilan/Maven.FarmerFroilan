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

    public int eatCorn(T corn) {
        if (cornStorage.size() > 3) {
            cornEaten = 3;
        }
        return cornEaten;
    }
    public int eatTomato(T tomato) {
        if (tomatoStorage.size() > 1) {
            tomatoEaten = 1;
        }
        return tomatoEaten;
    }

    @Override
    public void eat(T extends CornStalk) {

    }
    @Override
    public String makeNoise() {
        return "I'm a horse";
    }

    @Override
    public void operates() {

    }

    // Todo: asdflk;jadsf
}




