/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.responsiuts;

/**
 *
 * @author ASUS -REYZEN 3
 */
public class PegawaiKontrak extends Pegawai {
    private int lamaKontrak;
    
    //constructor
    public PegawaiKontrak (String namaPegawai, int gaji, int lamaKontrak) {
        super(namaPegawai, gaji);
        this.lamaKontrak = lamaKontrak;
    }
    
    //getter dan setter untuk lamakontrak
    public int getLamaKontrak () {
        return lamaKontrak;
    }
    public void setLamaKontrak (int lamaKontrak) {
        this.lamaKontrak = lamaKontrak;
    }
    
    //override method
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Lama Kontrak Pegawai: " + lamaKontrak + " bulan");
    }
}
