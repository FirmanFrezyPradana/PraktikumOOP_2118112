/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab2.Constructor;

/**
 *
 * @author icornermalang
 */
public class main {

    public static void main(String[] args) {
        // membuat objek

        Kendaraan mobil = new Kendaraan();
        System.out.println("Nama Kendaraan  : " + mobil.nama);
        System.out.println("Warna Kendaraan : " + mobil.warna);
        System.out.println("Pabrikan Kendaraan : " + mobil.pabrikan);
        System.out.println("Kecepatan maximal: " + mobil.speed + "km/jam \n");
        System.out.println("Cara kendaraan bergerak : ");
        System.out.print("Saat maju : ");
        mobil.kendaraanMaju();
        System.out.print("Saat mundur : ");
        mobil.kendaraanMundur();
        System.out.print("Saat berhenti : ");
        mobil.kendaraanBerhenti();
    }
}

//      Kendaraan mobil = new Kendaraan("lamborghini Aventador","anu-abu","Automobili-Lamborghini",356);
