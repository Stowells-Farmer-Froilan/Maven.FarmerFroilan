package com.zipcodewilmington.froilansfarm;

public class CropDuster extends Aircraft {
    Field field;
    CropRow<Crop> cropRow;
    public String makeNoise(){
        return "I'm a crop duster yo";
    }
    public void operates(){

        for (int i = 0; i < field.size(); i++){
            if (cropRow.get(i) == CornStalk) {
                cropRow.get(i).hasBeenFertilized() = true;
            } else if (cropRow.get(i) == TomatoPlant) {
                cropRow.hasBeenFertilized() = true;
            }
        }

        for (int i = 0; i < unfertilizedEggs.size(); i++){
            eggStorage.get(i).hasBeenFertilized() = true;
        }
    }
}
