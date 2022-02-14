
package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class DashboardActivity extends AppCompatActivity {
AppCompatButton b5,b6,b7,b8,b9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        b5=(AppCompatButton)findViewById(R.id.addstud);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),AddStudentActivity.class);
                startActivity(i);

            }
        });
        b6=(AppCompatButton) findViewById(R.id.addfac);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),AddFacultyActivity.class);
                startActivity(i);
            }
        });
        b7=(AppCompatButton) findViewById(R.id.searchstud);
        b8=(AppCompatButton) findViewById(R.id.searchfac);
        b9=(AppCompatButton) findViewById(R.id.viewweb);

    }
}