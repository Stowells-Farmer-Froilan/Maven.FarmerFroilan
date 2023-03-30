package com.zipcodewilmington.froilansfarm;

public class Crop <T> extends Produce{
    private int crop;

    public void harvestCrop(){
        crop += 10;
    }
    public int getCrop(){
        return crop;
    }

}
