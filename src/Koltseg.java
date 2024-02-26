/*
 * Sallai András, 2024-02-19
 * Copyright (c) 2024, Sallai András
 * Licenc: MIT
 * Refaktorálva 2024-02-26, Kukta Tamara
 */

 public class Koltseg {
    private double szallitas;
    private double uzlet;
    private double javitas;

    public Koltseg(String szallitas, String uzlet, String javitas) {
        this.szallitas = Double.parseDouble(szallitas);
        this.uzlet = Double.parseDouble(uzlet);
        this.javitas = Double.parseDouble(javitas);
    }

    public double getSzallitas() {
        return szallitas;
    }

    public double getUzlet() {
        return uzlet;
    }

    public double getJavitas() {
        return javitas;
    }
}
