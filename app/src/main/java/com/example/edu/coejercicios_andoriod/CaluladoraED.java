package com.example.edu.coejercicios_andoriod;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class CaluladoraED extends AppCompatActivity {

    EditText etIngED;
    TextView tvSolution;
    Button btnCalcularED;
    Button btnRetr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caluladora_ed);

        etIngED = findViewById(R.id.etIngED);
        tvSolution = findViewById(R.id.tvSolution);
        btnCalcularED = findViewById(R.id.btnCalcularED);
        btnRetr = findViewById(R.id.btnRetr);

        btnCalcularED.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcularEdad();
            }
        });

        btnRetr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private void calcularEdad() {
        String fechaNacimientoStr = etIngED.getText().toString();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");

        try {
            Date fechaNacimiento = formatoFecha.parse(fechaNacimientoStr);
            Date fechaActual = new Date();
            long millisPerYear = TimeUnit.DAYS.toMillis(365);
            long diferencia = fechaActual.getTime() - fechaNacimiento.getTime();
            long edad = diferencia / millisPerYear;
            tvSolution.setText("Edad: " + edad + " años");
        } catch (ParseException e) {
            tvSolution.setText("Formato de fecha incorrecto");
        }
    }
}

