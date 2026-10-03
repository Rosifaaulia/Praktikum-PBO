/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.responsiuts;

/**
 *
 * @author ASUS -REYZEN 3
 */
public class PegawaiTetap extends Pegawai {
    private int tunjangan;
    
    //constructor
    public PegawaiTetap (String namaPegawai, int gaji, int tunjangan) {
        super(namaPegawai, gaji);
        this.tunjangan = tunjangan;
    }
    
    //getter dan setter untuk tunjangan
    public int getTunjangan() {
        return tunjangan;
    }
    public void setTunjangan (int tunjangan) {
        this.tunjangan = tunjangan;
    }
    
    //override method
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Tunjangan pegawai tetap: " + tunjangan);
    }
}
