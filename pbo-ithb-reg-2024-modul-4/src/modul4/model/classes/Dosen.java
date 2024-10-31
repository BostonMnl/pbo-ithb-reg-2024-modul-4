package modul4.model.classes;

import java.util.ArrayList;

public abstract class Dosen extends Staff {
    private String departemen;
    private ArrayList<MatkulDiajar> matkulDiajar = new ArrayList<>();

    public Dosen() {

    }

    public Dosen(String nama, String alamat, String tTL, String telepon, String nIK, String departemen,
            ArrayList<MatkulDiajar> matkulDiajar) {
        super(nama, alamat, tTL, telepon, nIK);
        this.departemen = departemen;
        this.matkulDiajar = matkulDiajar;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public ArrayList<MatkulDiajar> getMatkulDiajar() {
        return matkulDiajar;
    }

    public void setMatkulDiajar(ArrayList<MatkulDiajar> matkulDiajar) {
        this.matkulDiajar = matkulDiajar;
    }

    @Override
    public String toString() {
        String matkulDiajarMsg = "";
        for (MatkulDiajar matkul : getMatkulDiajar()) {
            matkulDiajarMsg += matkul.toString();
        }
        return super.toString() + "\nDepartemen : " + departemen + "\nMatkul diajar : " + matkulDiajarMsg;
    }
}
