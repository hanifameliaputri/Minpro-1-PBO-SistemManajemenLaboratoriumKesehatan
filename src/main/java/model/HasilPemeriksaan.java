/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author User
 */

public final class HasilPemeriksaan {
 
    private String idHasil;
    private String idPasien;
    private String idPemeriksaan;
    private String idPetugas;
    private String hasil;
    private String status;
 
    public HasilPemeriksaan(String idHasil, String idPasien, String idPemeriksaan,
            String idPetugas, String hasil, String status) {
        this.idHasil = idHasil;
        this.idPasien = idPasien;
        this.idPemeriksaan = idPemeriksaan;
        this.idPetugas = idPetugas;
        setHasil(hasil);
        setStatus(status);
    }
 
    public String getIdHasil() {
        return idHasil;
    }
 
    public void setIdHasil(String idHasil) {
        this.idHasil = idHasil;
    }
 
    public String getIdPasien() {
        return idPasien;
    }
 
    public void setIdPasien(String idPasien) {
        this.idPasien = idPasien;
    }
 
    public String getIdPemeriksaan() {
        return idPemeriksaan;
    }
 
    public void setIdPemeriksaan(String idPemeriksaan) {
        this.idPemeriksaan = idPemeriksaan;
    }
 
    public String getIdPetugas() {
        return idPetugas;
    }
 
    public void setIdPetugas(String idPetugas) {
        this.idPetugas = idPetugas;
    }
 
    public String getHasil() {
        return hasil;
    }
 
    public void setHasil(String hasil) {
        if (hasil != null && !hasil.trim().isEmpty()) {
            this.hasil = hasil;
        } else {
            System.out.println(">> ERROR: Hasil tidak boleh kosong!");
        }
    }
 
    public String getStatus() {
        return status;
    }
 
    public void setStatus(String status) {
        if (status != null && !status.trim().isEmpty()) {
            this.status = status;
        } else {
            System.out.println(">> ERROR: Status tidak boleh kosong!");
        }
    }
}
