package modul4.model.classes;

import java.sql.Date;

import modul4.model.interfaces.Action;

public class Presensi implements Action {
    private Date tanggal;
    private int status;

    public Presensi() {

    }

    public Presensi(Date tanggal, int status) {
        this.tanggal = tanggal;
        this.status = status;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "\nTanggal Presensi : " + tanggal + " | Status : " + status;
    }
}
