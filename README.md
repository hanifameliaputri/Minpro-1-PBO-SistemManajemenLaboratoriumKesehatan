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



## 6. Demo Program

### 1. Menu Utama

<img width="773" height="359" alt="WhatsApp Image 2026-09-10 at 02 30 56" src="https://github.com/user-attachments/assets/44affbf6-3021-46aa-830c-c4b9665f4176" />


Gambar tersebut menunjukkan menu utama Sistem Manajemen Laboratorium Kesehatan. Pengguna dapat memilih menu tambah, lihat, cari, ubah, hapus, atau keluar dengan memasukkan nomor pilihan.

### 2. Tambah Pemeriksaan


<img width="742" height="587" alt="WhatsApp Image 2026-09-10 at 02 04 55" src="https://github.com/user-attachments/assets/a5b7bf0c-bbb0-4f2b-a91d-e8216ddb603f" />



Pada menu ini, pengguna memasukkan nama dan biaya pemeriksaan. Setelah data berhasil disimpan, program membuat ID pemeriksaan secara otomatis, seperti PM1.

### 3. Lihat Pemeriksaan

<img width="812" height="510" alt="image" src="https://github.com/user-attachments/assets/277aba30-dd31-41df-9d77-d97c478b17ab" />


Menu ini menampilkan semua data pemeriksaan yang tersimpan di dalam ArrayList.

### 4. Cari Pemeriksaan

<img width="773" height="595" alt="image" src="https://github.com/user-attachments/assets/70ab3eb6-ac1f-4b64-a744-bc7dbfc2bded" />



Pengguna memasukkan ID pemeriksaan untuk mencari data tertentu.

### 5. Ubah Pemeriksaan

<img width="741" height="575" alt="image" src="https://github.com/user-attachments/assets/25da5d1f-7352-4bb9-aded-865e77c62fe7" />


Menu ini digunakan untuk mengubah nama dan biaya pemeriksaan berdasarkan ID.

Setelah data diubah kita bisa lihat perubahannya dengan pilih menu 2.

<img width="727" height="450" alt="image" src="https://github.com/user-attachments/assets/71fb4875-95be-40ba-a215-7353fcf95ec6" />



### 6. Hapus Pemeriksaan

<img width="722" height="531" alt="image" src="https://github.com/user-attachments/assets/784d126f-7454-40b4-86ac-f6ffdb12a847" />



Menu ini digunakan untuk menghapus data pemeriksaan berdasarkan ID.

Jika kita mau melihat apakah data sudah berhasil di hapus bisa dilihat kembali pada menu 2.

<img width="766" height="402" alt="image" src="https://github.com/user-attachments/assets/4f582afa-f62a-4423-b43d-a947f2f2987b" />



Gambar tersebut menunjukkan menu utama Sistem Manajemen Laboratorium Kesehatan. Pengguna dapat memilih menu tambah, lihat, cari, ubah, hapus, atau keluar dengan memasukkan nomor pilihan.


### 7. Menu Keluar


<img width="724" height="400" alt="image" src="https://github.com/user-attachments/assets/d76d4449-092f-49ca-ad78-566c3cfde991" />




Ketika pengguna ingin keluar dari sistem.

## 7. Penerapan Nilai Tambah

### 1. Access Modifier


<img width="319" height="137" alt="image" src="https://github.com/user-attachments/assets/b88439d0-8057-4e66-b1dc-340de0bdabb6" />


Gambar di atas menunjukkan penggunaan access modifier `private` pada atribut class `HasilPemeriksaan`, yaitu `idHasil`, `idPasien`, `hasil`, dan `status`.

Atribut tersebut dibuat `private` agar tidak dapat diakses secara langsung dari luar class. Untuk mengakses atau mengubah data, program menggunakan method `public`, seperti getter dan setter.

Contoh kode yang terlihat pada gambar:

```java
private String idHasil;
private String idPasien;
private String hasil;
private String status;
```

### 2. Encapsulation

<img width="400" height="117" alt="image" src="https://github.com/user-attachments/assets/8af380df-64c1-491c-9c07-a45ac5b80bb6" />

Gambar di atas menunjukkan penerapan encapsulation pada class `HasilPemeriksaan`. Atribut data tidak diakses secara langsung, tetapi melalui getter dan setter.


### 3. Validasi Input

```java
if (!sc.hasNextInt()) {
    System.out.println("Pilihan menu harus berupa angka.");
    sc.nextLine();
    continue;
}
```
<img width="534" height="111" alt="image" src="https://github.com/user-attachments/assets/3e378ac7-c81f-4901-99c0-45382e3f5dc6" />


Kode tersebut digunakan untuk memastikan pilihan menu berupa angka. Jika pengguna memasukkan huruf, program menampilkan pesan kesalahan dan kembali menampilkan menu.

```java
if (biaya < 0) {
    System.out.println("Biaya tidak boleh negatif.");
    return;
}
```
<img width="457" height="77" alt="image" src="https://github.com/user-attachments/assets/4554fa48-1dca-47aa-8c6d-e2d9f2e8911b" />


Kode tersebut digunakan untuk menolak biaya pemeriksaan yang bernilai negatif.

```java
if (nama.trim().isEmpty()) {
    System.out.println("Nama pemeriksaan tidak boleh kosong.");
    return;
}
```
<img width="547" height="76" alt="image" src="https://github.com/user-attachments/assets/13d6c176-4555-48cc-9efd-d6538af6d296" />


Kode tersebut digunakan untuk memastikan nama pemeriksaan tidak kosong atau hanya berisi spasi.
