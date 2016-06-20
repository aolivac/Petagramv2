package com.example.xoff.fragments_1.fragment;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.xoff.fragments_1.R;
import com.example.xoff.fragments_1.adapter.MascotaAdaptador;
import com.example.xoff.fragments_1.pojo.Mascota;

import java.util.ArrayList;

/**
 * Created by XOFF on 19/06/2016.
 */
public class RecyclerViewFragment extends android.support.v4.app.Fragment{



    ArrayList<Mascota> mascotas;
    private RecyclerView listaContactos;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.Adapter recyclerAdaptador;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);

        View v = inflater.inflate(R.layout.fragment_recyclerview, container, false);

        listaContactos = (RecyclerView) v.findViewById(R.id.rvFavoritos);


        listaContactos = (RecyclerView)v.findViewById(R.id.rvFavoritos);
        layoutManager = new LinearLayoutManager(getContext());
        listaContactos.setLayoutManager(layoutManager);


        inicializarListaContactos();
        inicializarAdaptador();


        return v;
    }

public MascotaAdaptador adaptador;
    private void inicializarAdaptador(){
        adaptador = new MascotaAdaptador(mascotas);
        listaContactos.setAdapter(adaptador);
    }


    public void inicializarListaContactos(){
        mascotas = new ArrayList<Mascota>();
        mascotas = new ArrayList<Mascota>();
        mascotas.add( new Mascota(R.drawable.perro1,"Toby",   "3"));
        mascotas.add( new Mascota(R.drawable.perro2,"Pancho", "2"));
        mascotas.add( new Mascota(R.drawable.perro3,"Titan",  "5"));
        mascotas.add( new Mascota(R.drawable.perro4,"Canelo", "2"));
        mascotas.add( new Mascota(R.drawable.perro5,"Rata",   "1"));
        mascotas.add( new Mascota(R.drawable.perro6,"Golfo",  "5"));
        mascotas.add( new Mascota(R.drawable.perro7,"Blas",   "7"));
        mascotas.add( new Mascota(R.drawable.perro8,"Flaco",  "1"));
        mascotas.add( new Mascota(R.drawable.perro9,"Daida",  "3"));
    }
}
