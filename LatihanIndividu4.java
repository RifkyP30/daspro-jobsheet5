import java.util.Scanner;

public class LatihanIndividu4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Membuat variable
    int usia;
    String kategoriUsia;
    // Mengambil input dari user
    System.out.print("Masukkan usia anda: ");
    usia = sc.nextInt();
    // Menghitung kategori usia
    if (usia >= 0 && usia <= 12) {
      kategoriUsia = "Anak-anak";
    } 
    else if (usia >= 13 && usia <= 19) {
      kategoriUsia = "Remaja";
    }
    else if (usia >= 20 && usia <= 64) {
      kategoriUsia = "Dewasa";
    }
    else if (usia >= 65) {
      kategoriUsia = "Lansia";
    }
    else {
      kategoriUsia = "input tidak valid";
    }
    // Output 
    System.out.println("Usia anda: " + usia + " tahun");
    System.out.println("Kategori usia: " + kategoriUsia);
  }
}