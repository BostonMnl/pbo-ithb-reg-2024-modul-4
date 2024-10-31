package modul4.model.classes;

import java.util.ArrayList;

public class DosenTetap extends Dosen {
    private int salary;

    public DosenTetap(String nama, String alamat, String tTL, String telepon, String nIK, String departemen,
            ArrayList<MatkulDiajar> matkulDiajar, int salary) {
        super(nama, alamat, tTL, telepon, nIK, departemen, matkulDiajar);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String getType() {
        return super.getType() + "Tetap";
    }

    @Override
    public String toString() {
        return super.toString() + "\n-----\nSalary : " + salary  + "\n-----\nType : " + getType();
    }

}
