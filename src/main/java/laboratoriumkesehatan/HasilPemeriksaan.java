/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratoriumkesehatan;

/**
 *
 * @author User
 */

public class HasilPemeriksaan {

    private String idHasil;
    private String idPasien;
    private String hasil;
    private String status;

    public HasilPemeriksaan(String idHasil, String idPasien, String hasil, String status) {

        this.idHasil = idHasil;
        this.idPasien = idPasien;
        this.hasil = hasil;
        this.status = status;

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
    public String getHasil() {
        return hasil;
    }
    public void setHasil(String hasil) {
        this.hasil = hasil;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}