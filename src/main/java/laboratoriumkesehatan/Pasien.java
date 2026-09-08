/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratoriumkesehatan;

/**
 *
 * @author User
 */

public class Pasien {

    private String idPasien;
    private String namaPasien;
    private int umur;
    private String jenisKelamin;
    
    public Pasien(String idPasien, String namaPasien, int umur, String jenisKelamin) {

        this.idPasien = idPasien;
        this.namaPasien = namaPasien;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;

    }
    public String getIdPasien() {
        return idPasien;
    }
    public void setIdPasien(String idPasien) {
        this.idPasien = idPasien;
    }
    public String getNamaPasien() {
        return namaPasien;
    }
    public void setNamaPasien(String namaPasien) {
        this.namaPasien = namaPasien;
    }
    public int getUmur() {
        return umur;
    }
    public void setUmur(int umur) {
        this.umur = umur;
    }
    public String getJenisKelamin() {
        return jenisKelamin;
    }
    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
}
