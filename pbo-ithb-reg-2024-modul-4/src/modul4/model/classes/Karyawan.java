package modul4.model.classes;

import java.util.ArrayList;

public class Karyawan extends Staff {
    private double salary;
    private ArrayList<PresensiStaff> listPresensiStaff = new ArrayList<>();

    public Karyawan(String nama, String alamat, String tTL, String telepon, String nIK, double salary,
            ArrayList<PresensiStaff> listPresensiStaff) {
        super(nama, alamat, tTL, telepon, nIK);
        this.salary = salary;
        this.listPresensiStaff = listPresensiStaff;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public ArrayList<PresensiStaff> getListPresensiStaff() {
        return listPresensiStaff;
    }

    public void setListPresensiStaff(ArrayList<PresensiStaff> listPresensiStaff) {
        this.listPresensiStaff = listPresensiStaff;
    }

    @Override
    public String getType() {
        return super.getType() + "Karyawan";
    }

    @Override
    public String toString() {
        String presensiMsg = "";
        for (PresensiStaff presensiStaff : getListPresensiStaff()) {
            presensiMsg += presensiStaff.toString();
        }
        return super.toString() + "\nSalary : " + getSalary() + presensiMsg + "\n-----\nType : " + getType();
    }
}
