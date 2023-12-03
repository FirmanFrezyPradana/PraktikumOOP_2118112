/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab8.kendaraan;

/**
 *
 * @author icornermalang
 */
public class Pesawat extends Kendaraan implements Berjalan, Terbang {

    public Pesawat(String merek) {
        super(merek);
    }

    @Override
    void carabegerak() {
        System.out.println("Pesawat bergerak dalam udara dengan menggunakan mesin-mesin yang memungkinkan untuk terbang");
    }

    @Override
    void kecepatanMax() {
        System.out.println("900 km/h");
    }

    @Override
    public void berjalan() {
        System.out.println("Pesawat " + getMerek() + " berjalan maju melalui roda yang bersentuhan langsung dengan permukaan tanah.");
    }

    @Override
    public void terbang() {
        System.out.println("Pesawat " + getMerek() + " mesin yang berkecepatan tinggi, baling2 dan sayap aerodinamic memungkinkannya pesawat untuk lepas landas, terbang, dan mendarat.");
    }

}
