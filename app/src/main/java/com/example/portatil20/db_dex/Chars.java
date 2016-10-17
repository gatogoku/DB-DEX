package com.example.portatil20.db_dex;

/**
 * Created by PORTATIL20 on 13/10/2016.
 */
public class Chars {

    private String name;
    private String descripion;
    private int imagen;

    public Chars(String titulo, int imagen, String descripion) {
        this.name = titulo;
        this.imagen = imagen;
        this.descripion = descripion;
    }

    public Chars(String titulo, String descripion) {
        this.name = titulo;
        this.descripion = descripion;
    }



    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescripion() {
        return descripion;
    }

    public void setDescripion(String descripion) {
        this.descripion = descripion;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
