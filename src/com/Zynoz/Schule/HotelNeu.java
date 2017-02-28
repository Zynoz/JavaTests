package com.Zynoz.Schule;
/**
 * Created by Zynoz on 28.02.2017.
 */
public class HotelNeu {
    private String ort = "Wien";
    private double kassa = 500;
    private double buchungsgebuhr = 20;
    private ZimmerNeu[] zimmerNeus;


    public HotelNeu() {
        setOrt("Wien");
        setBuchungsgebuhr(20);
        setKassa(500);
        zimmerNeus = new ZimmerNeu[10];
    }

    public HotelNeu(String ort, double kassa, double buchungsgebuhr) {
        this.ort = ort;
        this.kassa = kassa;
        this.buchungsgebuhr = buchungsgebuhr;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public double getKassa() {
        return kassa;
    }

    public void setKassa(double kassa) {
        this.kassa = kassa;
    }

    public double getBuchungsgebuhr() {
        return buchungsgebuhr;
    }

    public void setBuchungsgebuhr(double buchungsgebuhr) {
        this.buchungsgebuhr = buchungsgebuhr;
    }

    public void ausbauen(ZimmerNeu zimmerNeu) {
        if (zimmerNeu != null) {
            for (int i = 0; i < zimmerNeus.length; i++) {
                if (zimmerNeus[i] == null) {
                    zimmerNeus[i] = zimmerNeu;
                    System.out.println("Zimmer hinzugefügt");
                    break;
                }
            }
        } else {
            System.out.println("Übergebenes Zimmer ist null");
        }
    }

    public void abreissen() {
        for (int i = zimmerNeus.length - 1; i >= 0; i--) {
            if (zimmerNeus[i] != null) {
                zimmerNeus[i] = null;
                System.out.println("Zimmer abgerissen");
                break;
            }
        }
    }

    public void anmieten(ZimmerNeu zimmerNeu) {
        if (zimmerNeu != null) {
            for (int i = 0; i < zimmerNeus.length; i++) {
                if (zimmerNeus[i] == null) {
                    zimmerNeus[i] = zimmerNeu;
                    System.out.println("Zimmer angemietet");
                    break;
                }
            }
        } else {
            System.out.println("Übergebenes Zimmer ist null");
        }
    }
}