package com.example;

public class CamionDeReparto extends Transporte {

    private boolean tieneRefrigeracion;

    // Constructor
    public CamionDeReparto(String id, double combustible, double carga, boolean tieneRefrigeracion) {
        super(id, combustible, carga); // enviamos datos al padre
        this.tieneRefrigeracion = tieneRefrigeracion;
    }

    // Sobrescribimos viajar
    @Override
    public void viajar(int distancia) {

        int gasto = distancia / 10;

        if (tieneRefrigeracion == true) {
            gasto = gasto * 2; // consume el doble
        }

        if (getCombustible() >= gasto) {
            setCombustible(getCombustible() - gasto);
            System.out.println("Camión viajó.");
            System.out.println("Combustible restante: " + getCombustible());
        } else {
            System.out.println("No hay suficiente combustible para el camión.");
        }
    }
}
