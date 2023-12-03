/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab3.Inheritance.constructorSuper;

/**
 *
 * @author icornermalang
 */
public class main {
    public static void main(String[] args) {
        Lingkaran lkr = new Lingkaran(7); // memanggil constructor
        lkr.Deskripsi();
        System.out.println("Hasilnya adalah :" + lkr.HitluasLingkaran());
        Tabung tbg = new Tabung(7,20);
        tbg.Keterangan();
        System.out.println("volumenya adalah :" + tbg.HitvolumeTabung());
    }
}

