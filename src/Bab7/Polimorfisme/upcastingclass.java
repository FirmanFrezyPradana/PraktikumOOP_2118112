/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab7.Polimorfisme;

/**
 *
 * @author icornermalang
 */
public class upcastingclass {
    public static void main(String[] args) {
        parent p = new child(); 
        p.name = "firman";
        System.out.println(p.name);
        p.PrintData();
        System.out.println("--------------------------------");
        
        child c = (child)p;
        c.umur=21;
        System.out.println(c.name);
        System.out.println(c.umur);
        c.PrintData();
        c.percobaan();
         System.out.println("--------------------------------");
        parent q = new child2(); 
        child2 d = (child2)q;
        d.PrintData();
        d.printD();

        
    }
}
