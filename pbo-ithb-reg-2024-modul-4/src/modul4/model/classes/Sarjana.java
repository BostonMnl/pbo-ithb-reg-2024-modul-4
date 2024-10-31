package modul4.model.classes;

import java.util.ArrayList;

public class Sarjana extends Mahasiswa {
    private ArrayList<MatkulAmbil> matkul = new ArrayList<>();

    public Sarjana() {
    }

    public Sarjana(String nama, String alamat, String tTL, String telepon, String nIM, String jurusan, ArrayList<MatkulAmbil> matkul) {
        super(nama, alamat, tTL, telepon, nIM, jurusan);
        this.matkul = matkul;
    }

    public ArrayList<MatkulAmbil> getMatkul() {
        return matkul;
    }

    public void setMatkul(ArrayList<MatkulAmbil> matkul) {
        this.matkul = matkul;
    }

    @Override
    public String getType() {
        return super.getType() + "Sarjana";
    }

    @Override
    public String toString() {
        String matkulMsg = "";
        for (MatkulAmbil matkl : getMatkul()) {
            matkulMsg += matkl.toString();
        }
        return super.toString() + matkulMsg + "\n-----\nType : " + getType();
    }
}