/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab5.OverloadingDanOverriding;

/**
 *
 * @author icornermalang
 */
public class MainHewan {
    public static void main(String[] args) {
     Hewan hewan = new Hewan(); // memanggil constructor
     System.out.println("Apakah hewan adalah Objek -> " + (hewan instanceof Object));
     System.out.println("Apakah hewan adalah Hewan -> " + (hewan instanceof Hewan));
     System.out.println("Apakah hewan adalah Kucing -> " + (hewan instanceof Kucing));
     hewan.makan();
     System.out.println("------------------------");
     Kucing kucing = new Kucing(); // memanggil constructor
     System.out.println("Apakah hewan adalah Objek -> " + (kucing instanceof Object));
     System.out.println("Apakah kucing adalah Hewan -> " + (kucing instanceof Hewan));
     System.out.println("Apakah kucing adalah Kucing -> " + (kucing instanceof Kucing));
     System.out.println("------------------------");
     kucing.makan();
     kucing.makan("Ikan Bandeng");
  }
}
