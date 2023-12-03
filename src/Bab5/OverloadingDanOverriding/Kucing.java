/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab5.OverloadingDanOverriding;

/**
 *
 * @author icornermalang
 */
public class Kucing extends Hewan{
    public Kucing(){
        super(); // memanggil konstruktor parent Class
        System.out.println("Konstruktor Class Kucing");
    }
    
    @Override
    public void makan(){  // overriding
        System.out.println("Kucing Tergolong hewan Karnivora");
    }
    
    public void makan(String food){  // overloading
        System.out.println("Kucing makan : "+ food);
    }
}
