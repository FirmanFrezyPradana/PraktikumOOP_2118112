/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab4.Enkapsulasi;

/**
 *
 * @author icornermalang
 */
public class PembuktianEnkapsulasi {
    public String nama;
//    protected String nama;
//    String nama;
//    private String nama;
    
    public void methodPembuktianEnkapsulasi(){
        System.out.println("Nama Pengguna "+nama);
    }
    
    public static void main(String[] args) {
        PembuktianEnkapsulasi bukti = new PembuktianEnkapsulasi();
        bukti.nama = "firman";
        bukti.methodPembuktianEnkapsulasi();
    } 
}
