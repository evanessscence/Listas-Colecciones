package model;

public class Medicamento {
    float precio;
    String nombre;
    int cantidad;

    public Medicamento(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Medicamento {" +
                "Nombre: '" + nombre + '\'' +
                ", Cantidad: " + cantidad +
                '}';
    }
}

