/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratoriumkesehatan;
import java.util.ArrayList;
/**
 *
 * @author User
 */

public class LaboratoriumService {
    private ArrayList<Pasien> daftarPasien;
    private ArrayList<Pemeriksaan> daftarPemeriksaan;
    private ArrayList<HasilPemeriksaan> daftarHasil;

    private int nextIdPasien;
    private int nextIdPemeriksaan;
    private int nextIdHasil;

    public LaboratoriumService() {

        daftarPasien = new ArrayList<>();
        daftarPemeriksaan = new ArrayList<>();
        daftarHasil = new ArrayList<>();

        nextIdPasien = 1;
        nextIdPemeriksaan = 1;
        nextIdHasil = 1;
    }
    public Pasien tambahPasien(String namaPasien, int umur, String jenisKelamin) {
        String id = "P" + nextIdPasien;
        Pasien pasienBaru = new Pasien(id, namaPasien, umur, jenisKelamin);
        daftarPasien.add(pasienBaru);
        nextIdPasien++;
        return pasienBaru;
    }
    public void tampilkanSemuaPasien() {
        if (daftarPasien.isEmpty()) {
            System.out.println("Belum ada data pasien.");
            return;
        }
        System.out.println("====================================");
        for (Pasien p : daftarPasien) {
            System.out.println("ID Pasien : " + p.getIdPasien());
            System.out.println("Nama      : " + p.getNamaPasien());
            System.out.println("Umur      : " + p.getUmur());
            System.out.println("Jenis Kelamin : " + p.getJenisKelamin());
            System.out.println("------------------------------------");

        }
    }
    public Pasien cariPasienById(String id) {
        for (Pasien p : daftarPasien) {
            if (p.getIdPasien().equals(id)) {
                return p;
            }
        }
        return null;
    }
    public boolean hapusPasien(String id) {
        Pasien pasien = cariPasienById(id);
        if (pasien == null) {
            return false;
        }
        return daftarPasien.remove(pasien);
    }
    public Pemeriksaan tambahPemeriksaan(String namaPemeriksaan, double biaya) {
        String id = "PM" + nextIdPemeriksaan;
        Pemeriksaan pemeriksaanBaru = new Pemeriksaan(
                id,
                namaPemeriksaan,
                biaya
        );
        daftarPemeriksaan.add(pemeriksaanBaru);
        nextIdPemeriksaan++;
        return pemeriksaanBaru;
    }
    public void tampilkanSemuaPemeriksaan() {
        for (Pemeriksaan p : daftarPemeriksaan) {
            System.out.println("ID Pemeriksaan : " + p.getIdPemeriksaan());
            System.out.println("Nama Pemeriksaan : " + p.getNamaPemeriksaan());
            System.out.println("Biaya : " + p.getBiaya());
            System.out.println("------------------------------------");
        }
    }
    public HasilPemeriksaan tambahHasil(String idPasien, String hasil, String status) {
        String id = "H" + nextIdHasil;
        HasilPemeriksaan hasilBaru = new HasilPemeriksaan(id, idPasien, hasil, status);
        daftarHasil.add(hasilBaru);
        nextIdHasil++;
        return hasilBaru;
    }
    public void tampilkanSemuaHasil() {
        for (HasilPemeriksaan h : daftarHasil) {

            System.out.println("ID Hasil : " + h.getIdHasil());
            System.out.println("ID Pasien : " + h.getIdPasien());
            System.out.println("Hasil : " + h.getHasil());
            System.out.println("Status : " + h.getStatus());
            System.out.println("------------------------------------");
        }
    }
}