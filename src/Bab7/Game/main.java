/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab7.Game;

/**
 *
 * @author icornermalang
 */
public class main {

    public static void main(String[] args) {
        Hero hero1 = new Hero("Tanjiro", 10, 100);
        HeroStrength hero2 = new HeroStrength("Zenitsu", 20, 100);

        hero1.display();
        hero2.display();
        System.out.println("------------------------");
        //melakukan penyerangan hero1 ke herro 2
//        hero1.attact(hero2);
        //eror karena Hero 1 belum tentu hero strength ttapi hero2 sudah pasti herrostrength
        hero2.attact(hero1);
        System.out.println("------------------------");
        hero1.display();
        hero2.display();

    }
}
