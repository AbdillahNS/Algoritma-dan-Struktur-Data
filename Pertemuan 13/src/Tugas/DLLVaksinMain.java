package Tugas;

import java.util.Scanner;

public class DLLVaksinMain {
    public static void menu() {
        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println(" PENGANTRI VAKSIN EXTRAVAGANZA");
        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println("\n1. Tambah Data Penerima Vaksin");
        System.out.println("2. Hapus Data Pengantri Vaksin");
        System.out.println("3. Daftar Penerima Vaksin");
        System.out.println("4. Keluar");
        System.out.println("+++++++++++++++++++++++++++++");
    }    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        DLLVaksin vaksinQueue = new DLLVaksin();

        short pilih;

        do {
            menu();
            pilih = sc.nextShort();
            switch (pilih) {
                case 1:
                    System.out.println("-----------------------------");
                    System.out.println("Masukkan Data Penerima Vaksin");
                    System.out.println("-----------------------------");
                    System.out.println("Nomor Antrian: ");
                    int no = sc.nextInt();
                    System.out.println("Nama Penerima: ");
                    String nama = s.nextLine();
                    vaksinQueue.Enqueue(no, nama);
                    break;
                case 2:
                    Vaksin data = vaksinQueue.Dequeue();
                    if (data != null) {
                        System.out.println(data.nama + " telah selesai di vaksinasi.");
                    } 
                    vaksinQueue.print();
                    break;
                case 3:
                    vaksinQueue.print();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Menu yang Anda masukkan tidak valid!");
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);
    }
}
