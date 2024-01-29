package com.mycompany.mavenproject4.mision.modelo.clases;

public class Mision {
    private int ID;
    private String descripcion;

    private String rango;

    private String recompensa;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public String getRecompensa() {
        return recompensa;
    }

    public void setRecompensa(String recompensa) {
        this.recompensa = recompensa;
    }

    @Override
    public String toString() {
        return "Mision{" +
                "ID=" + ID +
                ", descripcion='" + descripcion + '\'' +
                ", rango='" + rango + '\'' +
                ", recompensa='" + recompensa + '\'' +
                '}';
    }
}
