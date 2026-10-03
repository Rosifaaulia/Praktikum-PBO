/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.responsiuts;

/**
 *
 * @author ASUS -REYZEN 3
 */
public class Pegawai {
    //akses modifier private
    private String namaPegawai;
    private int gaji;
    
    //constructor
    public Pegawai (String namaPegawai, int gaji) {
        this.namaPegawai = namaPegawai;
        this.gaji = gaji;
    }
    
    //getter dan setter untuk namaPegawai
    public String getNamaPegawai() {
        return namaPegawai;
    } 
    public void setNamaPegawai(String namaPegawai) {
        this.namaPegawai = namaPegawai;
    }
    
    //getter dan setter untuk gaji
    public int getGaji() {
        return gaji;
    }
    public void setGaji(int gaji) {
        this.gaji = gaji;
    }
    
    public void tampilkanInfo() {
        System.out.println("Nama Pegawai: " + namaPegawai);
        System.out.println("Gaji: " + gaji);
    }
}
