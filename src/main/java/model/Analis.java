/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author User
 */


public class Analis extends Petugas {
 
    private String spesialisasiBidang;
 
    public Analis(String id, String nama, int umur, String jenisKelamin, String spesialisasiBidang) {
        super(id, nama, umur, jenisKelamin);
        setSpesialisasiBidang(spesialisasiBidang);
    }
 
    public String getSpesialisasiBidang() {
        return spesialisasiBidang;
    }
 
    public void setSpesialisasiBidang(String spesialisasiBidang) {
        if (spesialisasiBidang != null && !spesialisasiBidang.trim().isEmpty()) {
            this.spesialisasiBidang = spesialisasiBidang;
        } else {
            System.out.println(">> ERROR: Spesialisasi tidak boleh kosong!");
        }
    }
 
    @Override
    public String tampilkanInfo() {
        return super.tampilkanInfo() + " | Peran: Analis | Spesialisasi/Bidang: " + spesialisasiBidang;
    }
 
    @Override
    public String tampilkanInfo(boolean detail) {
        if (!detail) {
            return tampilkanInfo();
        }
        return super.tampilkanInfo(true) + " | Peran: Analis | Spesialisasi/Bidang: " + spesialisasiBidang;
    }
}