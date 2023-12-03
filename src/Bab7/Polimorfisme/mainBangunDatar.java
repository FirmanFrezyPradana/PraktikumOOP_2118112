/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab7.Polimorfisme;

/**
 *
 * @author icornermalang
 */
public class mainBangunDatar {
    public static void main(String[] args) {
        BangunDatar Bdatar; // instansiasi (pembuatan objek dr class) 
        System.out.println("Penerapan Polimorfisme");
        Bdatar = new Persegi(10); // objek "Bdatar" dr superclass diinisialisasi dengan SubClass persegi
        System.out.println("Luas Persegi    : "+ Bdatar.hitungLuas());
        System.out.println("Luas Keliling Persegi   : "+ Bdatar.hitungKeliling());
        System.out.println("---------------------------------------------");
        Bdatar = new lingkaran(20); // objek "Bdatar" dr superclass diinisialisasi dengan SubClass lingkaran
        System.out.println("Luas Lingkaran    : "+ Bdatar.hitungLuas());
        System.out.println("Luas Keliling Lingkaran   : "+ Bdatar.hitungKeliling());
        System.out.println("---------------------------------------------");
        
    }
}

