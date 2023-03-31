package com.zipcodewilmington.froilansfarm;

public class Farmer extends Person implements NoiseMaker, Rider, Botanist{
    CropRow<Crop> cropRow;
    public Farmer(String name) {
        super(name);
    }


    public void mount() {

    }

    public void dismount() {

    }

    @Override
    public String makeNoise() {
        return "Howdy, I'm a farmer!";
    }

    public void ride(Tractor tractor) {
    }

    public void eat() {

    }
    @Override
    public void plant(Crop crop) {
        cropRow.add(crop);
    }

    @Override
    public void eat() {

    }
}
