package modul4.view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

import modul4.controller.Controllers;
import modul4.model.classes.*;

public class ViewAll {

        public static void printData(String msg) {
                System.out.println(msg);
        }

        public static void printSearchUserData(ArrayList<User> _user) {
                String _nama = JOptionPane.showInputDialog(null, "Input nama user: ", "Input Nama",
                                JOptionPane.INFORMATION_MESSAGE);
                User userFound = Controllers.findUserData(_nama, _user);
                if (userFound != null) {
                        JOptionPane.showMessageDialog(null, userFound.toString(), "Data Ditemukan",
                                        JOptionPane.INFORMATION_MESSAGE);
                } else {
                        JOptionPane.showMessageDialog(null, "User not found!", "Data tidak ditemukan",
                                        JOptionPane.INFORMATION_MESSAGE);
                }
        }

        public static void printNAByNIM(ArrayList<User> _user) {
                String _nim = JOptionPane.showInputDialog(null, "Input NIM : ", "Input NIM",
                                JOptionPane.INFORMATION_MESSAGE);
                String _kodeMK = JOptionPane.showInputDialog(null, "Input Kode MK : ", "Input Kode MK",
                                JOptionPane.INFORMATION_MESSAGE);
                double rataRataNA = Controllers.nilaiAkhirMhs(_nim, _kodeMK, _user);
                if (rataRataNA >= 0) {
                        JOptionPane.showMessageDialog(null,
                                        "Nilai Akhir Mahasiswa dengan nim " + _nim + " : " + rataRataNA,
                                        "rata-rata Nilai Akhir",
                                        JOptionPane.INFORMATION_MESSAGE);
                } else if (rataRataNA == -1) {
                        JOptionPane.showMessageDialog(null, "Matakuliah tidak ditemukan!", "Data tidak ditemukan",
                                        JOptionPane.INFORMATION_MESSAGE);
                } else {
                        JOptionPane.showMessageDialog(null, "User tidak ditemukan!", "Data tidak ditemukan",
                                        JOptionPane.INFORMATION_MESSAGE);
                }
        }

        public static void printNilaiRataMK(ArrayList<User> _user) {
                String _kodeMK = JOptionPane.showInputDialog(null, "Input Kode MK : ", "Input Kode MK",
                                JOptionPane.INFORMATION_MESSAGE);
                double rata = Controllers.nilaiRataMK(_kodeMK, _user);
                JOptionPane.showMessageDialog(null, "Nilai Akhir MK dengan kode " + _kodeMK + " : " + rata,
                                "rata-rata Nilai Akhir MK",
                                JOptionPane.INFORMATION_MESSAGE);
        }

        public static void printTidakLulus(ArrayList<User> _user) {
                String _kodeMK = JOptionPane.showInputDialog(null, "Input Kode MK : ", "Input Kode MK",
                                JOptionPane.INFORMATION_MESSAGE);
                int[] tidakLulus = Controllers.mkTidakLulus(_kodeMK, _user);
                JOptionPane.showMessageDialog(null,
                                "<" + tidakLulus[1] + ">" + "<" + tidakLulus[0] + "> Mahasiswa tidak lulus matakuliah "
                                                + _kodeMK,
                                "Mahasiswa tidak lulus MK",
                                JOptionPane.INFORMATION_MESSAGE);
        }

        public static void printMatkulDiambilMhs(ArrayList<User> _user) {
                String _nim = JOptionPane.showInputDialog(null, "Input NIM : ", "Input NIM",
                                JOptionPane.INFORMATION_MESSAGE);
                HashMap<MataKuliah, Integer> matkulDimabil = Controllers.matkulAmbilMhs(_nim, _user);
                StringBuilder output = new StringBuilder();
                for (Map.Entry<MataKuliah, Integer> entry : matkulDimabil.entrySet()) {
                        MataKuliah matkul = entry.getKey();
                        int jumlahPresensi = entry.getValue();

                        output.append("Kode: ").append(matkul.getKode())
                                        .append(", SKS: ").append(matkul.getSks())
                                        .append(", Jumlah Presensi: ").append(jumlahPresensi)
                                        .append("\n");
                }
                JOptionPane.showMessageDialog(null, output.toString(), "Data Mata Kuliah",
                        JOptionPane.INFORMATION_MESSAGE);
        }

        public static void printJamMengajarDosen(ArrayList<User> _user){
                String _nik = JOptionPane.showInputDialog(null, "Input NIK : ", "Input NIK",
                                JOptionPane.INFORMATION_MESSAGE);
                String msg = Controllers.hitungJamMengajar(_nik, _user);
                JOptionPane.showMessageDialog(null, msg, "Data Mengajar Dosen",
                        JOptionPane.INFORMATION_MESSAGE);
        }
        
        public static void printGaji(ArrayList<User> _user){
                String _nik = JOptionPane.showInputDialog(null, "Input NIK : ", "Input NIK",
                                JOptionPane.INFORMATION_MESSAGE);
                String msg = Controllers.hitungSalary(_nik, _user);
                JOptionPane.showMessageDialog(null, msg, "Salary",
                        JOptionPane.INFORMATION_MESSAGE);
        }
        
        public static void showMenu(ArrayList<User> user) {
                int pilihan = -1;
                
                do {
                    String input = JOptionPane.showInputDialog(null,
                        "Menu:\n" +
                        "1. Print Search User Data\n" +
                        "2. Print NA By NIM\n" +
                        "3. Print Nilai Rata MK\n" +
                        "4. Print Tidak Lulus\n" +
                        "5. Print Matkul Diambil Mhs\n" +
                        "6. Print Jam Mengajar Dosen\n" +
                        "7. Print Gaji\n" +
                        "0. Keluar\n" +
                        "Pilih menu:", "Menu Utama", JOptionPane.INFORMATION_MESSAGE);
        
                    if (input == null) {  // Untuk menangani cancel di dialog
                        pilihan = 0;
                        break;
                    }
        
                    // Pengecekan apakah input adalah angka
                    if (input.matches("\\d+")) {
                        pilihan = Integer.parseInt(input);
                    } else {
                        JOptionPane.showMessageDialog(null, "Input tidak valid. Masukkan angka.");
                        continue;
                    }
        
                    switch (pilihan) {
                        case 1:
                            ViewAll.printSearchUserData(user);
                            break;
                        case 2:
                            ViewAll.printNAByNIM(user);
                            break;
                        case 3:
                            ViewAll.printNilaiRataMK(user);
                            break;
                        case 4:
                            ViewAll.printTidakLulus(user);
                            break;
                        case 5:
                            ViewAll.printMatkulDiambilMhs(user);
                            break;
                        case 6:
                            ViewAll.printJamMengajarDosen(user);
                            break;
                        case 7:
                            ViewAll.printGaji(user);
                            break;
                        case 0:
                            JOptionPane.showMessageDialog(null, "Keluar dari program.");
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Pilihan tidak valid. Coba lagi.");
                            break;
                    }
                } while (pilihan != 0);
            }
}
