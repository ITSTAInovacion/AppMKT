package com.example.clair.appmkt.Modelo;

/**
 * Created by Clair on 03/06/2017.
 */

public class Categorias {
    private String nombre;
    private String descripcion;
    private int thumbnail;

    public Categorias(){

    }

    public Categorias(String name, String desc, int thumbnail){
        this.nombre = name;
        this.descripcion = desc;
        this.thumbnail = thumbnail;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }
}
