/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratoriumkesehatan;

/**
 *
 * @author User
 */


public class Pemeriksaan {

    private String idPemeriksaan;
    private String namaPemeriksaan;
    private double biaya;

    public Pemeriksaan(String idPemeriksaan, String namaPemeriksaan, double biaya) {

        this.idPemeriksaan = idPemeriksaan;
        this.namaPemeriksaan = namaPemeriksaan;
        this.biaya = biaya;

    }
    public String getIdPemeriksaan() {
        return idPemeriksaan;
    }
    public void setIdPemeriksaan(String idPemeriksaan) {
        this.idPemeriksaan = idPemeriksaan;
    }
    public String getNamaPemeriksaan() {
        return namaPemeriksaan;
    }
    public void setNamaPemeriksaan(String namaPemeriksaan) {
        this.namaPemeriksaan = namaPemeriksaan;
    }
    public double getBiaya() {
        return biaya;
    }
    public void setBiaya(double biaya) {
        this.biaya = biaya;
    }
}