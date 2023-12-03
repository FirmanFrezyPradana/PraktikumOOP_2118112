/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab4.Enkapsulasi;

/**
 *
 * @author icornermalang
 */
public class Segitiga {
    private double alas; //modifier private
    public double tinggi; //modifier public
    double Luas; //modifier default

    public void setAlas(double alas) {
        this.alas = alas;
    }
    public double getAlas() {
        return alas;
    }
    double HitLuas() { //hak akses default (tidak ada modifier)
        Luas = (getAlas() * tinggi) / 2;
        return Luas;
    }
}
