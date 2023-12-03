/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab8.Manusia;

/**
 *
 * @author icornermalang
 */
public abstract class orangtua {

    // Atribut
    String nama;
    int usia;

    // Konstruktor
    public orangtua(String nama, int usia) {
        this.nama = nama;
        this.usia = usia;
    }
    // Metode yang dapat diwariskan
    abstract void tidur();
    abstract void makan();
    abstract void bekerja();
    
    abstract void berenang();
}
