/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab8.StudiKasus;

/**
 *
 * @author icornermalang
 */
public class Lingkaran extends BangunDatar implements Keliling, Simetri {

    public int jari2;

    @Override
    double hitungLuas() {
        return phi * this.jari2 * this.jari2;
    }

    @Override
    public double hitungKeliling() {
        return 2 * phi * this.jari2;
    }

    @Override
    public double hitungSimetrilipat() {
        return Double.POSITIVE_INFINITY; //positif tidak terhinga
    }

    @Override
    public double hitungSimetriPutar() {
        return Double.POSITIVE_INFINITY; //positif tidak terhinga
    }

    @Override
    void tampilakanHasil() {
        System.out.println("Hasil luas lingkaran = " + hitungLuas());
        System.out.println("Hasil keliling lingkaran =" + hitungKeliling());
        System.out.println("Hasil simetri lipat lingkaran =" + hitungSimetrilipat());
        System.out.println("Hasil simetri putar lingkaran =" + hitungSimetriPutar());
    }

}
