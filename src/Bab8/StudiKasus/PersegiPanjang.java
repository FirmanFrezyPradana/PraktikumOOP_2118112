/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab8.StudiKasus;

/**
 *
 * @author icornermalang
 */
public class PersegiPanjang extends BangunDatar implements Keliling, Simetri {

    public double panjang;
    public double lebar;

    @Override
    double hitungLuas() {
        return this.panjang * this.lebar;
    }

    @Override
    void tampilakanHasil() {
        System.out.println("Hasil luas segitiga = " + hitungLuas());
    }

    @Override
    public double hitungKeliling() {
        return 2 * (this.panjang + this.lebar);
    }

    @Override
    public double hitungSimetrilipat() {
        return 2.0;
    }

    @Override
    public double hitungSimetriPutar() {
        return 2.0;
    }

}
