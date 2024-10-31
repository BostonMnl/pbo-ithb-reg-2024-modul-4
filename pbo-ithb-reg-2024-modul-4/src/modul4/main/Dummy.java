package modul4.main;

import java.time.LocalTime;
import java.util.ArrayList;

import java.sql.Date;

import modul4.model.classes.*;
import modul4.model.enums.*;

public class Dummy {
        public static ArrayList<User> dummyData() {
                // Mahasiswa

                // Dummy Presensi
                // YY-MM-DD
                ArrayList<Presensi> listPresensi1 = new ArrayList<>();
                Presensi presensi1 = new Presensi(Date.valueOf("2024-10-01"), 1); // Hadir
                Presensi presensi2 = new Presensi(Date.valueOf("2024-10-08"), 0); // Tidak Hadir
                Presensi presensi3 = new Presensi(Date.valueOf("2024-10-15"), 1); // Hadir
                listPresensi1.add(presensi1);
                listPresensi1.add(presensi2);
                listPresensi1.add(presensi3);

                ArrayList<Presensi> listPresensi2 = new ArrayList<>();
                presensi1 = new Presensi(Date.valueOf("2024-10-01"), 1); // Hadir
                presensi2 = new Presensi(Date.valueOf("2024-10-08"), 1); // Hadir
                presensi3 = new Presensi(Date.valueOf("2024-10-15"), 1); // Hadir
                listPresensi2.add(presensi1);
                listPresensi2.add(presensi2);
                listPresensi2.add(presensi3);

                // Dummy MatkulAmbil Sarjana
                MataKuliah matkul1 = new MataKuliah(3, "IF-103", "Pemrograman Berorientasi Objek");
                MataKuliah matkul2 = new MataKuliah(2, "IF-104", "Algoritma");
                MataKuliah matkulPil = new MatkulPilihan(2, "IF-304", "AI", 15);
                ArrayList<MatkulAmbil> matkulSarjana = new ArrayList<>();
                MatkulAmbil matkulAmbilSarjana1 = new MatkulAmbil(matkul1, listPresensi1, 80.5, 85.0, 90.0);
                MatkulAmbil matkulAmbilSarjana2 = new MatkulAmbil(matkul2, listPresensi2, 80, 88.0, 90.0);
                MatkulAmbil matkulAmbilSarjana3 = new MatkulAmbil(matkulPil, listPresensi2, 90, 90.0, 95.0);

                matkulSarjana.add(matkulAmbilSarjana1);
                matkulSarjana.add(matkulAmbilSarjana2);
                matkulSarjana.add(matkulAmbilSarjana3);

                // Dummy data for Sarjana
                Sarjana mahasiswaSarjana1 = new Sarjana("Boston", "Permata Biru", "Medan 2004-12-15", "081234567890",
                                "1123039",
                                "Informatika", matkulSarjana);
                Sarjana mahasiswaSarjana2 = new Sarjana("Jochal", "Dipatiukur", "Bandung 2004-09-17", "081234567891",
                                "1123015",
                                "Informatika", matkulSarjana);

                // Dummy MatkulAmbil Magister
                ArrayList<MatkulAmbil> matkulMagister = new ArrayList<>();
                MataKuliah matkul3 = new MataKuliah(3, "IF-201", "Jaringan Komputer");
                MataKuliah matkul4 = new MataKuliah(4, "IF-202", "Basis Data");
                MataKuliah matkul5 = new MataKuliah(2, "IF-203", "Sistem Operasi");
                MatkulAmbil matkulAmbilMagister1 = new MatkulAmbil(matkul3, listPresensi2, 80.5, 85.0, 90.0);
                MatkulAmbil matkulAmbilMagister2 = new MatkulAmbil(matkul4, listPresensi1, 80, 88.0, 90.0);
                MatkulAmbil matkulAmbilMagister3 = new MatkulAmbil(matkul5, listPresensi2, 80, 88.0, 90.0);
                matkulMagister.add(matkulAmbilMagister1);
                matkulMagister.add(matkulAmbilMagister2);
                matkulMagister.add(matkulAmbilMagister3);

                // Dummy data for Magister
                Magister magister1 = new Magister("Calvin", "Jl. Aceh", "Bandung 2004-09-15", "082122221111", "112340",
                                "Magister Informatika", matkulMagister, "ALOKASI MEMORI EKSTRA");
                Magister magister2 = new Magister("Felix", "Jl. Jakarta", "Medan 2004-08-29", "081234567891", "1123015",
                                "Magister Informatika", matkulMagister,
                                "ALGORITMA PENAWARAN EDGE PADA BIPARTITE GRAPH");

                // Dummy data for Doktor
                Doktor doktor1 = new Doktor("Dewi Kusuma", "Jl. Merdeka No. 10", "1990-05-15", "081234567890",
                                "1124002",
                                "Teknik Elektro", "Penerapan Deep Learning pada Pengolahan Sinyal", 90, 92, 91);
                Doktor doktor2 = new Doktor("Budi Santoso", "Jl. Sudirman No. 22", "1988-07-20", "081987654321",
                                "1124002",
                                "Teknik Elektro", "Penerapan Deep Learning pada Pengolahan Sinyal", 88, 92, 89);
                Doktor doktor3 = new Doktor("Siti Rahma", "Jl. Diponegoro No. 5", "1991-09-10", "081223344556",
                                "1124003",
                                "Teknik Mesin", "Simulasi Dinamika Fluida untuk Sistem Pendingin", 90, 87, 91);

                // Staff

                // Dummy Presensi Staff
                // YY-MM-DD
                ArrayList<PresensiStaff> presensiStaffs = new ArrayList<>();
                Date date1 = Date.valueOf("2024-10-01");
                Date date2 = Date.valueOf("2024-10-15");
                Date date3 = Date.valueOf("2024-10-20");

                // Dummy data for PresensiStaff
                PresensiStaff presensiStaff1 = new PresensiStaff(date1, Status.HADIR, LocalTime.of(9, 0)); // 9:00 AM
                PresensiStaff presensiStaff2 = new PresensiStaff(date2, Status.ALPHA, LocalTime.of(13, 30)); // 1:30 PM
                PresensiStaff presensiStaff3 = new PresensiStaff(date3, Status.HADIR, LocalTime.of(8, 45)); // 8:45 AM

                presensiStaffs.add(presensiStaff1);
                presensiStaffs.add(presensiStaff2);
                presensiStaffs.add(presensiStaff3);

                // Dummy data for Karyawan
                Karyawan karyawan1 = new Karyawan("Ipnul", "Jl. Soekarno", "Jakarta 1985-11-12", "082112345671",
                                "32014567591",
                                3000000, presensiStaffs);
                Karyawan karyawan2 = new Karyawan("Joko", "Jl. Jalan", "Pontianak 1991-05-02", "082112345672",
                                "32023678612",
                                2500000, presensiStaffs);
                Karyawan karyawan3 = new Karyawan("Budi", "Jl. Cipadung", "Aceh 1999-05-02", "082112345673",
                                "32032789623",
                                2500000, presensiStaffs);

                // Dummy Matkul Diajar
                ArrayList<MatkulDiajar> matkulDiajars1 = new ArrayList<>();
                ArrayList<MatkulDiajar> matkulDiajars2 = new ArrayList<>();
                ArrayList<MatkulDiajar> matkulDiajars3 = new ArrayList<>();
                MatkulDiajar matkulDiajar1 = new MatkulDiajar(matkul5, presensiStaffs);
                MatkulDiajar matkulDiajar2 = new MatkulDiajar(matkul2, presensiStaffs);
                matkulDiajars1.add(matkulDiajar1);
                matkulDiajars1.add(matkulDiajar2);
                MatkulDiajar matkulDiajar3 = new MatkulDiajar(matkul3, presensiStaffs);
                matkulDiajars2.add(matkulDiajar3);
                MatkulDiajar matkulDiajar4 = new MatkulDiajar(matkul4, presensiStaffs);
                MatkulDiajar matkulDiajar5 = new MatkulDiajar(matkul5, presensiStaffs);
                matkulDiajars3.add(matkulDiajar4);
                matkulDiajars3.add(matkulDiajar5);

                // Dummy Data for Dosen
                Dosen dosen1 = new DosenTetap("Prof. Budi Santoso", "Jl. Diponegoro No. 5", "1965-03-12",
                                "081234567890",
                                "32014567891", "Teknik Informatika", matkulDiajars1, 5000000);
                Dosen dosen2 = new DosenTetap("Dr. Siti Rahmawati", "Jl. Gatot Subroto No. 10", "1973-07-05",
                                "081987654321",
                                "32023678912", "Teknik Elektro", matkulDiajars2, 4500000);
                Dosen dosen3 = new DosenHonorer("Dr. Ahmad Fauzi", "Jl. Sudirman No. 20", "1980-11-22", "081223344556",
                                "32032789123", "Teknik Mesin", matkulDiajars3, 200000);

                ArrayList<User> user = new ArrayList<>();
                user.add(mahasiswaSarjana1);
                user.add(mahasiswaSarjana2);
                user.add(magister1);
                user.add(magister2);
                user.add(doktor1);
                user.add(doktor2);
                user.add(doktor3);
                user.add(karyawan1);
                user.add(karyawan2);
                user.add(karyawan3);
                user.add(dosen1);
                user.add(dosen2);
                user.add(dosen3);

                return user;
        }

        public static void printData(ArrayList<User> user) {
                // Print data

                for (User _user : user) {
                        String msg = _user.toString();
                        System.out.println(msg);
                        System.out.println("====================================================================");
                }
        }

        public static void main(String[] args) {
                ArrayList<User> user = dummyData();
                printData(user);
        }
}
