package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText ed1,ed2;
AppCompatButton b1,b2;
String getMailId,getPassword,PrefValue;
SharedPreferences mypreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=(EditText) findViewById(R.id.mailid);
        ed2=(EditText) findViewById(R.id.paswrd);
        b1=(AppCompatButton) findViewById(R.id.loginbtn);
        b2=(AppCompatButton) findViewById(R.id.regbtn);
        mypreferences=getSharedPreferences("login",MODE_PRIVATE);
        PrefValue=mypreferences.getString("email",null);
                if(PrefValue!=null)
                {
                    Intent i = new Intent(getApplicationContext(), DashboardActivity.class);
                    startActivity(i);
                }
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getMailId = ed1.getText().toString();
                getPassword = ed2.getText().toString();
                if ((getMailId.equals("admin@gmail.com")) && (getPassword.equals("12345"))) {
                    SharedPreferences.Editor myEdit = mypreferences.edit();
                    myEdit.putString("email", getMailId);
                    myEdit.commit();
                    Intent i = new Intent(getApplicationContext(), DashboardActivity.class);
                    startActivity(i);

                } else {
                    Toast.makeText(getApplicationContext(), "invalid credentials", Toast.LENGTH_LONG).show();
                }
            }
        });


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                Intent i=new Intent(getApplicationContext(),RegisterActivity.class);
                startActivity(i);
            }
        });


}

}