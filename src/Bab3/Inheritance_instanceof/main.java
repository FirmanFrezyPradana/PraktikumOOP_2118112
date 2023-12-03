/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab3.Inheritance_instanceof;

import Bab3.Inheritance.Lingkaran;

/**
 *
 * @author icornermalang
 */


public class main {
    public static void main(String[] args) {
        lingkaran lingkaran = new lingkaran();
        Tabung tabung = new Tabung();
        System.out.println("lingkaran adalah instance dari Lingkaran => " + (lingkaran instanceof lingkaran));
        System.out.println("lingkaran adalah instance dari Tabung => " + (lingkaran instanceof Tabung));
        System.out.println("tabung adalah instance dari Lingkaran =>" + (tabung instanceof lingkaran));
        System.out.println("tabung adalah instance dari Tabung =>" + (tabung instanceof Tabung));

    }
}

//        lingkaran lkr = new lingkaran(); // memanggil constructor
//        System.out.println("Hasilnya adalah :" + lkr.hitungLuas());
//        System.out.println("======================================");
//        Tabung tbg = new Tabung();
//        System.out.println("volumenya adalah :" + tbg.hitungVolume());