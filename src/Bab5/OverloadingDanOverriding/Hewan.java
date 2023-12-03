/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab5.OverloadingDanOverriding;

/**
 *
 * @author icornermalang
 */
public class Hewan {
    public Hewan(){
        System.out.println("Konstruktor Class Hewan");
    }
    public void makan(){   // method dasar
        System.out.println("Penggolongan jenis makanan hewan yaitu :\n" +
                "1. Herbivora : hewan pemakan tumbuhan.\n" +
                "2. Karnivora : hewan pemekan daging\n" +
                "3. Omnivora : hewan pemakan tumbuhan dan daging.");
    }

}
