package com.rizkykhapidsyah.uipb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.rizkykhapidsyah.uipb.ui.*;

public class MainActivity extends AppCompatActivity {

    Button B_1_Java, B_2_Java, B_3_Java, B_4_Java, B_5_Java;
    Intent Tujuan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        B_1_Java = findViewById(R.id.B_1);
        B_2_Java = findViewById(R.id.B_2);
        B_3_Java = findViewById(R.id.B_3);
        B_4_Java = findViewById(R.id.B_4);
        B_5_Java = findViewById(R.id.B_5);

        B_1_Java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "User Interface 1", Toast.LENGTH_SHORT).show();
                Tujuan = new Intent(MainActivity.this, UserInterface1.class);
                startActivity(Tujuan);
            }
        });

        B_2_Java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "User Interface 2", Toast.LENGTH_SHORT).show();
                Tujuan = new Intent(MainActivity.this, UserInterface2.class);
                startActivity(Tujuan);
            }
        });

        B_3_Java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "User Interface 3", Toast.LENGTH_SHORT).show();
                Tujuan = new Intent(MainActivity.this, UserInterface3.class);
                startActivity(Tujuan);
            }
        });

        B_4_Java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "User Interface 4", Toast.LENGTH_SHORT).show();
                Tujuan = new Intent(MainActivity.this, UserInterface4.class);
                startActivity(Tujuan);
            }
        });

        B_5_Java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "User Interface 5", Toast.LENGTH_SHORT).show();
                Tujuan = new Intent(MainActivity.this, UserInterface5.class);
                startActivity(Tujuan);
            }
        });

    }
}