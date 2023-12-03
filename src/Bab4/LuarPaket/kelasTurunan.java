/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab4.LuarPaket;
import Bab4.Enkapsulasi.PembuktianEnkapsulasi;

/**
 *
 * @author icornermalang
 */
public class kelasTurunan extends PembuktianEnkapsulasi {
    public kelasTurunan(){
        nama = "prita";
    }
    public void turunanMethod(){
        methodPembuktianEnkapsulasi();
    }
    public static void main(String[] args) {
        kelasTurunan turunan = new kelasTurunan();
        turunan.turunanMethod();
    }
}
