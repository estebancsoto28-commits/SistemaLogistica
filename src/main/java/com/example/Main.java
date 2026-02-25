package com.example;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        CamionDeReparto camion = new CamionDeReparto("C01", 100, 500, true);
        BuqueCarga buque = new BuqueCarga("B01", 100, 2000, 50);

        camion.setCombustible(-20);
        System.out.println("Combustible después de intento inválido: " + camion.getCombustible());

        ArrayList<Transporte> flota = new ArrayList<>();

        flota.add(camion);
        flota.add(buque);

        for (Transporte t : flota) {
            t.viajar(100);
        }

        // Agregamos esto
        buque.atracarEnPuerto();
        buque.mostrarDatos();
    }
}