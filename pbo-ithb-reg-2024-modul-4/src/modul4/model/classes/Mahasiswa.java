package modul4.model.classes;

public abstract class Mahasiswa extends User {
    private String NIM, jurusan;

    public Mahasiswa() {
    }

    public Mahasiswa(String nama, String alamat, String tTL, String telepon, String nIM, String jurusan) {
        super(nama, alamat, tTL, telepon);
        NIM = nIM;
        this.jurusan = jurusan;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String nIM) {
        NIM = nIM;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNIM : " + getNIM() + "\nJurusan : " + getJurusan();
    }
}
