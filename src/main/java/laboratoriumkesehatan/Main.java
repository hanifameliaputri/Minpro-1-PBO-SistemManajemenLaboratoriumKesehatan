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
            if (!sc.hasNextInt()) {
                System.out.println("Pilihan menu harus berupa angka.");
                sc.nextLine();
                continue;
            }

            int pilihan = sc.nextInt();
            switch (pilihan) {
                case 1:
                    tambahPemeriksaan(sc, service);
                    break;
                case 2:
                    service.tampilkanSemuaPemeriksaan();
                    break;
                case 3:
                    cariPemeriksaan(sc, service);
                    break;
                case 4:
                    ubahPemeriksaan(sc, service);
                    break;
                case 5:
                    hapusPemeriksaan(sc, service);
                    break;
                case 6:
                    System.out.println(
                            "Terima kasih telah menggunakan sistem."
                    );
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
        System.out.println("==================================================");
        System.out.println("   SISTEM MANAJEMEN LABORATORIUM KESEHATAN");
        System.out.println("==================================================");
        System.out.println("1. Tambah Pemeriksaan");
        System.out.println("2. Lihat Pemeriksaan");
        System.out.println("3. Cari Pemeriksaan");
        System.out.println("4. Ubah Pemeriksaan");
        System.out.println("5. Hapus Pemeriksaan");
        System.out.println("6. Keluar");
        System.out.println("==================================================");
    }

    private static void tambahPemeriksaan(
            Scanner sc,
            LaboratoriumService service
    ) {
        System.out.println("\n=== TAMBAH PEMERIKSAAN ===");
        System.out.print("Nama Pemeriksaan: ");
        sc.nextLine();
        String nama = sc.nextLine();
        if (nama.trim().isEmpty()) {
            System.out.println("Nama pemeriksaan tidak boleh kosong.");
            return;
        }
        System.out.print("Biaya Pemeriksaan: ");
        if (!sc.hasNextDouble()) {
            System.out.println("Biaya harus berupa angka.");
            sc.nextLine();
            return;
        }
        double biaya = sc.nextDouble();
        if (biaya < 0) {
            System.out.println("Biaya tidak boleh negatif.");
            return;
        }
        Pemeriksaan data = service.tambahPemeriksaan(nama, biaya);

        System.out.println(
                "Data berhasil ditambahkan dengan ID: "
                + data.getIdPemeriksaan()
        );
    }

    private static void cariPemeriksaan(Scanner sc, LaboratoriumService service) {
        System.out.println("\n=== CARI PEMERIKSAAN ===");
        System.out.print("Masukkan ID Pemeriksaan: ");
        String id = sc.next();
        Pemeriksaan data = service.cariPemeriksaanById(id);
        if (data == null) {
            System.out.println("Data pemeriksaan tidak ditemukan.");
        } else {
            System.out.println("ID     : " + data.getIdPemeriksaan());
            System.out.println("Nama   : " + data.getNamaPemeriksaan());
            System.out.println("Biaya  : " + data.getBiaya());
        }
    }
    private static void ubahPemeriksaan(Scanner sc, LaboratoriumService service) {
        System.out.println("\n=== UBAH PEMERIKSAAN ===");
        System.out.print("Masukkan ID Pemeriksaan: ");
        String id = sc.next();
        sc.nextLine();
        System.out.print("Nama Pemeriksaan Baru: ");
        String nama = sc.nextLine();
        System.out.print("Biaya Pemeriksaan Baru: ");
        if (!sc.hasNextDouble()) {
            System.out.println("Biaya harus berupa angka.");
            sc.nextLine();
            return;
        }
        double biaya = sc.nextDouble();
        boolean berhasil =
                service.ubahPemeriksaan(id, nama, biaya);
        if (berhasil) {
            System.out.println("Data berhasil diubah.");
        } else {
            System.out.println("Data pemeriksaan tidak ditemukan.");
        }
    }
    private static void hapusPemeriksaan(
            Scanner sc,
            LaboratoriumService service
    ) {
        System.out.println("\n=== HAPUS PEMERIKSAAN ===");
        System.out.print("Masukkan ID Pemeriksaan: ");
        String id = sc.next();
        boolean berhasil = service.hapusPemeriksaan(id);
        if (berhasil) {
            System.out.println("Data berhasil dihapus.");
        } else {
            System.out.println("Data pemeriksaan tidak ditemukan.");
        }
    }
}