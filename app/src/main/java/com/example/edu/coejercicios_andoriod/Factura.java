package com.example.edu.coejercicios_andoriod;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;

public class Factura extends AppCompatActivity {

    private TextView tvInfo;
    private Button btnRegreso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factura);

        tvInfo = findViewById(R.id.tvInfo);
        btnRegreso = findViewById(R.id.btnRegreso);

        Intent intent = getIntent();
        String nombres = intent.getStringExtra("Nombres");
        String apellidos = intent.getStringExtra("Apellidos");
        String direccion = intent.getStringExtra("Direccion");
        String productosSeleccionados = intent.getStringExtra("ProductosSeleccionados");

        String facturaText = "Cliente: " + nombres + " " + apellidos + "\n";
        facturaText += "Dirección: " + direccion + "\n\n";
        facturaText += "Productos Seleccionados:\n" + productosSeleccionados;

        tvInfo.setText(facturaText);



        btnRegreso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }}
