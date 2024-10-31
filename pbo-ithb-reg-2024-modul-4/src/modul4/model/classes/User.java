package modul4.model.classes;

import modul4.model.interfaces.Action;

public abstract class User implements Action {
    private String nama, alamat, TTL, telepon;

    public User() {
    }

    public User(String nama, String alamat, String tTL, String telepon) {
        this.nama = nama;
        this.alamat = alamat;
        TTL = tTL;
        this.telepon = telepon;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTTL() {
        return TTL;
    }

    public void setTTL(String tTL) {
        TTL = tTL;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public String getType() {
        return "";
    };

    @Override
    public String toString() {
        return "Nama : " + getNama() + "\nAlamat : " + getAlamat() + "\nTTL : " + getTTL() + "\nTelepon : "
                + getTelepon();
    }
}
