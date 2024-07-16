package com.cc.java;

public class App {
    public static void main(String[] args) {
        Konto konto1 = new Konto();
        Konto konto2 = new Konto();
        Konto konto3 = new Konto();

        output("Anfangs-Kontostand von konto1: " + konto1.getKontostand());
        output("Anfangs-Kontostand von konto2: " + konto2.getKontostand());
        output("Anfangs-Kontostand von konto3: " + konto3.getKontostand());

        System.out.println("-----------------------------------------");
        
        // Kontostände ändern
        konto1.setKontostand(konto1.getKontostand() * 2);
        konto2.setKontostand(konto2.getKontostand() * 3);
        konto3.setKontostand(konto3.getKontostand() * 10);

        output("Aktueller Kontostand von konto1: " + konto1.getKontostand());
        output("Aktueller Kontostand von konto2: " + konto2.getKontostand());
        output("Aktueller Kontostand von konto3: " + konto3.getKontostand());
    }

    private static void output(String outputStr) {
        System.out.println(outputStr);
    }
}
