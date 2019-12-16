package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class RegistrationPage extends AppCompatActivity {



    TextView Fname,Lname,Byear,Msalary,Orate,Eid,Etype,Veh,Vmodel,Pnumber,Vcolor,Car_type,Side_Car,Work_done;

    EditText editfname,editlname,byear,msalary,orate,eid,Vehicle_model,plate,Ecar_type,Numbers;

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


    Work_done = findViewById(R.id.work);



    // Edit Text
    editfname = findViewById(R.id.editFirstName);
    editlname = findViewById(R.id.editLastName);
    Ecar_type = findViewById(R.id.EditCarType);
    byear = findViewById(R.id.birthyear);
    msalary = findViewById(R.id.monthlysalary);
    orate = findViewById(R.id.occupationrate);
    eid = findViewById(R.id.employeeid);
    //Vehicle_model = findViewById(R.id.);
    Vehicle_model = findViewById(R.id.model);
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
                 Work_done.setVisibility(View.VISIBLE);
                 Work_done.setText("# clients");
                 //program_projects.setVisibility(View.GONE);
                 //tester_bugs.setVisibility(View.GONE);
                 Numbers.setVisibility(View.VISIBLE);


                 break;
             case 2:
                 //tester_bugs.setVisibility(View.VISIBLE);
                 Work_done.setVisibility(View.VISIBLE);
                 Work_done.setText("# bugs");
                 //program_projects.setVisibility(View.GONE);
                 Numbers.setVisibility(View.VISIBLE);
                 break;
             case 3:
                 //program_projects.setVisibility(View.VISIBLE);
                 //tester_bugs.setVisibility(View.GONE);
                 Work_done.setVisibility(View.VISIBLE);
                 Work_done.setText("# projects");
                 Numbers.setVisibility(View.VISIBLE);
                 break;
              default:
                  Numbers.setVisibility(View.GONE);
                  Work_done.setVisibility(View.GONE);
                  //tester_bugs.setVisibility(View.GONE);
                  //program_projects.setVisibility(View.GONE);
         }

            rgroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int i) {

//                    RadioButton r_Button = (RadioButton)findViewById(i);
//                    value = r_Button.getText().toString();



                    if(i == R.id.Rb1){
                        Car_type.setVisibility(View.VISIBLE);
                        Ecar_type.setVisibility(View.VISIBLE);
                        Side_Car.setVisibility(View.INVISIBLE);
                        rsidegroup.setVisibility(View.INVISIBLE);
                    }

                    else if(i == R.id.Rb2)
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

         E_Vehicle E_v = new E_Vehicle(Vehicle_model.getText().toString(), plate.getText().toString(),Svehcolor.getSelectedItem().toString());
         employee emp;

         @Override
         public void onClick(View view) {

             if(!editfname.getText().toString().isEmpty() && !editlname.getText().toString().isEmpty() && !byear.getText().toString().isEmpty() &&
                !msalary.getText().toString().isEmpty() && !orate.getText().toString().isEmpty() && !eid.getText().toString().isEmpty()
                      && !Numbers.getText().toString().isEmpty() && !Vehicle_model.getText().toString().isEmpty() &&
                     !Vehicle_model.getText().toString().isEmpty() && !plate.getText().toString().isEmpty() ){

                 int id = rgroup.getCheckedRadioButtonId();

                 switch (id){

                     case R.id.Rb1:
                         E_v = new car(Vehicle_model.getText().toString(), plate.getText().toString(), Svehcolor.getSelectedItem().toString(), Vehicle_model.getText().toString());
                         break;

                     case R.id.Rb2:
                         Boolean ExistSideCar = false;

                         switch (rsidegroup.getCheckedRadioButtonId()){
                             case R.id.Rby1:
                                 ExistSideCar = true;
                                 System.out.println("SideCar yes");
                                 Log.i("YSideCar","SideCarYes");
                                 break;
                             case R.id.Rbn2:
                                 ExistSideCar = true;
                                 System.out.println("SideCar no");
                                 Log.i("NSideCar","SideCarNo");
                                 break;
                             default:
                                    break;
                         }
                         E_v = new motorBike(Vehicle_model.getText().toString(), plate.getText().toString(), Svehcolor.getSelectedItem().toString(), ExistSideCar);
                         break;
                  default:
                      break;
                 }

                 switch (Semptype.getSelectedItem().toString()){
                     case "Manager":
                         if(!Orate.getText().toString().equals("")){
                             emp = new manager(editfname.getText().toString() + "" + editlname.getText().toString(), Integer.parseInt(eid.getText().toString()),
                                     Integer.parseInt(byear.getText().toString()), Integer.parseInt(msalary.getText().toString()), Double.parseDouble(orate.getText().toString()),
                                     E_v, Integer.parseInt(Numbers.getText().toString()));}
                         else {
                             emp = new manager(editfname.getText().toString() + " " + editlname.getText().toString(), Integer.parseInt(eid.getText().toString()),
                                     Integer.parseInt(byear.getText().toString()), Integer.parseInt(msalary.getText().toString()), E_v, Integer.parseInt(Numbers.getText().toString()));
                         }
                         break;
                     case "Tester":
                         if(!Orate.getText().toString().equals("")){
                             emp = new manager(editfname.getText().toString() + "" + editlname.getText().toString(), Integer.parseInt(eid.getText().toString()),
                                     Integer.parseInt(byear.getText().toString()), Integer.parseInt(msalary.getText().toString()), Double.parseDouble(orate.getText().toString()),
                                     E_v, Integer.parseInt(Numbers.getText().toString()));}
                         else {
                             emp = new manager(editfname.getText().toString() + " " + editlname.getText().toString(), Integer.parseInt(eid.getText().toString()),
                                     Integer.parseInt(byear.getText().toString()), Integer.parseInt(msalary.getText().toString()), E_v, Integer.parseInt(Numbers.getText().toString()));
                         }
                         break;
                     case "Programmer":
                     if(!Orate.getText().toString().equals("")){
                         emp = new manager(editfname.getText().toString() + "" + editlname.getText().toString(), Integer.parseInt(eid.getText().toString()),
                                 Integer.parseInt(byear.getText().toString()), Integer.parseInt(msalary.getText().toString()), Double.parseDouble(orate.getText().toString()),
                                 E_v, Integer.parseInt(Numbers.getText().toString()));}
                     else {
                         emp = new manager(editfname.getText().toString() + " " + editlname.getText().toString(), Integer.parseInt(eid.getText().toString()),
                                 Integer.parseInt(byear.getText().toString()), Integer.parseInt(msalary.getText().toString()), E_v, Integer.parseInt(Numbers.getText().toString()));
                     }
                     break;
                 }

                 employee.Emp_arrayList.add(emp);

                 Toast.makeText(RegistrationPage.this, "Successfully registered", Toast.LENGTH_SHORT).show();
                 Intent intent = new Intent(RegistrationPage.this,MainActivity.class);
                 startActivity(intent);
             }
             else
             {
                 Toast.makeText(RegistrationPage.this,"All fields are required ", Toast.LENGTH_LONG).show();
             }
         }
     });



    }
}
