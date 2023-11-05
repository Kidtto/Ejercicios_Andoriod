package com.example.edu.coejercicios_andoriod;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio_21 extends AppCompatActivity {

    private CheckBox chBounyour;
    private CheckBox chTampico;
    private CheckBox chChidos;
    private CheckBox chMonster;
    private CheckBox chChokisRojas;
    private CheckBox chTakisFuego;
    private Button btnSiguiente;

    private String nombres;
    private String apellidos;
    private String direccion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio21);


        nombres = getIntent().getStringExtra("Nombres");
        apellidos = getIntent().getStringExtra("Apellidos");
        direccion = getIntent().getStringExtra("Direccion");


        Iniciar();

        btnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String seleccionProductos = ObtenerProductosSeleccionados();

                Intent intent = new Intent(Ejercicio_21.this, Factura.class);
                intent.putExtra("Nombres", nombres);
                intent.putExtra("Apellidos", apellidos);
                intent.putExtra("Direccion", direccion);
                intent.putExtra("ProductosSeleccionados", seleccionProductos);
                startActivity(intent);

            }
        });
    }

    private void Iniciar() {
        chChidos = findViewById(R.id.chChidos);
        chBounyour = findViewById(R.id.chBounyour);
        chMonster = findViewById(R.id.chMonster);
        chChokisRojas = findViewById(R.id.chChokisRojas);
        chTampico = findViewById(R.id.chTampico);
        chTakisFuego = findViewById(R.id.chTakisFuego);
        btnSiguiente = findViewById(R.id.btnSG);
    }

    private String ObtenerProductosSeleccionados() {
        StringBuilder seleccionProductos = new StringBuilder();

        if (chBounyour.isChecked()) {
            seleccionProductos.append("Bounyour, ");
        }
        if (chMonster.isChecked()) {
            seleccionProductos.append("Monster, ");
        }
        if (chTampico.isChecked()) {
            seleccionProductos.append("Tampico, ");
        }
        if (chChokisRojas.isChecked()) {
            seleccionProductos.append("Chokis, ");
        }
        if (chTakisFuego.isChecked()) {
            seleccionProductos.append("Takis, ");
        }
        if (chChidos.isChecked()) {
            seleccionProductos.append("Chidos, ");
        }


        if (seleccionProductos.length() > 0) {
            seleccionProductos.setLength(seleccionProductos.length() - 2);
        }

        return seleccionProductos.toString();
    }
}
