package com.example.androidproject;

public class tester extends employee {

    private int NbBugs;
    private final int GAIN_FACTOR_ERROR = 200;

    public tester(String ename, int eid, int emonthly_salary, int ebirth_year, double erate, E_Vehicle vehicle, int nbBugs) {
        super(ename, eid, emonthly_salary, ebirth_year, erate, vehicle);
        NbBugs = nbBugs;
    }

    public tester(String ename, int eid, int emonthly_salary, int ebirth_year, E_Vehicle vehicle, int nbBugs) {
        super(ename, eid, emonthly_salary, ebirth_year, vehicle);
        NbBugs = nbBugs;
    }


    @Override
    public double AnnualIncome() {
        return super.AnnualIncome() + (NbBugs * GAIN_FACTOR_ERROR);
    }

    @Override
    public String Alldata() {
        String data =  super.Alldata() + ", a tester \n" +"Age =" + super.getEage() + "\n";
        data += "Employee has a" + super.getVehicle().data() +"\n" + " Occupation rate =" + super.getErate()
                + "%n" + "Annual Income " + "$" + super.AnnualIncome() +"\n" +"He/She has brought" +
                 NbBugs + "new clients";
        return data;
    }
}
