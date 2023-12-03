/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab7.Polimorfisme;

/**
 *
 * @author icornermalang
 */
public class main {
    public static void main(String[] args) {
        // Upcasting
        BangunRuang K = new Kubus(5.0);
        BangunRuang bola = new Bola(3.0);
        
        K.hitungVolume();
        K.hitungLuasPermukaan();
        
        Kubus KubusBangunRuang = (Kubus) K;
        KubusBangunRuang.hitungVolume();
        KubusBangunRuang.hitungLuasPermukaan();
//        kubusBangunRuang.hitungVolume();
//        kubusBangunRuang.hitungLuasPermukaan();
//
//        bolaBangunRuang.hitungVolume();
//        bolaBangunRuang.hitungLuasPermukaan();
//        System.out.println("========================================");
//        // Downcasting
//        if (kubusBangunRuang instanceof Kubus) {
//            Kubus kubus = (Kubus) kubusBangunRuang;
//            kubus.hitungVolume();
//            kubus.hitungLuasPermukaan();
//        }
//
//        if (bolaBangunRuang instanceof Bola) {
//            Bola bola = (Bola) bolaBangunRuang;
//            bola.hitungVolume();
//            bola.hitungLuasPermukaan();
//        }
    }
}
