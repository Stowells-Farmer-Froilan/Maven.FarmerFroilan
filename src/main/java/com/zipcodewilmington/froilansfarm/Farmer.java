package com.zipcodewilmington.froilansfarm;

public class Farmer extends Person implements NoiseMaker, Rider{
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
}
