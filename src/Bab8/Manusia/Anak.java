/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab8.Manusia;

/**
 *
 * @author icornermalang
 */
public class Anak extends orangtua implements Ngoding{

    public Anak(String nama, int usia) {
        super(nama, usia);
    }

    @Override
    void tidur() {
        System.out.println(this.nama+" sedang tidur.");
    }

    @Override
    void makan() {
        System.out.println(this.nama+" sedang makan.");
    }

    @Override
    void bekerja() {
        System.out.println(this.nama+" sedang bekerja.");
    }

    @Override
    void berenang() {
        System.out.println(this.nama+" karena diajari orang tua berenang maka ia pintar berenang");
    }

    @Override
    public void ngoding() {
        System.out.println(this.nama+" memiliki kemampuan ngoding ");
    }

}
