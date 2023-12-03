/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab7.MakanBuah;

/**
 *
 * @author icornermalang
 */
public class Pisang extends Buah {

    public Pisang() {
        this.nama = "Pisang";
    }
    @Override
    void caraMakanBuah() {
        System.out.println(nama + " dimakan dengan di Kupas kulit pisang sebelum dimakan.");
    }
}

