package modul4.model.classes;

public class MatkulPilihan extends MataKuliah {
    private int minimumMhs;

    public MatkulPilihan(){
        
    }

    public MatkulPilihan(int minimumMhs) {
        this.minimumMhs = minimumMhs;
    }

    public MatkulPilihan(int sks, String kode, String nama, int minimumMhs) {
        super(sks, kode, nama);
        this.minimumMhs = minimumMhs;
    }

    public int getMinimumMhs() {
        return minimumMhs;
    }

    public void setMinimumMhs(int minimumMhs) {
        this.minimumMhs = minimumMhs;
    }

    @Override
    public String toString() {
        return super.toString() + "\nMinimum Mhs: " + minimumMhs;
    }
}
