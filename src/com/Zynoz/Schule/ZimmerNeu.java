package com.Zynoz.Schule;

/**
 * Created by Zynoz on 28.02.2017.
 */
public class ZimmerNeu {
    private boolean dusche;
    private int betten;
    private double preis;
    private int stock;
    private Kunde kunde;
    private HotelNeu hotelNeu;

    public ZimmerNeu() {
        setDusche(true);
        setBetten(2);
        setPreis(100);
        setStock(0);
        setKunde(null);
        setHotelNeu(null);
    }

    public ZimmerNeu(boolean dusche, int betten, double preis, int stock, Kunde kunde, HotelNeu hotelNeu) {
        setDusche(dusche);
        setBetten(betten);
        setPreis(preis);
        setStock(stock);
        setKunde(kunde);
        setHotelNeu(hotelNeu);
    }

    public void setDusche(boolean dusche) {
        this.dusche = dusche;
    }

    public void setBetten(int betten) {
        this.betten = betten;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setKunde(Kunde kunde) {
        this.kunde = kunde;
    }

    public void setHotelNeu(HotelNeu hotelNeu) {
        this.hotelNeu = hotelNeu;
    }

    public boolean getDusche() {
        return dusche;
    }

    public int getBetten() {
        return betten;
    }

    public double getPreis() {
        return preis;
    }

    public int getStock() {
        return stock;
    }

    public Kunde getKunde() {
        return kunde;
    }

    public HotelNeu getHotelNeu() {
        return hotelNeu;
    }

    public void printZimmer() {
        System.out.println("Zimmer:\t" + dusche + "\t" + betten + "\t" + preis + "\t" + stock + "\t" + kunde + "\t" + hotelNeu);
    }
}