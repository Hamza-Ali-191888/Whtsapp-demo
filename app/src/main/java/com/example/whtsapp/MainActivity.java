package com.example.whtsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.whtsapp.fragments.CallFragment;
import com.example.whtsapp.fragments.ChatFragment;
import com.example.whtsapp.fragments.StatusFragment;

public class MainActivity extends AppCompatActivity {
    Button btnChat,btnStatus,btnCall;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        btnCall=findViewById(R.id.Call);
        btnChat=findViewById(R.id.btnChat);
        btnStatus=findViewById(R.id.btnStatus);
        getSupportFragmentManager().beginTransaction().add(R.id.container,new ChatFragment()).commit();
        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container,new CallFragment()).commit();
            }
        });
        btnChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               getSupportFragmentManager().beginTransaction().replace(R.id.container,new ChatFragment()).commit();
            }
        });
        btnStatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container,new StatusFragment()).commit();
            }
        });

    }

}