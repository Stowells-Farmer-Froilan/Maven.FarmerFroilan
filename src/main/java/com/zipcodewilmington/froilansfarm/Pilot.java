package com.zipcodewilmington.froilansfarm;

public class Pilot extends Person implements NoiseMaker{
    public Pilot(String name) {
        super(name);
    }

    public String makeNoise() {
        return "Hello, I'm a pilot!";

    }
}
