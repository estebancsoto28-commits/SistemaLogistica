package com.example;

public class Transporte {

    private String idTransporte;
    private double combustible;
    private double capacidadCarga;

    public Transporte(String idTransporte, double combustible, double capacidadCarga) {
        this.idTransporte = idTransporte;
        setCombustible(combustible);
        setCapacidadCarga(capacidadCarga);
    }

    public double getCombustible() {
        return combustible;
    }

    public void setCombustible(double nivel) {
        if (nivel < 0) {
            combustible = 0;
        } else if (nivel > 100) {
            combustible = 100;
        } else {
            combustible = nivel;
        }
    }

    public void setCapacidadCarga(double carga) {
        if (carga < 0) {
            System.out.println("Carga negativa no permitida");
        } else {
            capacidadCarga = carga;
        }
    }

    public void viajar(int distancia) {
        int gasto = distancia / 10;

        if (combustible >= gasto) {
            combustible = combustible - gasto;
            System.out.println("Viaje realizado");
        } else {
            System.out.println("No hay suficiente combustible");
        }
    }
}
