package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GetStarted extends AppCompatActivity {
    Button login,singup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_started);
        getSupportActionBar().hide();
        login=findViewById(R.id.buttonLogin);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendtoLogin();
            }
        });
        singup=findViewById(R.id.buttonSignUp);
        singup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendToSignUp();
            }
        });
    }
    public void sendtoLogin(){
        Intent intent=new Intent(this,Login.class);
        startActivity(intent);
    }
    public void sendToSignUp(){
        Intent intent=new Intent(this,SignUp.class);
        startActivity(intent);
    }
}