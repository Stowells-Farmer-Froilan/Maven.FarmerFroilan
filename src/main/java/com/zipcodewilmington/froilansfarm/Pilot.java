package com.zipcodewilmington.froilansfarm;

public class Pilot extends Person implements Rider{
    public Pilot(String name) {
        super(name);
    }

    public String makeNoise() {
        return "Hello, I'm a pilot!";

    }

    public void mount() {

    }

    public void dismount() {

    }

    public void eat() {


    }
}
