package modul4.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import modul4.model.classes.*;
import modul4.model.enums.Status;

public class Controllers {
    public static User findUserData(String _nama, ArrayList<User> user) {
        for (User _user : user) {
            if (_user.getNama().equals(_nama)) {
                return _user;
            }
        }
        return null;
    }

    public static double nilaiAkhirMhs(String _nim, String _kodeMK, ArrayList<User> user) {
        for (User _user : user) {
            if (_user instanceof Mahasiswa) {
                Mahasiswa mhs = (Mahasiswa) _user;
                if (mhs.getNIM().equals(_nim)) {

                    if (mhs instanceof Sarjana) {
                        Sarjana mhsSarjana = (Sarjana) mhs;
                        for (MatkulAmbil _matkulAmbil : mhsSarjana.getMatkul()) {
                            if (_matkulAmbil.getMatkulDiambil().getKode().equalsIgnoreCase(_kodeMK)) {
                                return (_matkulAmbil.getN1() + _matkulAmbil.getN2() + _matkulAmbil.getN3()) / 3;

                            }
                        }
                    } else if (mhs instanceof Magister) {
                        Magister mhsMagister = (Magister) mhs;
                        for (MatkulAmbil _matkulAmbil : mhsMagister.getMatkul()) {
                            if (_matkulAmbil.getMatkulDiambil().getKode().equalsIgnoreCase(_kodeMK)) {
                                return (_matkulAmbil.getN1() + _matkulAmbil.getN2() + _matkulAmbil.getN3()) / 3;

                            }
                        }
                    } else {
                        Doktor mhsDoktor = (Doktor) mhs;
                        return (mhsDoktor.getNilaiSidang1() + mhsDoktor.getNilaiSidang2() + mhsDoktor.getNilaiSidang3())
                                / 3;
                    }
                    return -1;
                }
            }
        }
        return -2;
    }

    public static double nilaiRataMK(String _kodeMK, ArrayList<User> user) {
        double total = 0;
        int count = 0;
        for (User _user : user) {
            if (_user instanceof Mahasiswa) {
                Mahasiswa mhs = (Mahasiswa) _user;
                List<MatkulAmbil> matkulList = null;

                if (mhs instanceof Sarjana) {
                    matkulList = ((Sarjana) mhs).getMatkul();
                } else if (mhs instanceof Magister) {
                    matkulList = ((Magister) mhs).getMatkul();
                }

                if (matkulList != null) {
                    for (MatkulAmbil _matkulAmbil : matkulList) {
                        if (_matkulAmbil.getMatkulDiambil().getKode().equalsIgnoreCase(_kodeMK)) {
                            total += (_matkulAmbil.getN1() + _matkulAmbil.getN2() + _matkulAmbil.getN3()) / 3;
                            count++;
                        }
                    }
                }
            }
        }
        return total / count;
    }

    public static int[] mkTidakLulus(String _kodeMK, ArrayList<User> user) {
        int[] hasilPencarian = new int[2];
        for (User _user : user) {
            List<MatkulAmbil> matkulList = null;
            if (_user instanceof Sarjana) {
                matkulList = ((Sarjana) _user).getMatkul();
            } else if (_user instanceof Magister) {
                matkulList = ((Magister) _user).getMatkul();
            }

            if (matkulList != null) {
                for (MatkulAmbil _matkulAmbil : matkulList) {
                    if (_matkulAmbil.getMatkulDiambil().getKode().equalsIgnoreCase(_kodeMK)) {
                        if (((_matkulAmbil.getN1() + _matkulAmbil.getN2() + _matkulAmbil.getN3()) / 3) < 56) {
                            hasilPencarian[1]++;
                        }
                        hasilPencarian[0]++;
                    }
                }
            }
        }
        return hasilPencarian;
    }

    public static HashMap<MataKuliah, Integer> matkulAmbilMhs(String _nim, ArrayList<User> user) {
        HashMap<MataKuliah, Integer> matkulDiambil = new HashMap<>();
        for (User _user : user) {
            if (_user instanceof Mahasiswa) {
                Mahasiswa mhs = (Mahasiswa) _user;
                if (mhs.getNIM().equals(_nim)) {
                    List<MatkulAmbil> matkulList = null;
                    if (_user instanceof Sarjana) {
                        matkulList = ((Sarjana) _user).getMatkul();
                    } else if (_user instanceof Magister) {
                        matkulList = ((Magister) _user).getMatkul();
                    }
                    for (MatkulAmbil _matkulAmbil : matkulList) {
                        int totalPresensi = 0;
                        for (Presensi _presensi : _matkulAmbil.getListPresensi()) {
                            if (_presensi.getStatus() == 1) {
                                totalPresensi++;
                            }
                        }
                        matkulDiambil.put(_matkulAmbil.getMatkulDiambil(), totalPresensi);
                    }
                }
            }
        }
        return matkulDiambil;
    }

    public static String hitungJamMengajar(String _nik, ArrayList<User> user) {
        String str = "";
        int count = 0;
        int jam = 0;

        for (User _user : user) {
            if (_user instanceof Dosen) {
                Dosen dosen = (Dosen) _user;
                if (dosen.getNIK().equals(_nik)) {
                    str += "\nNama Dosen : " + dosen.getNama();
                    for (MatkulDiajar _matkulDiajar : dosen.getMatkulDiajar()) {
                        for (PresensiStaff _Presensi : _matkulDiajar.getListPresensiStaff()) {
                            if (_Presensi.getStatusStaff() == Status.HADIR) {
                                jam += _matkulDiajar.getMatkulDiajar().getSks();
                                count++;
                            }
                        }
                    }
                }
            }
        }
        str += "\nJumlah Kehadiran dosen : " + String.valueOf(count);
        str += "\nJumlah Jam Mengajar dosen : " + String.valueOf(jam) + " Jam";

        return str;
    }

    public static String hitungSalary(String _nik, ArrayList<User> user) {
        String str = "";
        int count = 0;

        for (User _user : user) {
            if (_user instanceof Dosen) {
                Dosen dosen = (Dosen) _user;
                if (dosen.getNIK().equals(_nik)) {
                    str += "\nNama Dosen : " + dosen.getNama();
                    if (dosen instanceof DosenTetap) {
                        str += "\nDosen Tetap";
                        DosenTetap _dosenTetap = (DosenTetap) dosen;

                        for (MatkulDiajar _matkulDiajar : dosen.getMatkulDiajar()) {
                            for (PresensiStaff _Presensi : _matkulDiajar.getListPresensiStaff()) {
                                if (_Presensi.getStatusStaff() == Status.HADIR) {
                                    count++;
                                }
                            }
                        }
                        int gaji = _dosenTetap.getSalary() + (count * 250000);
                        str += "\nGaji : " + String.valueOf(gaji);
                    } else if (dosen instanceof DosenHonorer) {
                        str += "\nDosen Honorer";
                        DosenHonorer _dosenHonorer = (DosenHonorer) dosen;

                        for (MatkulDiajar _matkulDiajar : dosen.getMatkulDiajar()) {
                            for (PresensiStaff _Presensi : _matkulDiajar.getListPresensiStaff()) {
                                if (_Presensi.getStatusStaff() == Status.HADIR) {
                                    count++;
                                }
                            }
                        }
                        int gaji = count * _dosenHonorer.getHonorPerSKS();
                        str += "\nGaji : " + String.valueOf(gaji);
                    }

                }
            } else if (_user instanceof Karyawan) {
                Karyawan karyawan = (Karyawan) _user;

                if (karyawan.getNIK().equals(_nik)) {
                    str += "\nNama Karyawan : " + karyawan.getNama();

                    for (PresensiStaff _Presensi : karyawan.getListPresensiStaff()) {
                        if (_Presensi.getStatusStaff() == Status.HADIR) {
                            count++;
                        }
                    }

                    double gaji = count / 22.0 * karyawan.getSalary();
                    str += "\nGaji : " + String.valueOf(gaji);
                }
            }
        }

        return str;
    }
}
