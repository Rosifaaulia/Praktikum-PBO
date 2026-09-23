/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author ASUS -REYZEN 3
 */
public class Mobil {
    String merk;
    String model;
    int tahun;
    String warna;
    
    public String getMerk() {
        return merk;
    }
    public void setMerk(String merk) {
        this.merk = merk;
    }
    
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    
    public int getTahun() {
        return tahun;
    }
    public void setTahun(int tahun) {
        this.tahun = tahun;
    }
    
    public String getWarna() {
        return warna;
    }
    public void setWarna(String warna) {
        this.warna = warna;
    }
    
    public Mobil(String merk, String model, int tahun, String warna) {
        this.merk = merk;
        this.model = model;
        this.tahun = tahun;
        this.warna = warna;
    }
    
    void displayInfo() {
        System.out.println("Merk mobil = " + merk);
        System.out.println("Model mobil = " + model);
        System.out.println("Tahun pembuatan mobil = Tahun " + tahun);
        System.out.println("Warna mobil = " + warna);
    }
    
    void startEngine() {
        System.out.println("Mesin mobil " + merk + " menyala");
    }
    
    void gantiWarna(String warnaBaru) {
        System.out.println("Warna mobil diubah dari " + warna + " menjadi " + warnaBaru);
        setWarna(warnaBaru);
    }
}
