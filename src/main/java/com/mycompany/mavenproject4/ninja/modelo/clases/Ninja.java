package com.mycompany.mavenproject4.ninja.modelo.clases;

public class Ninja {
    private int id;
    private String nombre;
    private String Rango;
    private int aldea;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRango() {
        return Rango;
    }

    public void setRango(String rango) {
        Rango = rango;
    }

    public int getAldea() {
        return aldea;
    }

    public void setAldea(int aldea) {
        this.aldea = aldea;
    }

    @Override
    public String toString() {
        return "Ninja{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", Rango='" + Rango + '\'' +
                ", aldea=" + aldea +
                '}';
    }
}
