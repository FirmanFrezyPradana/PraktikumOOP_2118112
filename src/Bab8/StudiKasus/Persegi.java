/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab8.StudiKasus;

/**
 *
 * @author icornermalang
 */
public class Persegi extends BangunDatar implements Keliling, Simetri {

    public double sisi;

    @Override
    double hitungLuas() {
        return this.sisi * this.sisi;
    }

    @Override
    void tampilakanHasil() {
        System.out.println("Hasil luas Persegi = " + hitungLuas());
        System.out.println("Hasil keliling persegi =" + hitungKeliling());
        System.out.println("Hasil simetri lipat Persegi =" + hitungSimetrilipat());
        System.out.println("Hasil simetri putar Persegi =" + hitungSimetriPutar());
    }

    @Override
    public double hitungKeliling() {
        return 4 * this.sisi;
    }

    @Override
    public double hitungSimetrilipat() {
        return 4.0;
    }

    @Override
    public double hitungSimetriPutar() {
        return 4.0;
    }

}
