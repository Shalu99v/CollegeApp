package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegActivity extends AppCompatActivity {
    EditText ed3, ed4, ed5, ed6, ed7;
    AppCompatButton b3, b4;
    String getName, getMobNo, getEmail, getPass, getConPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);
        ed3 = (EditText) findViewById(R.id.name);
        ed4 = (EditText) findViewById(R.id.mobnum);
        ed5 = (EditText) findViewById(R.id.emailid);
        ed6 = (EditText) findViewById(R.id.wordpass);
        ed7 = (EditText) findViewById(R.id.conpass);


    }
}