/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab9.Exception;

// mengimpor Scanner dan JOption ke program
import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author icornermalang
 */
public class Lat_Exception {
    public static void main(String[] args) { 
        try{
            int a ,b ,hasil;
            // membuat scanner baru
            Scanner keyboard = new Scanner(System.in);
            System.out.println("======Progam Pembagian=====");
            System.out.println("Masukkan agka 1 = ");
            a = Integer.parseInt(keyboard.next());
            System.out.println("Masukkan angka ke 2 = ");
            b = Integer.parseInt(keyboard.next());
            hasil = a/b;
            System.out.println("hasil :" + Integer.toString(hasil));
        }catch(ArithmeticException c){
            JOptionPane.showMessageDialog(null, "Nilai pembagi tidak boleh 0 !!", "Warning",2);
        }catch(NumberFormatException d){
            JOptionPane.showMessageDialog(null, "Input yang anda masukkan huruf bukan angka !!", "Warning",2);
        }finally{
            System.out.println("Trimakasi sudah menjalankan program");
        }
    }
}
