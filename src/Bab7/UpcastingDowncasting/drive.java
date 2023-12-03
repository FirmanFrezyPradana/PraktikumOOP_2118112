/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab7.UpcastingDowncasting;

/**
 *
 * @author icornermalang
 */
public class drive {
    public static void main(String[] args) {
        parent p = new child();
        p.nama = "firman";
        p.method();
        System.out.println("nama ="+p.nama);
        
        
        child c = (child) p;
        c.id = 1;
        System.out.println("id = "+c.id);
        c.method();
        ((parent)c).method();
    }
}
