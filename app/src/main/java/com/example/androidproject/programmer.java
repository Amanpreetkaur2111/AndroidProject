package com.example.androidproject;

public class programmer extends employee {

    private int NbProjects;
    private final int GAIN_FACTOR_CLIENT = 10;

    public programmer(String ename, int eid, int emonthly_salary, int ebirth_year, double erate, E_Vehicle vehicle, int nbProjects) {
        super(ename, eid, emonthly_salary, ebirth_year, erate, vehicle);
        NbProjects = nbProjects;
    }

    public programmer(String ename, int eid, int emonthly_salary, int ebirth_year, E_Vehicle vehicle, int nbProjects) {
        super(ename, eid, emonthly_salary, ebirth_year, vehicle);
        NbProjects = nbProjects;
    }

//    @Override
//    public double AnnualIncome() {
//        return super.AnnualIncome() + (NbProjects * GAIN_FACTOR_CLIENT);
//    }
//
//    @Override
//    public String Alldata() {
//        String Data = super.Alldata() + ",a Tester \n" + "Age = " + super.getEage() + "\n";
//        Data += "Employee has a " + super.getVehicle() + "\n" + "Occupation rate:" + super.getErate()
//                + "%n" + "Annual income = " + "$" +super.AnnualIncome() + "He/She has brought" +
//                NbProjects + "new clients";
//        return Data;
//    }
}
