package com.zipcodewilmington.froilansfarm;

public class Crop <T> extends Produce{
    private int crop = 0;

    public void harvestCrop() {
        crop = crop + 10;
    }

    public int getCrop() {
        return crop;
    }

}
