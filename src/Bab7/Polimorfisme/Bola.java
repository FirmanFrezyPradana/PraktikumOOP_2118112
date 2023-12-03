/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab7.Polimorfisme;

/**
 *
 * @author icornermalang
 */
public class Bola extends BangunRuang{
    private double jariJari;

    public Bola(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public void hitungVolume() {
        double volume = ((4 / 3) * 3.14) *(jariJari * jariJari * jariJari);
        System.out.println("Menghitung volume bola: " + volume);
    }

    @Override
    public void hitungLuasPermukaan() {
        double luasPermukaan = (4 * 3.14) * (jariJari * jariJari);
        System.out.println("Menghitung luas permukaan bola: " + luasPermukaan);
    }
}
