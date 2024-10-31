package modul4.model.classes;

public class MataKuliah {
    private int sks;
    private String kode, nama;

    public MataKuliah() {
    }

    public MataKuliah(int sks, String kode, String nama) {
        this.sks = sks;
        this.kode = kode;
        this.nama = nama;
    }

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public String toString() {
        return "\n-----\nKode : " + kode + "\nSKS : " + sks + "\nNama Matakuliah : " + nama;
    }
}
