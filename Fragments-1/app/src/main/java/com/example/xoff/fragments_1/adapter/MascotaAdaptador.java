package com.example.xoff.fragments_1.adapter;


        import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.xoff.fragments_1.R;
import com.example.xoff.fragments_1.pojo.Mascota;

import java.util.ArrayList;


/**
 * Created by XOFF on 09/06/2016.
 */
public class MascotaAdaptador extends RecyclerView.Adapter<MascotaAdaptador.MascotaViewHolder>{

    ArrayList<Mascota> mascotas;
    Activity activity;

    public MascotaAdaptador(ArrayList<Mascota> mascotas){
        this.mascotas = mascotas;
    }

    @Override
    public MascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //esto le da vida a nuestro layout cardview, asocia el layout al recyclerview y lo pasa al viewHolder para obtener
        // cada elemento)views=
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascota,parent,false);
        return new MascotaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MascotaViewHolder MascotaViewHolder, int position) {
        // se llama para cada elemento de la lista, asocia cada elemento con cada view
        final Mascota mascota = mascotas.get(position);

        MascotaViewHolder.imagen.setImageResource(mascota.getFoto());
        MascotaViewHolder.nombre.setText(mascota.getNombre());
        MascotaViewHolder.likes.setText(mascota.getLikes());

/*
        MascotaViewHolder.imagen.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(activity, mascota.getNombre(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(activity, DetalleMascota.class);
                intent.putExtra("nombre", mascota.getNombre());
                intent.putExtra("imagen", mascota.getFoto());

                activity.startActivity(intent);



            }


        });

        MascotaViewHolder.imagen.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(activity, "Click en Like a " + mascota.getNombre(), Toast.LENGTH_LONG).show()  ;
            }
        });
*/
        /*
         MascotaViewHolder.btnLike.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View v) {
                Toast.makeText(activity, "Diste Like a :" + mascota.getNombre(), Toast.LENGTH_SHORT).show();
            }
        });
        */

    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    public static class MascotaViewHolder extends RecyclerView.ViewHolder{

        //declaramos todos los views del layout de mascotas

        TextView nombre;
        ImageView imagen;
        TextView likes;

        public MascotaViewHolder(View itemView) {
            super(itemView);
            nombre = (TextView)itemView.findViewById(R.id.tv_nombre);
            imagen = (ImageView)itemView.findViewById(R.id.ImageView_mascota);
            likes = (TextView)itemView.findViewById(R.id.tv_likes);


        }


    }

}


