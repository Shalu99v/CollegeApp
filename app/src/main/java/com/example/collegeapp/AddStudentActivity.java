package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class AddStudentActivity extends AppCompatActivity {
    EditText ed1, ed2, ed3, ed4;
    AppCompatButton b1, b2;
    String getNam, getRoll, getAdm, getColl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_student);
        ed1=(EditText) findViewById(R.id.nam);
        ed2=(EditText) findViewById(R.id.rollno);
        ed3=(EditText) findViewById(R.id.admission);
        ed4= (EditText) findViewById(R.id.college);
        b1 = (AppCompatButton) findViewById(R.id.submit);
        b2 = (AppCompatButton) findViewById(R.id.dash);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),DashboardActivity.class);
                startActivity(i);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getNam = ed1.getText().toString();
                getRoll = ed2.getText().toString();
                getAdm = ed3.getText().toString();
                getColl = ed4.getText().toString();
                Toast.makeText(getApplicationContext(), getNam, Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(), getRoll, Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(), getAdm, Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(), getColl, Toast.LENGTH_LONG).show();
            }
        });

    }
}