package Latihan1;

import java.util.Scanner;

public class ArrayLatihan01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah bangun ruang: ");
        int jumlahBangunRuang = scanner.nextInt();

        Object[] bangunRuangArray = new Object[jumlahBangunRuang];

        for (int i = 0; i < jumlahBangunRuang; i++) {
            System.out.println("\nBangun Ruang ke-" + (i + 1));
            System.out.print("Pilih jenis bangun ruang (1. Kerucut, 2. Limas Segi Empat, 3. Bola): ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan jari-jari kerucut: ");
                    double jariJariKerucut = scanner.nextDouble();
                    System.out.print("Masukkan sisi miring kerucut: ");
                    double sisiMiringKerucut = scanner.nextDouble();
                    bangunRuangArray[i] = new Kerucut01(jariJariKerucut, sisiMiringKerucut);
                    break;
                case 2:
                    System.out.print("Masukkan panjang sisi alas limas: ");
                    double panjangSisiAlasLimas = scanner.nextDouble();
                    System.out.print("Masukkan tinggi limas: ");
                    double tinggiLimas = scanner.nextDouble();
                    bangunRuangArray[i] = new LimasSegiEmpat01(panjangSisiAlasLimas, tinggiLimas);
                    break;
                case 3:
                    System.out.print("Masukkan jari-jari bola: ");
                    double jariJariBola = scanner.nextDouble();
                    bangunRuangArray[i] = new Bola01(jariJariBola);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    i--;
                    break;
            }
        }

        System.out.println("\nHasil Perhitungan:");
        for (int i = 0; i < jumlahBangunRuang; i++) {
            System.out.println("\nBangun Ruang ke-" + (i + 1));
            if (bangunRuangArray[i] instanceof Kerucut01) {
                Kerucut01 kerucut = (Kerucut01) bangunRuangArray[i];
                System.out.println("Luas Permukaan: " + kerucut.hitungLuasPermukaan());
                System.out.println("Volume: " + kerucut.hitungVolume());
            } else if (bangunRuangArray[i] instanceof LimasSegiEmpat01) {
                LimasSegiEmpat01 limas = (LimasSegiEmpat01) bangunRuangArray[i];
                System.out.println("Luas Permukaan: " + limas.hitungLuasPermukaan());
                System.out.println("Volume: " + limas.hitungVolume());
            } else if (bangunRuangArray[i] instanceof Bola01) {
                Bola01 bola = (Bola01) bangunRuangArray[i];
                System.out.println("Luas Permukaan: " + bola.hitungLuasPermukaan());
                System.out.println("Volume: " + bola.hitungVolume());
            }
        }
    }
}