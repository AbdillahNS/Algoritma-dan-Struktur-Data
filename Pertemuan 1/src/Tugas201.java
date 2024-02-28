import java.util.Scanner;

public class Tugas201 {
    static Scanner sc = new Scanner(System.in);
    static int pilih = 0;

    public static void main(String[] args) {
        switch (menu()) {
            case 1:
                System.out.println("Menu hitung kecepatan");
                hitungKecepatan();
                break;
            case 2:
                System.out.println("Menu hitung jarak");
                hitungJarak();
                break;
            case 3:
                System.out.println("Menu hitung waktu");
                hitungWaktu();
                break;
            default:
                System.out.println("Invalid menu");
                break;
        }
    }

    public static int menu() {
        System.out.println("Pilih menu : ");
        System.out.println("1. Hitung Kecepatan");
        System.out.println("2. Hitung Jarak");
        System.out.println("3. Hitung Waktu");
        System.out.println("====================");
        System.out.print("Pilih menu (1-3) : ");
        pilih = sc.nextInt();
        return pilih;
    }

    public static void hitungKecepatan() {
        System.out.print("Masukkan jarak (Km) : ");
        double jarak = sc.nextDouble();
        System.out.print("Masukkan waktu (Jam) : ");
        double waktu = sc.nextDouble();
        System.out.println("Kecepatan : " + jarak / waktu + " Km/Jam");
    }

    public static void hitungJarak() {
        System.out.print("Masukkan kecepatan (Km) : ");
        double kecepatan = sc.nextDouble();
        System.out.print("Masukkan waktu (Jam) : ");
        double waktu = sc.nextDouble();
        System.out.println("Jarak : " + kecepatan * waktu + " Km");
    }

    public static void hitungWaktu() {
        System.out.print("Masukkan jarak (Km) : ");
        double jarak = sc.nextDouble();
        System.out.print("Masukkan kecepatan (Jam) : ");
        double kecepatan = sc.nextDouble();
        System.out.println("Waktu : " + jarak / kecepatan + " Jam");
    }
}