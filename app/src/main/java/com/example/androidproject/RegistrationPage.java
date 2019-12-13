package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class RegistrationPage extends AppCompatActivity {



    TextView Fname,Lname,Byear,Msalary,Orate,empId,empType,Veh,vModel,pnumber,vcolor;

    EditText editfname,editlname,byear,msalary,orate,eid,carmodel,plate;

    Spinner Semptype,Svehcolor;

    RadioGroup rgroup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_page);

    Fname = findViewById(R.id.firstname);
    Lname = findViewById(R.id.lastname);
    Byear = findViewById(R.id.BirthYear);
    Msalary = findViewById(R.id.MonthlySalary);
    Orate = findViewById(R.id.OccupationRate);
    empId = findViewById(R.id.employeeId);
    empType = findViewById(R.id.EmployeeType);
    Veh = findViewById(R.id.Vehicle);
    vModel = findViewById(R.id.VehicleModel);
    pnumber = findViewById(R.id.PlateNumber);
    vcolor = findViewById(R.id.VehicleColor);
    editfname = findViewById(R.id.editFirstName);
    editlname = findViewById(R.id.editLastName);
    byear = findViewById(R.id.birthyear);
    msalary = findViewById(R.id.monthlysalary);
    orate = findViewById(R.id.occupationrate);
    eid = findViewById(R.id.employeeid);
    carmodel = findViewById(R.id.model);
    plate = findViewById(R.id.plateno);
    rgroup = findViewById(R.id.RGroup);
    Semptype = findViewById(R.id.Semployee_type);
    Svehcolor = findViewById(R.id.SVehicle_color);



    }
}
