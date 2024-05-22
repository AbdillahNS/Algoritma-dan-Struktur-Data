import java.util.Scanner;

public class Main01 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    LinkedList01 singLL = new LinkedList01();

    singLL.addLast(new Tim01("Pelita Jaya Jakarta", 15, 14, 1, 29));
    singLL.addLast(new Tim01("Dewa United Banten", 15, 13, 2, 28));
    singLL.addLast(new Tim01("Kesatria Bengawan Solo", 15, 13, 2, 28));
    singLL.addLast(new Tim01("Bali United Basketball", 15, 12, 3, 27));
    singLL.addLast(new Tim01("Rajawali Medan", 15, 12, 3, 27));
    singLL.addLast(new Tim01("Prawira Harum Bandung", 15, 11, 4, 26));
    singLL.addLast(new Tim01("RANS Simba Bogor", 15, 10, 5, 25));
    singLL.addLast(new Tim01("Satria Muda Pertamina Jakarta", 15, 10, 5, 25));
    singLL.addLast(new Tim01("Borneo Hornbills", 15, 10, 5, 25));
    singLL.addLast(new Tim01("Amartha Hangtuah Jakarta", 15, 9, 6, 24));
    singLL.addLast(new Tim01("Satya Wacana Salatiga", 15, 8, 7, 23));
    singLL.addLast(new Tim01("Bima Perkasa Jogja", 15, 7, 8, 22));
    singLL.addLast(new Tim01("Tangerang Hawks Basketball Club", 15, 5, 10, 20));
    singLL.addLast(new Tim01("Pacific Caesar Surabaya", 15, 4, 11, 19));    

    while (true) {
        System.out.println("=================================================");
        System.out.println("    Klasemen Liga Bola Basket Indonesia - IBL   ");
        System.out.println("=================================================");
        System.out.println("1. Lihat Klasmen");
        System.out.println("2. Update Klasmen"); 
        System.out.println("0. Keluar");
        System.out.println("===================");
        System.out.print("Pilih menu: ");
        int pilih = sc.nextInt();
        sc.nextLine();
        switch (pilih) {

            case 1:
                singLL.print();
                break;

            case 2:
                System.out.println("============================================");
                System.out.println(" Masukkan Nama dan Skor Tim yang Bertanding");
                System.out.println("============================================");
                System.out.print("Nama Tim pertama: ");
                String namaTim1 = sc.nextLine();
                System.out.print("Skor Tim pertama: ");
                int skor1 = sc.nextInt();
                sc.nextLine();
                System.out.print("Nama Tim kedua: ");
                String namaTim2 = sc.nextLine();
                System.out.print("Skor Tim kedua: ");
                int skor2 = sc.nextInt();
                singLL.Update(namaTim1, skor1, namaTim2, skor2);
                break;
            
            case 0:
                System.exit(0);
                break;
        
            default:
                System.out.println("Pilihan tidak tersedia");
                break;
            }
        }
    }
}