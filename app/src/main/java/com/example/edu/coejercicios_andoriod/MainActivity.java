package com.example.edu.coejercicios_andoriod;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button  btnEjercicio_1;
    Button  btnEjercicio_2 ;
    Button  btnEjercicio_3;
    Button  btnEjercicio_4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEjercicio_1 = findViewById(R.id.btnEjercicio_1);
        btnEjercicio_2 = findViewById(R.id.btnEjercicio_2);
        btnEjercicio_3 = findViewById(R.id.btnEjercicio_3);
        btnEjercicio_4 = findViewById(R.id.btnEjercicio_4);

        btnEjercicio_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent= new Intent( MainActivity.this, CaluladoraED.class);
               startActivity(intent);

            }
        });
        btnEjercicio_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Ejercicio_2.class);
                startActivity(intent);

            }
        });
        btnEjercicio_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Ejercicio_3.class);
                startActivity(intent);

            }
        });
        btnEjercicio_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Ejercicio_4.class);
                startActivity(intent);

            }
        });

    }

}