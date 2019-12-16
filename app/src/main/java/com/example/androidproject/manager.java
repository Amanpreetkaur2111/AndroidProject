package com.example.androidproject;

public class manager extends  employee {
    private int NbClients;
    private final int GAIN_FACTOR_CLIENTS = 500;


    public manager(String ename, int eid, int emonthly_salary, int ebirth_year, double erate, E_Vehicle vehicle, int nbClients) {
        super(ename, eid, emonthly_salary, ebirth_year, erate, vehicle);
        NbClients = nbClients;
    }

    public manager(String ename, int eid, int emonthly_salary, int ebirth_year, E_Vehicle vehicle, int nbClients) {
        super(ename, eid, emonthly_salary, ebirth_year, vehicle);
        NbClients = nbClients;
    }


    @Override
    public double AnnualIncome() {
        return super.AnnualIncome() + (NbClients * GAIN_FACTOR_CLIENTS);
    }

    @Override
    public String Alldata() {
        String data = super.Alldata() + "a manager" + " Age:" + super.getEage() + "\n";
        data += "Employee has a " + super.getVehicle().data() + "\n" + "Occupation rate =" + super.getErate()+
              "%n" + "Annual income" + "$" + super.AnnualIncome() + "\n" + "He/she has brought" + NbClients + "new Clients";
        return data;
    }
}
