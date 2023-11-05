package com.example.edu.coejercicios_andoriod;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Ejercicio_2 extends AppCompatActivity {

    private EditText etNombres;
    private EditText etApellidos;
    private EditText etDireccion;
    private Button btnSiguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio2);

        start();

        btnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data(view);
            }
        });
    }

    private void goBuy(String nombres, String apellidos, String direccion) {
        Intent intent = new Intent(getApplicationContext(), Ejercicio_21.class);
        intent.putExtra("Nombres", nombres);
        intent.putExtra("Apellidos", apellidos);
        intent.putExtra("Direccion", direccion);

        startActivity(intent);
    }

    private void data(View view) {
        String nombres = etNombres.getText().toString().trim();
        String apellidos = etApellidos.getText().toString().trim();
        String direccion = etDireccion.getText().toString().trim();

        if (nombres.isEmpty() || apellidos.isEmpty() || direccion.isEmpty()) {
            Toast.makeText(this, "Por favor, complete todos los campos", Toast.LENGTH_SHORT).show();
        } else {
            goBuy(nombres, apellidos, direccion);
        }
    }

    private void start() {
        etNombres = findViewById(R.id.etNombres);
        etApellidos = findViewById(R.id.etApellidos);
        etDireccion = findViewById(R.id.etDireccion);

        btnSiguiente = findViewById(R.id.btnSiguiente2);
    }



        }
