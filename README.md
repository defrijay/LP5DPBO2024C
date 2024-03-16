# Nama : Defrizal Yahdiyan Risyad
# NIM : 2206131
# Kelas : Ilmu Komputer C1 2022


# Janji
Saya Defrizal Yahdiyan Risyad dengan NIM 2206131 mengerjakan Laporan Praktikum 5
dalam mata kuliah Desain Pemograman Berorientasi Objek untuk keberkahanNya 
maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

# Aplikasi Manajemen Data Mahasiswa

## Deskripsi
Aplikasi Manajemen Data Mahasiswa adalah program sederhana yang memungkinkan pengguna untuk melakukan operasi CRUD (Create, Read, Update, Delete) terhadap data mahasiswa. Program ini dibangun menggunakan bahasa pemrograman Java dan antarmuka grafis menggunakan Java Swing.

## Desain Program

### Kelas Mahasiswa
- **Deskripsi**: Kelas ini merepresentasikan objek Mahasiswa dengan atribut NIM, nama, jenis kelamin, dan lulusan.
- **Atribut**:
  - `nim` (String): NIM mahasiswa.
  - `nama` (String): Nama mahasiswa.
  - `jenisKelamin` (String): Jenis kelamin mahasiswa.
  - `lulusan` (String): Lulusan mahasiswa.
- **Metode**:
  - `Mahasiswa(String nim, String nama, String jenisKelamin, String lulusan)`: Konstruktor untuk membuat objek Mahasiswa dengan parameter NIM, nama, jenis kelamin, dan lulusan.
  - `setNim(String nim)`: Metode untuk mengatur nilai atribut nim.
  - `setNama(String nama)`: Metode untuk mengatur nilai atribut nama.
  - `setJenisKelamin(String jenisKelamin)`: Metode untuk mengatur nilai atribut jenisKelamin.
  - `setLulusan(String lulusan)`: Metode untuk mengatur nilai atribut lulusan.
  - `getNim()`: Metode untuk mengambil nilai atribut nim.
  - `getNama()`: Metode untuk mengambil nilai atribut nama.
  - `getJenisKelamin()`: Metode untuk mengambil nilai atribut jenisKelamin.
  - `getLulusan()`: Metode untuk mengambil nilai atribut lulusan.

### Kelas Menu (JFrame)
- **Deskripsi**: Kelas ini mengatur antarmuka pengguna (GUI) dan logika program untuk Aplikasi Manajemen Data Mahasiswa.
- **Atribut**:
  - `listMahasiswa` (ArrayList\<Mahasiswa\>): ArrayList untuk menyimpan objek Mahasiswa.
  - `selectedIndex` (int): Indeks baris yang dipilih pada tabel.
- **Komponen GUI**:
  - JTextField untuk NIM, nama.
  - JComboBox untuk jenis kelamin, lulusan.
  - JButton untuk operasi Add/Update, Cancel, Delete.
  - JTable untuk menampilkan data mahasiswa.
- **Metode Utama**:
  - `Menu()`: Konstruktor kelas Menu yang inisialisasi komponen GUI dan mengatur listener.
  - `setTable()`: Metode untuk mengatur model tabel dengan data mahasiswa.
  - `insertData()`: Metode untuk menambahkan data mahasiswa baru ke dalam list.
  - `updateData()`: Metode untuk mengupdate data mahasiswa yang dipilih pada tabel.
  - `deleteData()`: Metode untuk menghapus data mahasiswa yang dipilih pada tabel.
  - `clearForm()`: Metode untuk membersihkan formulir input.
  - `populateList()`: Metode untuk mengisi list dengan data mahasiswa default.
  - `main(String[] args)`: Metode utama untuk menjalankan aplikasi.

## Catatan
- Kelas Menu (JFrame) bertanggung jawab untuk mengatur antarmuka pengguna dan logika program.
- Kelas Mahasiswa hanya bertanggung jawab untuk merepresentasikan objek Mahasiswa.
- Penggunaan ArrayList untuk menyimpan data mahasiswa memudahkan operasi CRUD.


### Komponen Utama
- **Mahasiswa.java**: Kelas untuk merepresentasikan objek Mahasiswa dengan atribut nim, nama, jenis kelamin, dan lulusan, serta metode getter dan setter untuk mengakses dan mengubah nilai atribut.
- **Menu.java**: Kelas utama yang mengatur antarmuka pengguna (GUI) dan logika program. Kelas ini berisi logika untuk menambahkan, mengupdate, dan menghapus data mahasiswa, serta menampilkan data mahasiswa dalam sebuah tabel.

### Antarmuka Pengguna (GUI)
- Terdapat input field untuk memasukkan NIM, nama, dan jenis kelamin mahasiswa.
- Terdapat combo box untuk memilih jenis kelamin dan lulusan mahasiswa.
- Tombol "Add" untuk menambahkan data mahasiswa baru.
- Tombol "Update" untuk memperbarui data mahasiswa yang dipilih.
- Tombol "Delete" untuk menghapus data mahasiswa yang dipilih.
- Tabel yang menampilkan data mahasiswa, dimana pengguna dapat mengklik baris untuk mengedit atau menghapus data.

## Alur Program

1. Saat program dijalankan, tabel akan ditampilkan dengan data mahasiswa yang sudah ada.
2. Pengguna dapat melakukan operasi CRUD sebagai berikut:
   - **Create**: Mengisi formulir dengan informasi mahasiswa baru, kemudian menekan tombol "Add".
   - **Read**: Melihat data mahasiswa yang sudah ada pada tabel.
   - **Update**: Mengklik baris pada tabel untuk mengisi formulir dengan informasi mahasiswa yang ingin diubah, kemudian melakukan perubahan dan menekan tombol "Update".
   - **Delete**: Mengklik baris pada tabel untuk memilih data mahasiswa yang ingin dihapus, kemudian menekan tombol "Delete".
3. Setiap operasi CRUD akan mengupdate tampilan tabel secara otomatis.
4. Pengguna dapat memperbarui atau menghapus data dengan mengklik baris yang diinginkan pada tabel.
5. Pengguna juga dapat mengosongkan formulir dengan menekan tombol "Cancel".

