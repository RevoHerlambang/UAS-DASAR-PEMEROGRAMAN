/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mahasiswa;

/**
 *
 * @author Revoherlambang
 */
public class MahasiswaBeraksi {
    public static void main (String[]args){
        Mahasiswa Kampus = new Mahasiswa();
        
        Kampus.membaca = "Revo Sedang Membaca";
        Kampus.menyontek = "Revo Ketahuan Menyontek";
        Kampus.modifikasi = "Revo Memodifikasi Codingan";
        
        Kampus.membaca();
        Kampus.menyontek();
        Kampus.modifikasi();
    }
}
