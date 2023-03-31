package com.zipcodewilmington.froilansfarm;

public abstract class Person implements Eater, NoiseMaker{
    private String name;


    public Person(String name){
        this.name = name;
    }

    public String getName() {return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(Crop crop) {
    }

}
