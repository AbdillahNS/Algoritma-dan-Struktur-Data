import java.util.Scanner;

public class MainSum01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("============================================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta, Misal 5,9)");
        System.out.print("Masukkan jumlah perusahaan: ");
        int jumlahPerusahaan = sc.nextInt();
        System.out.print("Masukkan jumlah bulan: ");
        int jumlahBulan = sc.nextInt();

        double[][] keuntunganPerusahaan = new double[jumlahPerusahaan][jumlahBulan];

        for (int i = 0; i < jumlahPerusahaan; i++) {
            System.out.println("============================================================");
            System.out.println("Masukkan data keuntungan untuk Perusahaan " + (i + 1) + ":");
            for (int j = 0; j < jumlahBulan; j++) {
                System.out.print("Masukkan untung bulan ke-" + (j + 1) + " = ");
                keuntunganPerusahaan[i][j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < jumlahPerusahaan; i++) {
            Sum01 sm = new Sum01(jumlahBulan);
            sm.setKeuntungan(keuntunganPerusahaan[i]);
            System.out.println("============================================================");
            System.out.println("Perusahaan " + (i + 1));
            System.out.println("Algoritma Brute Force");
            System.out.println("Total keuntungan perusahaan selama " + jumlahBulan + " bulan adalah = "
                    + sm.totalBF());
            System.out.println("Algoritma Divide Conquer");
            System.out.println("Total keuntungan perusahaan selama " + jumlahBulan + " bulan adalah = "
                    + sm.totalDC(0, jumlahBulan - 1));
        }
    }
}
