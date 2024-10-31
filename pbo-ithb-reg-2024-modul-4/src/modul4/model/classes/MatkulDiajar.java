package modul4.model.classes;

import java.util.ArrayList;

public class MatkulDiajar {
    private MataKuliah matkulDiajar;
    private ArrayList<PresensiStaff> listPresensiStaff = new ArrayList<>();

    public MatkulDiajar() {
    }

    public MatkulDiajar(MataKuliah matkulDiajar, ArrayList<PresensiStaff> listPresensiStaff) {
        this.matkulDiajar = matkulDiajar;
        this.listPresensiStaff = listPresensiStaff;
    }

    public MataKuliah getMatkulDiajar() {
        return matkulDiajar;
    }

    public void setMatkulDiajar(MataKuliah matkulDiajar) {
        this.matkulDiajar = matkulDiajar;
    }

    public ArrayList<PresensiStaff> getListPresensiStaff() {
        return listPresensiStaff;
    }

    public void setListPresensiStaff(ArrayList<PresensiStaff> listPresensiStaff) {
        this.listPresensiStaff = listPresensiStaff;
    }

    @Override
    public String toString() {
        String presensiMsg = "";
        for (PresensiStaff presensi : getListPresensiStaff()) {
            presensiMsg += presensi.toString();
        }
        return "\nMata Kuliah Diajar : " + getMatkulDiajar().toString() + presensiMsg;
    }
}
