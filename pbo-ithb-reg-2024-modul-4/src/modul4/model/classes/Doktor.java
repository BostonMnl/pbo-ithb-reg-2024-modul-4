package modul4.model.classes;

public class Doktor extends Mahasiswa {
    private String penelitianDisertasi;
    private int nilaiSidang1, nilaiSidang2, nilaiSidang3;

    public Doktor() {
    }

    public Doktor(String nama, String alamat, String tTL, String telepon, String nIM, String jurusan,
            String penelitianDisertasi, int nilaiSidang1, int nilaiSidang2, int nilaiSidang3) {
        super(nama, alamat, tTL, telepon, nIM, jurusan);
        this.penelitianDisertasi = penelitianDisertasi;
        this.nilaiSidang1 = nilaiSidang1;
        this.nilaiSidang2 = nilaiSidang2;
        this.nilaiSidang3 = nilaiSidang3;
    }

    public String getPenelitianDisertasi() {
        return penelitianDisertasi;
    }

    public void setPenelitianDisertasi(String penelitianDisertasi) {
        this.penelitianDisertasi = penelitianDisertasi;
    }

    public int getNilaiSidang1() {
        return nilaiSidang1;
    }

    public void setNilaiSidang1(int nilaiSidang1) {
        this.nilaiSidang1 = nilaiSidang1;
    }

    public int getNilaiSidang2() {
        return nilaiSidang2;
    }

    public void setNilaiSidang2(int nilaiSidang2) {
        this.nilaiSidang2 = nilaiSidang2;
    }

    public int getNilaiSidang3() {
        return nilaiSidang3;
    }

    public void setNilaiSidang3(int nilaiSidang3) {
        this.nilaiSidang3 = nilaiSidang3;
    }

    @Override
    public String getType() {
        return super.getType() + "Doktor";
    }

    @Override
    public String toString() {
        return super.toString() + "\nPenelitian Disertasi : " + getPenelitianDisertasi() + "\nNilai Sidang 1 : "
                + getNilaiSidang1() + "\nNilai Sidang 2 : " + getNilaiSidang2() + "\nNilai Sidang 3 : "
                + getNilaiSidang3() + "\n-----\nType : " + getType();
    }
}
