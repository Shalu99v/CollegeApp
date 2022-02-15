
package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class DashboardActivity extends AppCompatActivity {
AppCompatButton b5,b6,b7,b8,b9,b10;
SharedPreferences mypreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        mypreferences=getSharedPreferences("login",MODE_PRIVATE)                                                                                        ;
        b10=(AppCompatButton) findViewById(R.id.logoutbtn);
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor myEdit=mypreferences.edit();
                myEdit.clear();
                myEdit.commit();
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
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
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),SearchStudentActivity.class);
                startActivity(i);
            }
        });
        b8=(AppCompatButton) findViewById(R.id.searchfac);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),SearchFacultyActivity.class);
                startActivity(i);
            }
        });
        b9=(AppCompatButton) findViewById(R.id.viewweb);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),ViewWebsiteActivity.class);
                startActivity(i);
            }
        });

    }
}