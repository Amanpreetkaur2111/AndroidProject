package com.example.androidproject;

public class motorBike extends E_Vehicle {

    private boolean sideCar;

    public motorBike(String make, String plate, String color,boolean sideCar) {
        super(make, plate, color);
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

   

}
