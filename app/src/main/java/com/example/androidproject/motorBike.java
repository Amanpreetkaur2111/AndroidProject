package com.example.androidproject;

public class motorBike extends E_Vehicle {

    private boolean sideCar;

    public motorBike(String model, String plate, String color,boolean sideCar) {
        super(model, plate, color);
        this.sideCar = sideCar;
    }

    public String isSideCar(){
        if(sideCar){
            return " With SideCar";
        }
        else {
            return "Without sidecar";
        }
    }

    public String data(){
        String data = super.data() + "motorCycle \n" + "Model" + super.getModel() +"\n"
                + "Plate = " + super.getPlate() + "Color = " + super.getColor() + "\n";
        data += "_" + isSideCar();
        return data;
    }

}
