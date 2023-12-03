/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab4.Enkapsulasi;
import java.util.Scanner;
/**
 *
 * @author icornermalang
 */
public class mainLogin {
    public static void main(String[] args) {
        Login loginSystem = new Login();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        boolean isAuthenticated = loginSystem.CekLogin(username, password);

        if (isAuthenticated) {
            System.out.println("Login berhasil. Selamat datang, " + loginSystem.nama + "!");
        } else {
            System.out.println("Login Gagal . Silakan periksa kembali username dan password Anda.");
        } 
    }
}
