package Latihan2;

import java.util.Scanner;

public class InformasiMahasiswa01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jumlahMahasiswa = 3;

        String[] nama = new String[jumlahMahasiswa];
        String[] nim = new String[jumlahMahasiswa];
        char[] jenisKelamin = new char[jumlahMahasiswa];
        double[] ipk = new double[jumlahMahasiswa];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("Masukkan nama: ");
            nama[i] = scanner.next();
            System.out.print("Masukkan nim: ");
            nim[i] = scanner.next();
            System.out.print("Masukkan jenis kelamin (P/L): ");
            jenisKelamin[i] = scanner.next().charAt(0);
            System.out.print("Masukkan IPK: ");
            ipk[i] = scanner.nextDouble();
        }

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));
            System.out.println("Nama: " + nama[i]);
            System.out.println("NIM: " + nim[i]);
            System.out.println("Jenis kelamin: " + jenisKelamin[i]);
            System.out.println("Nilai IPK: " + ipk[i]);
        }
    }
}