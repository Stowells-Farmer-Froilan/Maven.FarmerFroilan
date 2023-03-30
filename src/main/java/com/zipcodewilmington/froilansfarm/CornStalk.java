package com.zipcodewilmington.froilansfarm;

public class CornStalk extends Crop{
    CornStalk stalk;
    private int corn;
    public CornStalk(){
    }

    public void harvestCorn(){
        corn  = corn + 10 ;
    }

    public int getCorn(){
        return corn;
    }

}
