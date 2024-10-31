package modul4.model.classes;

import java.util.ArrayList;

public class MatkulAmbil {
    private MataKuliah matkulDiambil;
    private ArrayList<Presensi> listPresensi = new ArrayList<>();
    private double n1;
    private double n2;
    private double n3;

    public MatkulAmbil() {
    }

    public MatkulAmbil(MataKuliah matkulDiambil, ArrayList<Presensi> listPresensi, double n1, double n2, double n3) {
        this.matkulDiambil = matkulDiambil;
        this.listPresensi = listPresensi;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public MataKuliah getMatkulDiambil() {
        return matkulDiambil;
    }

    public void setMatkulDiambil(MataKuliah matkulDiambil) {
        this.matkulDiambil = matkulDiambil;
    }

    public ArrayList<Presensi> getListPresensi() {
        return listPresensi;
    }

    public void setListPresensi(ArrayList<Presensi> listPresensi) {
        this.listPresensi = listPresensi;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getN3() {
        return n3;
    }

    public void setN3(double n3) {
        this.n3 = n3;
    }

    @Override
    public String toString() {
        String presensiMsg = "";
        for (Presensi presensi : getListPresensi()) {
            presensiMsg += presensi.toString();
        }
        return getMatkulDiambil().toString() + presensiMsg + "\nN1 : " + getN1() + "\nN2 : " + getN2() + "\nN3 : "
                + getN3();
    }
}
