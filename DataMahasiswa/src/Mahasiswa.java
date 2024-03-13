class Mahasiswa {
    private String nim;
    private String nama;
    private String jenisKelamin;
    private String lulusan;

    public Mahasiswa(String nim, String nama, String jenisKelamin, String lulusan) {
        this.nim = nim;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.lulusan = lulusan;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public void setLulusan(String lulusan) {
        this.lulusan = lulusan;
    }

    public String getNim() {
        return this.nim;
    }

    public String getNama() {
        return this.nama;
    }

    public String getJenisKelamin() {
        return this.jenisKelamin;
    }

    public String getLulusan() {
        return this.lulusan;
    }
}