package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class RegistrationPage extends AppCompatActivity {



    TextView Fname,Lname,Byear,Msalary,Orate,Eid,Etype,Veh,Vmodel,Pnumber,Vcolor,Car_type,Side_Car,tester_bugs,program_projects,manager_clients;

    EditText editfname,editlname,byear,msalary,orate,eid,carmodel,plate,Ecar_type,Numbers;

    Spinner Semptype,Svehcolor;

    RadioGroup rgroup,rsidegroup;

    Button Reg_btn;
    String value;

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
    tester_bugs = findViewById(R.id.T_bugs);
    program_projects = findViewById(R.id.P_projects);
    manager_clients = findViewById(R.id.M_clients);



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
    Numbers = findViewById(R.id.numbers);

    // RadioGroup
    rgroup = findViewById(R.id.RGroup);
    rsidegroup = findViewById(R.id.RsideGroup);

    // Spinner
    Semptype = findViewById(R.id.Semployee_type);
    Svehcolor = findViewById(R.id.SVehicle_color);

   // Button
        Reg_btn = findViewById(R.id.btn);

    Semptype.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
         Numbers.setVisibility(View.VISIBLE);

         switch(i){
             case 1:
                 manager_clients.setVisibility(View.VISIBLE);
                 program_projects.setVisibility(View.INVISIBLE);
                 tester_bugs.setVisibility(View.INVISIBLE);
                 break;
             case 2:
                 program_projects.setVisibility(View.VISIBLE);
                 manager_clients.setVisibility(View.INVISIBLE);
                 tester_bugs.setVisibility(View.INVISIBLE);
                 break;
             case 3:
                 tester_bugs.setVisibility(View.VISIBLE);
                 program_projects.setVisibility(View.INVISIBLE);
                 manager_clients.setVisibility(View.INVISIBLE);
                 break;
              default:
                  Numbers.setVisibility(View.GONE);
                  manager_clients.setVisibility(View.GONE);
                  tester_bugs.setVisibility(View.GONE);
                  program_projects.setVisibility(View.GONE);
         }

            rgroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int i) {

                    RadioButton r_Button = (RadioButton)findViewById(i);
                    value = r_Button.getText().toString();

                    if(i == R.id.Rb1){
                        Car_type.setVisibility(View.VISIBLE);
                        Ecar_type.setVisibility(View.VISIBLE);
                        Side_Car.setVisibility(View.INVISIBLE);
                        rsidegroup.setVisibility(View.INVISIBLE);
                    }
                    else
                    {
                        Car_type.setVisibility(View.INVISIBLE);
                        Ecar_type.setVisibility(View.INVISIBLE);
                        Side_Car.setVisibility(View.VISIBLE);
                        rsidegroup.setVisibility(View.VISIBLE);
                    }
                }
            });
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    });

    Reg_btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

        }
    });



    }
}
