package modul4.model.classes;

import java.util.ArrayList;

public class Magister extends Mahasiswa {
    private ArrayList<MatkulAmbil> matkul = new ArrayList<>();
    private String judulPenelitianThesis;

    public Magister() {
    }

    public Magister(String nama, String alamat, String tTL, String telepon, String nIM, String jurusan,
            ArrayList<MatkulAmbil> matkul, String judulPenelitianThesis) {
        super(nama, alamat, tTL, telepon, nIM, jurusan);
        this.matkul = matkul;
        this.judulPenelitianThesis = judulPenelitianThesis;
    }

    public ArrayList<MatkulAmbil> getMatkul() {
        return matkul;
    }

    public void setMatkul(ArrayList<MatkulAmbil> matkul) {
        this.matkul = matkul;
    }

    public String getJudulPenelitianThesis() {
        return judulPenelitianThesis;
    }

    public void setJudulPenelitianThesis(String judulPenelitianThesis) {
        this.judulPenelitianThesis = judulPenelitianThesis;
    }

    @Override
    public String getType() {
        return super.getType() + "Magister";
    }

    @Override
    public String toString() {
        String matkulMsg = "";
        for (MatkulAmbil matkl : getMatkul()) {
            matkulMsg += matkl.toString();
        }
        return super.toString() + matkulMsg + "\nJudul Penelitian Thesis : " + getJudulPenelitianThesis()
                + "\n-----\nType : " + getType();
    }
}
