package com.example.xoff.fragments_1.pojo;


/**
 * Created by XOFF on 15/06/2016.
 */
public class Mascota {
    private String nombre;
    private int    foto;
    private String likes;


    public Mascota(int foto, String nombre, String likes) {
        this.foto = foto;
        this.nombre = nombre;
        this.likes  = likes;
    }

    public String getNombre() {
        return nombre;
    }
    public void   setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int    getFoto() {
        return foto;
    }
    public void   setFoto(int foto) {
        this.foto = foto;
    }


    public String getLikes() { return likes;    }

    public void setLikes(String likes) { this.likes = likes;
    }

}
