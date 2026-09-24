/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author User
 */

public class Dokter extends Petugas {
 
    private String nomorSTR;
 
    public Dokter(String id, String nama, int umur, String jenisKelamin, String nomorSTR) {
        super(id, nama, umur, jenisKelamin);
        setNomorSTR(nomorSTR);
    }
 
    public String getNomorSTR() {
        return nomorSTR;
    }
 
    public void setNomorSTR(String nomorSTR) {
        if (nomorSTR != null && !nomorSTR.trim().isEmpty()) {
            this.nomorSTR = nomorSTR;
        } else {
            System.out.println(">> ERROR: Nomor STR tidak boleh kosong!");
        }
    }
 
    @Override
    public String tampilkanInfo() {
        return super.tampilkanInfo() + " | Peran: Dokter | No. STR: " + nomorSTR;
    }
 
    @Override
    public String tampilkanInfo(boolean detail) {
        if (!detail) {
            return tampilkanInfo();
        }
        return super.tampilkanInfo(true) + " | Peran: Dokter | No. STR: " + nomorSTR;
    }
}
 