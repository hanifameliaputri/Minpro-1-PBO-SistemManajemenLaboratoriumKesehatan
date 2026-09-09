# Minpro-1-PBO-SistemManajemenLaboratoriumKesehatan

Nama: Hanif Amelia Putri
Kelas: B
NIM: 2509116075

## 1. Deskripsi Singkat Program

Sistem Manajemen Laboratorium Kesehatan adalah program sederhana berbasis Java yang digunakan untuk mengelola daftar jenis pemeriksaan dan biaya pemeriksaan di laboratorium kesehatan, seperti cek darah dan cek gula darah. Setiap data memiliki tiga informasi, yaitu ID pemeriksaan, nama pemeriksaan, dan biaya pemeriksaan. ID dibuat secara otomatis oleh sistem, misalnya PM1 dan PM2.

Programini memiliki enam pilihan menu, yaitu Tambah Pemeriksaan, Lihat Pemeriksaan, Cari Pemeriksaan, Ubah Pemeriksaan, Hapus Pemeriksaan, dan Keluar. Pengguna dapat mencari, mengubah, atau menghapus data berdasarkan ID pemeriksaan.

Program menerapkan konsep Pemrograman Berorientasi Objek (PBO) dan menggunakan ArrayList untuk menyimpan data selama program berjalan. Validasi input digunakan untuk menolak pilihan menu yang bukan angka, biaya yang bukan angka atau bernilai negatif, serta nama pemeriksaan yang kosong. Data yang dimasukkan akan hilang ketika program ditutup.

## 2. Tujuan Program

Program ini dibuat untuk memenuhi tugas mini project Pemrograman Berorientasi Objek dengan menerapkan operasi CRUD (Create, Read, Update, Delete) pada data pemeriksaan laboratorium kesehatan.

Tujuan program adalah:

- Memudahkan pencatatan nama jenis pemeriksaan dan biayanya.
- Menampilkan daftar pemeriksaan yang telah ditambahkan.
- Memudahkan pencarian data pemeriksaan berdasarkan ID.
- Memungkinkan perubahan nama dan biaya pemeriksaan.
- Menghapus data pemeriksaan yang tidak diperlukan.

## 3. Struktur Program

Program ini terdiri dari beberapa class yang digunakan untuk menjalankan sistem manajemen laboratorium kesehatan.

| No. | Class | Fungsi |
|---|---|---|
| 1 | `Main.java` | Menjalankan program, menampilkan menu, menerima input pengguna, dan menjalankan fitur sesuai pilihan menu. |
| 2 | `LaboratoriumService.java` | Mengelola data pemeriksaan menggunakan `ArrayList`, termasuk proses tambah, lihat, cari, ubah, dan hapus data. |
| 3 | `Pemeriksaan.java` | Membuat objek pemeriksaan yang memiliki ID, nama pemeriksaan, dan biaya. |
| 4 | `Pasien.java` | Menyimpan data pasien berupa ID pasien, nama pasien, umur, dan jenis kelamin. |
| 5 | `HasilPemeriksaan.java` | Menyimpan data hasil pemeriksaan berupa ID hasil, ID pasien, hasil pemeriksaan, dan status. |

### Hubungan Antarclass

Class `Main` menerima input dari pengguna dan memanggil method pada class `LaboratoriumService`. Selanjutnya, `LaboratoriumService` mengelola objek `Pemeriksaan` yang disimpan menggunakan `ArrayList`.

### Struktur Project di NetBeans

```text
LaboratoriumKesehatan
├── Source Packages
│   └── laboratoriumkesehatan
│       ├── HasilPemeriksaan.java
│       ├── LaboratoriumService.java
│       ├── Main.java
│       ├── Pasien.java
│       └── Pemeriksaan.java
├── Test Packages
├── Dependencies
├── Java Dependencies
└── Project Files
```

## 5. Menu Program

Program memiliki enam menu utama:

```text
==================================================
   SISTEM MANAJEMEN LABORATORIUM KESEHATAN
==================================================
1. Tambah Pemeriksaan
2. Lihat Pemeriksaan
3. Cari Pemeriksaan
4. Ubah Pemeriksaan
5. Hapus Pemeriksaan
6. Keluar
==================================================
```

### 1. Tambah Pemeriksaan

Digunakan untuk memasukkan data pemeriksaan baru. Pengguna mengisi nama dan biaya pemeriksaan. ID pemeriksaan dibuat otomatis oleh sistem.

### 2. Lihat Pemeriksaan

Digunakan untuk menampilkan semua data pemeriksaan yang tersimpan di dalam `ArrayList`.

### 3. Cari Pemeriksaan

Digunakan untuk mencari data berdasarkan ID pemeriksaan, seperti `PM1`.

### 4. Ubah Pemeriksaan

Digunakan untuk mengubah nama dan biaya pemeriksaan berdasarkan ID yang dipilih.

### 5. Hapus Pemeriksaan

Digunakan untuk menghapus data pemeriksaan berdasarkan ID.

### 6. Keluar

Digunakan untuk menghentikan program.
