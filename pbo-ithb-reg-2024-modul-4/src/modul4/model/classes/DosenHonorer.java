package modul4.model.classes;

import java.util.ArrayList;

public class DosenHonorer extends Dosen {
    int honorPerSKS;

    public DosenHonorer() {
    }

    public DosenHonorer(String nama, String alamat, String tTL, String telepon, String nIK, String departemen,
            ArrayList<MatkulDiajar> matkulDiajar, int honorPerSKS) {
        super(nama, alamat, tTL, telepon, nIK, departemen, matkulDiajar);
        this.honorPerSKS = honorPerSKS;
    }

    public int getHonorPerSKS() {
        return honorPerSKS;
    }

    public void setHonorPerSKS(int honorPerSKS) {
        this.honorPerSKS = honorPerSKS;
    }

    @Override
    public String getType() {
        return super.getType() + "Honorer";
    }

    @Override
    public String toString() {
        return super.toString() + "\n-----\nHonor Per Sks : " + honorPerSKS + "\n-----\nType : " + getType();
    }
}
