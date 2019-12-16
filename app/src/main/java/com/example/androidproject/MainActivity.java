package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button add ;
    ListView listView;
    SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add = findViewById(R.id.button);
        listView = findViewById(R.id.listView);
//        searchView = findViewById(R.id.search_view);

        ArrayList<String> arrayList = new ArrayList<>();

        for (int i = 0; i <employee.Emp_arrayList.size(); i++)
        {
            arrayList.add(employee.Emp_arrayList.get(i).description());
        }

        final ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(adapter);
        adapter.notifyDataSetChanged();


        listView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,RegistrationPage.class);
                startActivity(intent);


            }
        });
    }


}
