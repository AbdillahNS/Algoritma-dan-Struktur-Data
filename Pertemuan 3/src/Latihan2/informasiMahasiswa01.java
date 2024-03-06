package Latihan2;

import java.util.Scanner;

public class informasiMahasiswa01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        dataMahasiswa01[] mahasiswa = new dataMahasiswa01[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("Masukkan nama: ");
            String nama = scanner.next();
            System.out.print("Masukkan nim: ");
            String nim = scanner.next();
            System.out.print("Masukkan jenis kelamin (P/L): ");
            char jenisKelamin = scanner.next().charAt(0);
            System.out.print("Masukkan IPK: ");
            double ipk = scanner.nextDouble();

            mahasiswa[i] = new dataMahasiswa01(nama, nim, jenisKelamin, ipk);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));
            System.out.println("Nama: " + mahasiswa[i].nama);
            System.out.println("NIM: " + mahasiswa[i].nim);
            System.out.println("Jenis kelamin: " + mahasiswa[i].jenisKelamin);
            System.out.println("Nilai IPK: " + mahasiswa[i].ipk);
        }

        double rataIPK = dataMahasiswa01.hitungRataIpk(mahasiswa);
        System.out.print("\nRata-rata IPK: " + rataIPK);

        dataMahasiswa01 mahasiswaTerbaik = dataMahasiswa01.mhsTerbaik(mahasiswa);
        System.out.println("\n===============================");
        System.out.println("Mahasiswa dengan IPK terbesar");
        System.out.println("===============================");
        System.out.println("Nama: " + mahasiswaTerbaik.nama);
        System.out.println("NIM: " + mahasiswaTerbaik.nim);
        System.out.println("Jenis kelamin: " + mahasiswaTerbaik.jenisKelamin);
        System.out.println("Nilai IPK: " + mahasiswaTerbaik.ipk);
    }
}