package com.example;

public class BuqueCarga extends Transporte {

    private int cantidadContenedores;

    // Constructor
    public BuqueCarga(String id, double combustible, double carga, int cantidadContenedores) {
        super(id, combustible, carga);
        this.cantidadContenedores = cantidadContenedores;
    }

    public void atracarEnPuerto() {
        System.out.println("El buque está listo para descargar.");
    }

    public void mostrarDatos() {
        System.out.println("ID: " + getIdTransporte());
        System.out.println("Combustible: " + getCombustible());
        System.out.println("Contenedores: " + cantidadContenedores);

        double costoViaje = getCombustible() * 10; // ejemplo simple
        System.out.println("Costo estimado del viaje: $" + costoViaje + " USD");
    }

    private String getIdTransporte() {
        throw new UnsupportedOperationException("Unimplemented method 'getIdTransporte'");
    }
}
