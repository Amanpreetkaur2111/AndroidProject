package com.example.androidproject;

import java.util.ArrayList;

public class employee {

    private String Ename;
    private int Eage,Eid,Emonthly_salary,Ebirth_year;
    private double Erate;
    private E_Vehicle vehicle;


    public employee(String ename, int eid, int emonthly_salary, int ebirth_year, double erate, E_Vehicle vehicle) {
        Ename = ename;
        Eid = eid;
        Emonthly_salary = emonthly_salary;
        Ebirth_year = ebirth_year;
        Erate = erate;
        this.Eage = getEage();
        this.vehicle = vehicle;


        if(Erate <10){
            this.Erate = 10;
        }
        else if (Erate > 100){
           this.Erate = 100;
        }
        else {
            this.Erate = Erate;
        }
    }


    public employee(String ename, int eid, int emonthly_salary, int ebirth_year, E_Vehicle vehicle) {
        Ename = ename;
        Eid = eid;
        Emonthly_salary = emonthly_salary;
        Ebirth_year = ebirth_year;
        this.vehicle = vehicle;
        this.Eage = getEage();
    }


// Getters
   public String getEname() {
        return Ename;
    }

    public int getEage() {
        return 2019 - Ebirth_year;
    }

    public int getEmonthly_salary() {
        return Emonthly_salary;
    }

    public int getEbirth_year() {
        return Ebirth_year;
    }

    public double getErate() {
        return Erate;
    }


//  Arraylist of all Employees
    public static ArrayList<employee> arrayList = new ArrayList<>();


//    Functions

    public double AnnualIncome(){
        return Emonthly_salary * 12 * Erate;
    }

//    Computed variable
    public String description(){
        return "Name" + Ename + "\n"+ "Id =" + Eid;
    }

    public String Alldata(){
        return "Name =" + Ename;
    }

    public E_Vehicle getVehicle(){
        return  vehicle;
    }
}
