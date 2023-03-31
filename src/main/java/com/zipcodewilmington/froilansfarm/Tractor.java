package com.zipcodewilmington.froilansfarm;

public class Tractor extends FarmVehicle{
    public String makeNoise(){
        return "I'm a tractor yo";
    }
    public void operates(){

        for (int i = 0; i < field.size(); i++){
            if (cropRow.type() == CornStalk){
                if (cropRow.hasBeenFertilized == true) {
                    cropRow.hasBeenHarvested = true;
                }
            } else if (cropRow.type == TomatoPlant){
                if (cropRow.hasBeenFertilized == true) {
                    cropRow.hasBeenHarvested = true;
                }
            }
        }
    }
}
