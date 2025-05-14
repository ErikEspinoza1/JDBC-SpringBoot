package org.example.demojdbc.model;

public class Producto {
    private int id;
    private String nombre;
    private String precio; // Usa String solo si en la BBDD lo dejas como VARCHAR

    public Producto() {
    }

    public Producto(String nombre, String precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public Producto(String nombre) {
        this.nombre = nombre;
    }

    // Getters y Setters
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

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
}
