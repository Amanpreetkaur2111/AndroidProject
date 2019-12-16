package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class Detail_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_);

        TextView txt_view = findViewById(R.id.txtview1);
        ArrayList<String> arrayList = new ArrayList<>();

        Intent intent = getIntent();
        int i = intent.getExtras().getInt("ID");
        txt_view.setText(employee.Emp_arrayList.get(i).Alldata());
    }
}
