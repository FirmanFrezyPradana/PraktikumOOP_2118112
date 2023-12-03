/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab4.Enkapsulasi;

/**
 *
 * @author icornermalang
 */
public class Login {

    private String username, password;
    public String nama;

    public Login() {
        nama = "Firman Frezy Pradana";
        username = "Firman";
        password = "Firman123";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//     
    boolean CekLogin(String Username , String password){
        if(username.equals(getUsername()) && password.equals(getPassword())){
            return true;
        }
        return false;
    } 
//    boolean CekLogin(String Username, String password) {
//        int user = Username.compareTo(this.username);
//        int pass = password.compareTo(this.password);
//
//        if (user == 0 && pass == 0) {
//            System.out.println("Selamat datang! Anda berhasil login.");
//        } else {
//            System.out.println("Login gagal. Kata sandi salah.");
//        }
//
//        return pass == 0 && pass == 0;
//    }
}
