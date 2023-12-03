/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab7.Polimorfisme;

/**
 *
 * @author icornermalang
 */
public class Kubus extends BangunRuang {
    private double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public void hitungVolume() {
        double volume = sisi * sisi * sisi;
        System.out.println("Menghitung volume kubus: " + volume);
    }

    @Override
    public void hitungLuasPermukaan() {
        double luasPermukaan = 6 * (sisi * sisi);
        System.out.println("Menghitung luas permukaan kubus: " + luasPermukaan);
    }
}
