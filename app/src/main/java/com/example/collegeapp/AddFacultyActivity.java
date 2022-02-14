package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class AddFacultyActivity extends AppCompatActivity {
EditText ed1,ed2,ed3,ed4,ed5;
AppCompatButton b1,b2;
String getFacName,getFacDept,getQual,getMob,getEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_faculty);
        ed1= (EditText) findViewById(R.id.facname);
        ed2= (EditText) findViewById(R.id.facdep);
        ed3=(EditText) findViewById(R.id.qualification);
        ed4=(EditText) findViewById(R.id.facMobile);
        ed5=(EditText) findViewById(R.id.facemail);
        b1=(AppCompatButton) findViewById(R.id.facsubmit);
        b2=(AppCompatButton) findViewById(R.id.gotoda);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFacName=ed1.getText().toString();
                getFacDept=ed2.getText().toString();
                getQual=ed3.getText().toString();
                getMob=ed4.getText().toString();
                getEmail=ed5.getText().toString();
                Toast.makeText(getApplicationContext(),getFacName, Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),getFacDept, Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),getQual, Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),getMob, Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),getEmail, Toast.LENGTH_LONG).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),DashboardActivity.class);
                startActivity(i);
            }
        });


    }
}