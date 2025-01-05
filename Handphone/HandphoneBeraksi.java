/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Handphone;

import Mobil.Mobil;

/**
 *
 * @author Revoherlambang
 */
public class HandphoneBeraksi {
    public static void main(String[]args){
        Handphone Hp = new Handphone();
        
        Hp.Hidupkan ="Kiw";
        Hp.LakukanPanggilan ="Cukurukuk";
        Hp.KirimSMS = "Halo Manis";
        Hp.Matikan = "Good Night Manis...";
        
        System.out.println("Hidupkan: " + Hp.Hidupkan);
        System.out.println("LakukanPanggilan: " + Hp.LakukanPanggilan);
        System.out.println("KirimSMS: " + Hp.KirimSMS);
        System.out.println("Matikan: " + Hp.Matikan);
    }
}
