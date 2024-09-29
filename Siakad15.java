import java.util.Scanner;

public class Siakad15 {
  public static void main(String[] args) {
    // Deklarasi scanner
    Scanner sc = new Scanner(System.in);

    // Deklarasi variabel
    String nama, nim;
    char kelas;
    byte absen;
    double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;

    // Masukkan input
    System.out.print("Masukkan nama\t: ");
    nama = sc.nextLine();
    System.out.print("Masukkan NIM\t: ");
    nim = sc.nextLine();
    System.out.print("Masukkan kelas\t: ");
    kelas = sc.nextLine().charAt(0);
    System.out.print("Masukkan nomor absen: ");
    absen = sc.nextByte();

    // Masukkan nilai
    System.out.print("Masukkan nilai kuis: ");
    nilaiKuis = sc.nextDouble();
    System.out.print("Masukkan nilai tugas: ");
    nilaiTugas = sc.nextDouble();
    System.out.print("Masukkan nilai ujian: ");
    nilaiUjian = sc.nextDouble();

    // Hitung nilai akhir
    // nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;
    nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;

    // Hitung nilai huruf & kualifikasi
    String nilaiHuruf, kualifikasi;

    if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
      nilaiHuruf = "A";
      kualifikasi = "Sangat Baik";
    }
    else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
      nilaiHuruf = "B+";
      kualifikasi = "Lebih dari Baik";
    }
    else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
      nilaiHuruf = "B";
      kualifikasi = "Baik";
    }
    else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
      nilaiHuruf = "C+";
      kualifikasi = "Lebih dari Cukup";
    }
    else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
      nilaiHuruf = "C";
      kualifikasi = "Cukup";
    }
    else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
      nilaiHuruf = "D";
      kualifikasi = "Kurang";
    }
    else if (nilaiAkhir <= 39) {
      nilaiHuruf = "E";
      kualifikasi = "Gagal";
    }
    else {
      nilaiHuruf = "Invalid";
      kualifikasi = "Invalid";
    }

    // Tampilkan output
    System.out.println("Nama: " + nama + " NIM: " + nim);
    System.out.println("Kelas: " + kelas + " Absen: " + absen);
    System.out.println("Nilai akhir: " + nilaiAkhir);
    System.out.println("Nilai akhir huruf: " + nilaiHuruf);
    System.out.println("Kualifikasi: " + kualifikasi);
  }
}