/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mobil;

/**
 *
 * @author Revoherlambang
 */
public class MobilBeraksi {
    public static void main(String[]args){
        Mobil mobildilan = new Mobil();
        
        mobildilan.warna ="Hitam";
        mobildilan.TahunPembuatan = 2202;
        
        System.out.println("Warna: " + mobildilan.warna);
        System.out.println("Tahun Pembuatan:" + mobildilan.TahunPembuatan);
    }
}
