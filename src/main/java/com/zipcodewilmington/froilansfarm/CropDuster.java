package com.zipcodewilmington.froilansfarm;

public class CropDuster extends Aircraft {
    public String makeNoise(){
        return "I'm a crop duster yo";
    }
    public void operates(){

        for (int i = 0; i < field.size(); i++){
            if (cropRow.type() == CornStalk) {
                cropRow.hasBeenFertilized = true;
            } else if (cropRow.type() == TomatoPlant) {
                cropRow.hasBeenFertilized = true;
            }
        }

        for (int i = 0; i < unfertilizedEggs.size(); i++){
            egg.hasBeenFertilized = true;
        }
    }
}
