package com.example.xoff.fragments_1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.xoff.fragments_1.adapter.MascotaAdaptador;
import com.example.xoff.fragments_1.pojo.Mascota;

import java.util.ArrayList;

public class Favoritos extends AppCompatActivity {

    private RecyclerView recicladorFav;
    private RecyclerView.LayoutManager layoutManagerFav;
    private RecyclerView.Adapter recyclerAdaptadorFav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritos);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Favoritos");

        ArrayList<Mascota> mascotas = new ArrayList<Mascota>();




        mascotas.add(new Mascota(R.drawable.perro1, "Toby", "3"));
        mascotas.add(new Mascota(R.drawable.perro3, "Titan", "5"));
        mascotas.add(new Mascota(R.drawable.perro4, "Canelo", "8"));
        mascotas.add(new Mascota(R.drawable.perro6, "Golfo", "2"));
        mascotas.add(new Mascota(R.drawable.perro8, "Flaco", "5"));


        recicladorFav = (RecyclerView)findViewById(R.id.rvFavoritos);
        layoutManagerFav = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false);
        recicladorFav.setLayoutManager(layoutManagerFav);

        recyclerAdaptadorFav = new MascotaAdaptador(mascotas);
        recicladorFav.setAdapter(recyclerAdaptadorFav);


    }
}
