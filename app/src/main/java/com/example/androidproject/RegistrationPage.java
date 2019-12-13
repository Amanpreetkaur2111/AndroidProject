package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class RegistrationPage extends AppCompatActivity {



    TextView Fname,Lname,Byear,Msalary,Orate,Eid,Etype,Veh,Vmodel,Pnumber,Vcolor,Car_type,Side_Car;

    EditText editfname,editlname,byear,msalary,orate,eid,carmodel,plate,Ecar_type;

    Spinner Semptype,Svehcolor;

    RadioGroup rgroup,rsidegroup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_page);
// TextView
    Fname = findViewById(R.id.firstname);
    Lname = findViewById(R.id.lastname);
    Byear = findViewById(R.id.BirthYear);
    Msalary = findViewById(R.id.MonthlySalary);
    Orate = findViewById(R.id.OccupationRate);
    Eid = findViewById(R.id.employeeId);
    Etype = findViewById(R.id.EmployeeType);
    Veh = findViewById(R.id.Vehicle);
    Vmodel = findViewById(R.id.VehicleModel);
    Pnumber = findViewById(R.id.PlateNumber);
    Vcolor = findViewById(R.id.VehicleColor);
    Car_type = findViewById(R.id.Cartype);
    Side_Car = findViewById(R.id.SideCar);


    // Edit Text
    editfname = findViewById(R.id.editFirstName);
    editlname = findViewById(R.id.editLastName);
    Ecar_type = findViewById(R.id.EditCarType);
    byear = findViewById(R.id.birthyear);
    msalary = findViewById(R.id.monthlysalary);
    orate = findViewById(R.id.occupationrate);
    eid = findViewById(R.id.employeeid);
    carmodel = findViewById(R.id.model);
    plate = findViewById(R.id.plateno);

    // RadioGroup
    rgroup = findViewById(R.id.RGroup);
    rsidegroup = findViewById(R.id.RsideGroup);

    // Spinner
    Semptype = findViewById(R.id.Semployee_type);
    Svehcolor = findViewById(R.id.SVehicle_color);



    Semptype.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    });


    }
}
