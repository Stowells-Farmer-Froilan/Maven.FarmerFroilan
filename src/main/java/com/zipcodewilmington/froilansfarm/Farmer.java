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
        return "Yeah I be farming";
    }

    public void ride(Tractor tractor) {
    }
    @Override
    public void plant(Crop crop) {
        cropRow.add(crop);
    }

    @Override
    public void eat() {

    }
}
