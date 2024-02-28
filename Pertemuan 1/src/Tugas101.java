import java.util.Scanner;

public class Tugas101 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] KODE = { "A", "B", "D", "E", "F", "G", "H", "L", "N", "T" };
        String[][] KOTA = {
                { "BANTEN" },
                { "JAKARTA" },
                { "BANDUNG" },
                { "CIREBON" },
                { "BOGOR" },
                { "PEKALONGAN" },
                { "SEMARANG" },
                { "SURABAYA" },
                { "MALANG" },
                { "TEGAL" }
        };

        System.out.print("Masukkan kode plat: ");
        String kodePlat = sc.nextLine();

        boolean kodeValid = false;

        for (int i = 0; i < KODE.length; i++) {
            if (kodePlat.equals(KODE[i])) {
                System.out.println("Nama kota: " + KOTA[i][0]);
                kodeValid = true;
                break;
            }
        }

        if (!kodeValid) {
            System.out.println("Kode plat tidak ditemukan");
        }
    }
}
