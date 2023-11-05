package com.example.edu.coejercicios_andoriod;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class Ejercicio_4 extends AppCompatActivity {

    private EditText etPeso;
    private EditText etAltura;
    private RadioButton rbMetrico;
    private RadioButton rbIngles;
    private Button btnCalcular;
    private TextView tvResultado;

    private  Button btnMun;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio4);

        etPeso = findViewById(R.id.etPeso);
        etAltura = findViewById(R.id.etAltura);
        rbMetrico = findViewById(R.id.rbMetrico);
        rbIngles = findViewById(R.id.rbIngles);
        btnCalcular = findViewById(R.id.btnCalcular);
        tvResultado = findViewById(R.id.tvResultado);

        btnMun= findViewById(R.id.btnMun);
        btnMun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcularIMC();
            }
        });
    }

    private void calcularIMC() {
        float peso, altura;
        try {
            peso = Float.parseFloat(etPeso.getText().toString());
            altura = Float.parseFloat(etAltura.getText().toString());
        } catch (NumberFormatException e) {

            tvResultado.setText("Ingrese valores válidos.");
            return;
        }

        float imc = 0;

        if (rbMetrico.isChecked()) {
            imc = peso / (altura * altura);
        } else if (rbIngles.isChecked()) {
            peso = peso * 0.45f;
            altura = altura * 0.025f;
            imc = peso / (altura * altura);
        }

        mostrarResultado(imc);
    }

    @SuppressLint("SetTextI18n")
    private void mostrarResultado(float imc) {
        String clasificacion = null;

        if (imc < 18.5) {
            clasificacion = "Bajo peso";
        } else if (imc >= 18.5 && imc < 25) {
            clasificacion = "Normal";
        }
        if (imc >= 25.0 && imc < 29.9) {
            clasificacion = "Peso superior al normal";
        } else if (imc > 30.0) {
            clasificacion = "Obesidad";
        }

        tvResultado.setText("IMC: " + imc + "\n" + clasificacion);
    }
}