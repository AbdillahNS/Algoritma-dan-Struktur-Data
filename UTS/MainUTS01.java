package UTS;

import java.util.Scanner;

public class MainUTS01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        UTS01 nilai = new UTS01();
        nilai.data = new int[] { 10, 35, 21, 2, 47, 11, 48, 18, 6, 17, 11, 41, 43, 6, 43, 33, 7 };

        System.out.println("========================================================================");
        System.out.print("Data yang tersedia: ");
        nilai.tampil();

        System.out.println("========================================================================");
        System.out.print("Masukkan nilai yang akan dicari: ");
        int cari = sc.nextInt();

        System.out.println("====================================");
        System.out.print("Data sebelum diurutkan: ");
        nilai.tampil();
        int posisi = nilai.beforeSort(cari);
        if (posisi != -1) {
            System.out.println("Nilai " + cari + " ditemukan pada indeks: " + posisi);
        } else {
            System.out.println("Nilai " + cari + " tidak ditemukan");
        }
        System.out.println();

        nilai.SortAsc();
        System.out.print("Data setelah diurutkan secara Ascending: ");
        nilai.tampil();
        nilai.SortAsc();
        int afterSortAsc = nilai.binSearchAsc(cari, 0, nilai.data.length - 1);
        if (afterSortAsc != -1) {
            System.out.println("Nilai " + cari + " ditemukan pada indeks ke-" + (afterSortAsc)
                    + " setelah pengurutan Ascending");
        } else {
            System.out.println("Nilai " + cari + " tidak ditemukan");
        }
        System.out.println();

        nilai.SortDsc();
        System.out.print("Data setelah diurutkan secara Descending: ");
        nilai.tampil();
        nilai.SortDsc();
        int afterSortDsc = nilai.binSearchDsc(cari, 0, nilai.data.length - 1);
        if (afterSortDsc != -1) {
            System.out.println("Nilai " + cari + " ditemukan pada indeks ke-" + (afterSortDsc)
                    + " setelah pengurutan Descending");
        } else {
            System.out.println("Nilai " + cari + " tidak ditemukan");
        }
        System.out.println();
    }
}