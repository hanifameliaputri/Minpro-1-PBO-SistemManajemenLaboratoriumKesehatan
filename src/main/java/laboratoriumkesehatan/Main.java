/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package laboratoriumkesehatan;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LaboratoriumService service = new LaboratoriumService();
        boolean running = true;
        while (running) {
            tampilkanMenu();
            System.out.print("Pilih menu: ");
            int pilihan = sc.nextInt();
            switch (pilihan) {
                case 1:
                    tambahPasien(sc, service);
                    break;
                case 2:
                    System.out.println("\n=== DATA PASIEN ===");
                    service.tampilkanSemuaPasien();
                    break;
                case 3:
                    tambahPemeriksaan(sc, service);
                    break;
                case 4:
                    System.out.println("\n=== DATA PEMERIKSAAN ===");
                    service.tampilkanSemuaPemeriksaan();
                    break;
                case 5:
                    tambahHasil(sc, service);
                    break;
                case 6:
                    System.out.println("\n=== DATA HASIL PEMERIKSAAN ===");
                    service.tampilkanSemuaHasil();
                    break;
                case 7:
                    System.out.println("Terima kasih telah menggunakan Sistem Laboratorium Kesehatan.");
                    running = false;
                    break;
                default:
                    System.out.println("Menu tidak tersedia.");
            }
            System.out.println();
        }
        sc.close();
    }
    private static void tampilkanMenu() {
        System.out.println("==============================================");
        System.out.println("      SISTEM MANAJEMEN LABORATORIUM KESEHATAN");
        System.out.println("==============================================");
        System.out.println("1. Tambah Data Pasien");
        System.out.println("2. Tampilkan Semua Pasien");
        System.out.println("3. Tambah Jenis Pemeriksaan");
        System.out.println("4. Tampilkan Semua Pemeriksaan");
        System.out.println("5. Tambah Hasil Pemeriksaan");
        System.out.println("6. Tampilkan Semua Hasil");
        System.out.println("7. Keluar");
        System.out.println("==============================================");
    }
    private static void tambahPasien(Scanner sc, LaboratoriumService service) {
        System.out.println("\n=== TAMBAH DATA PASIEN ===");
        System.out.print("Nama Pasien: ");
        String nama = sc.next();
        System.out.print("Umur: ");
        int umur = sc.nextInt();
        System.out.print("Jenis Kelamin: ");
        String jenisKelamin = sc.next();
        Pasien pasienBaru = service.tambahPasien(nama, umur, jenisKelamin);
        System.out.println(
                "Data pasien berhasil ditambahkan dengan ID: "
                + pasienBaru.getIdPasien()
        );
    }
    private static void tambahPemeriksaan(Scanner sc, LaboratoriumService service) {
        System.out.println("\n=== TAMBAH PEMERIKSAAN ===");
        System.out.print("Nama Pemeriksaan: ");
        String nama = sc.next();
        System.out.print("Biaya Pemeriksaan: ");
        double biaya = sc.nextDouble();
        Pemeriksaan pemeriksaanBaru = service.tambahPemeriksaan(nama, biaya);
        System.out.println(
                "Pemeriksaan berhasil ditambahkan dengan ID: "
                + pemeriksaanBaru.getIdPemeriksaan()
        );
    }
    private static void tambahHasil(Scanner sc, LaboratoriumService service) {
        System.out.println("\n=== TAMBAH HASIL PEMERIKSAAN ===");
        System.out.print("ID Pasien: ");
        String idPasien = sc.next();
        System.out.print("Hasil Pemeriksaan: ");
        String hasil = sc.next();
        System.out.print("Status: ");
        String status = sc.next();
        HasilPemeriksaan hasilBaru = service.tambahHasil(idPasien, hasil, status);
        System.out.println(
                "Hasil pemeriksaan berhasil ditambahkan dengan ID: "
                + hasilBaru.getIdHasil()
        );
    }
}