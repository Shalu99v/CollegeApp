package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    EditText ed3, ed4, ed5, ed6, ed7;
    AppCompatButton b3, b4;
    String getName, getMobNo, getEmail, getPass, getConPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ed3 = (EditText) findViewById(R.id.name);
        ed4 = (EditText) findViewById(R.id.mobnum);
        ed5 = (EditText) findViewById(R.id.emailid);
        ed6 = (EditText) findViewById(R.id.wordpass);
        ed7 = (EditText) findViewById(R.id.conpass);
        b3=(AppCompatButton)findViewById(R.id.registerbtn);
        b4=(AppCompatButton)findViewById(R.id.logbtn);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getName = ed3.getText().toString();
                getMobNo = ed4.getText().toString();
                getEmail = ed5.getText().toString();
                getPass = ed6.getText().toString();
                getConPass = ed7.getText().toString();

                if (getPass.equals(getConPass))
                {
                    Toast.makeText(getApplicationContext(), getName, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), getMobNo, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), getEmail, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), getPass, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), getConPass, Toast.LENGTH_LONG).show();
                }
                else
                    {
                    Toast.makeText(getApplicationContext(), "password and confirm password doesn't match", Toast.LENGTH_LONG).show();
                }
            }
        });



    }
}