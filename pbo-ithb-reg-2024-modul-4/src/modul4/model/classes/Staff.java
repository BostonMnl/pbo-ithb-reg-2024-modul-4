package modul4.model.classes;

public abstract class Staff extends User {
    private String NIK;

    public Staff(){
    }

    public Staff(String nama, String alamat, String tTL, String telepon, String nIK) {
        super(nama, alamat, tTL, telepon);
        NIK = nIK;
    }

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String nIK) {
        NIK = nIK;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNIK : " + getNIK();
    }
}
