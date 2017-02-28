package com.Zynoz.Schule;

/**
 * Created by Zynoz on 28.02.2017.
 */
public class Kunde {
    private double geld = 200;
    private String ort = "Wien";
    private ZimmerNeu zimmerNeu = null;


    public Kunde(double geld, String ort, ZimmerNeu zimmerNeu) {
        this.geld = geld;
        this.ort = ort;
        this.zimmerNeu = zimmerNeu;
    }

    public void buchen(ZimmerNeu zimmerNeu, int anzPersonen) {

    }

    public void auschecken() {

    }
}