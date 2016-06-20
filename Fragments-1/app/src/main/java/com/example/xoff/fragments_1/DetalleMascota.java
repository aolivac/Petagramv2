package com.example.xoff.fragments_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class DetalleMascota extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_mascota);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionbar);
        setSupportActionBar(miActionBar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        Bundle parametros = getIntent().getExtras();
        String nombre   = parametros.getString(getResources().getString(R.string.pnombre));
        int    imagen   = parametros.getInt("imagen");

        TextView tvNombre   = (TextView) findViewById(R.id.tvNombre);


        tvNombre.setText(nombre);



    }
}

