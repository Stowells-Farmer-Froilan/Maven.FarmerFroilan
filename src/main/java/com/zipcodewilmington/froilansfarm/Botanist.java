package com.zipcodewilmington.froilansfarm;

public class Botanist<T extends Crop> extends Farmer implements NoiseMaker, Eater {
    CropRow<T> cropRow;
    public Botanist(String name) {
        super(name);
    }
    public void plant(Crop seed) {
        cropRow.add((T) seed);
    }

    public void speak() {

    }

    public void eat() {

    }
}
