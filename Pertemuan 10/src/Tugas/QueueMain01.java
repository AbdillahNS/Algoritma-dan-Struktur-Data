package Tugas;

import java.util.Scanner;

public class QueueMain01 {
    public static void menu() {
        System.out.println("1. Tambah antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek antrian terdepan");
        System.out.println("4. Cek antrian belakang");
        System.out.println("5. Cari antrian pembeli");
        System.out.println("6. Cek semua antrian");
        System.out.println("----------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Masukkan kapasitas antrian : ");
        int jumlah = sc.nextInt();
        Queue01 Q = new Queue01(jumlah);
        int pilih;

        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan Nama : ");
                    String nama = sc.next();
                    System.out.print("Masukkan no Hp : ");
                    int noHP = Scanner.nextInt();
                    Pembeli01 pembeli = new Pembeli01(nama, noHP);
                    Q.Enqueue(pembeli);
                    break;
                case 2:
                    Pembeli01 data = Q.Dequeue();
                    if (data != null) {
                        System.out.println("Antrian yang dikeluarkan : " + data.nama + " No HP " + data.noHP);
                    }
                    break;
                case 3:
                    Q.peek();
                    break;
                case 4:
                    Q.peekRear();
                    break;
                case 5:
                    System.out.println("Masukkan nama Pembeli : ");
                    String cariNama = sc.next();
                    Q.peekPosition(cariNama);
                    break;
                case 6:
                    Q.daftarPembeli();
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6);
    }
}