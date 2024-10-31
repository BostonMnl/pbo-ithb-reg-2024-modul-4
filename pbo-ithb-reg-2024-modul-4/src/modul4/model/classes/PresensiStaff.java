package modul4.model.classes;

import java.sql.Date;
import java.time.LocalTime;

import modul4.model.enums.Status;
import modul4.model.interfaces.Action;

public class PresensiStaff implements Action{
    private Date tanggal;
    private Status statusStaff;
    private LocalTime jam;

    public PresensiStaff() {
    }

    public PresensiStaff(Date tanggal, Status statusStaff, LocalTime jam) {
        this.tanggal = tanggal;
        this.statusStaff = statusStaff;
        this.jam = jam;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public Status getStatusStaff() {
        return statusStaff;
    }

    public void setStatusStaff(Status statusStaff) {
        this.statusStaff = statusStaff;
    }

    public LocalTime getJam() {
        return jam;
    }

    public void setJam(LocalTime jam) {
        this.jam = jam;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTanggal : " + getTanggal() + " | Status : " + getStatusStaff() + " | Jam : " + getJam();
    }
}
