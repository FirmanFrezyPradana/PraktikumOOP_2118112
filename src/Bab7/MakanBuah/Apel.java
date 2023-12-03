/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab7.MakanBuah;

/**
 *
 * @author icornermalang
 */
public class Apel extends Buah {
    public Apel() {
        this.nama = "apel";
    }
    // implementasi makanBuah() khusus untuk Apel
    @Override
    void caraMakanBuah() {
        System.out.println(nama + " dimakan dengan di gigit langsung.");
    }
}
