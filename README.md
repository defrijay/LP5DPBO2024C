# Aplikasi Manajemen Data Mahasiswa

## Deskripsi
Aplikasi Manajemen Data Mahasiswa adalah program sederhana yang memungkinkan pengguna untuk melakukan operasi CRUD (Create, Read, Update, Delete) terhadap data mahasiswa. Program ini dibangun menggunakan bahasa pemrograman Java dan antarmuka grafis menggunakan Java Swing.

## Desain Program

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

