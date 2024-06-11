import java.util.Scanner;
public class GraphMain01 {
    public static void main(String[] args) throws Exception {
        Graph01 gedung = new Graph01(6);
        Scanner sc = new Scanner(System.in);
        int menu;

        do {
        System.out.println("=========================");
        System.out.println("|          Menu         |");
        System.out.println("=========================");
        System.out.println("1. Add Edge");
        System.out.println("2. Remove Edge");
        System.out.println("3. Degree");
        System.out.println("4. Print Graph");
        System.out.println("5. Cek Edge");
        System.out.println("6. Update Jarak");
        System.out.println("7. Hitung Edge");
        System.out.println("0. Keluar");
        System.out.println("=========================");
        
        System.out.print("Pilih Menu : ");
        menu = sc.nextInt();
        sc.nextLine();
        
            switch (menu) {
                case 1:
                System.out.println("Penambahan Data");
                System.out.print("Asal : ");
                int asal = sc.nextInt();
                System.out.print("Tujuan : ");
                int tujuan = sc.nextInt();
                System.out.print("Jarak : ");
                int jarak = sc.nextInt();
                gedung.addEdge(asal, tujuan, jarak);
                break;

                case 2:
                System.out.println("Penghapusan Data");
                System.out.print("Asal : ");
                int asal1 = sc.nextInt();
                System.out.print("Tujuan : ");
                int tujuan1 = sc.nextInt();
                gedung.removeEdge(asal1, tujuan1);
                break;

                case 3:
                System.out.println("Degree");
                System.out.print("Asal : ");
                int asal2 = sc.nextInt();
                gedung.degree(asal2);
                break;

                case 4:
                System.out.println("Print Graph");
                gedung.printGraph();
                break;

                case 5:
                System.out.println("Cek Data");
                System.out.print("Asal   : ");
                int asal3 = sc.nextInt();
                System.out.print("Tujuan : ");
                int tujuan3 = sc.nextInt();
                gedung.cekEdge(asal3, tujuan3);
                break;

                case 6:
                System.out.println("Cek Data");
                System.out.print("Asal   : ");
                int asal4 = sc.nextInt();
                System.out.print("Tujuan : ");
                int tujuan4 = sc.nextInt();
                System.out.print("Update Jarak ");
                System.out.print("Jarak : ");
                int jarak4 = sc.nextInt();
                gedung.updateJarak(asal4, tujuan4, jarak4);
                break;

                case 7:
                System.out.println("Edge ada : " + gedung.hitungEdge());
                break;

                default:
                System.out.println("Pilihan Salah");
                break;
            }
        } while (menu != 0);
    }
}
