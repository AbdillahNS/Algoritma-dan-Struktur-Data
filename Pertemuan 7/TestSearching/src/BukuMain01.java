import java.util.Scanner;

public class BukuMain01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        PencarianBuku01 data = new PencarianBuku01();
        int jumBuku = 5;

        System.out.println("-----------------------------------------------------------");
        System.out.println("Masukkan data Buku secara urut dari KodeBuku Terkecil : ");
        for (int i = 0; i < jumBuku; i++) {
            System.out.println("-------------------------");
            System.out.print("Kode Buku \t : ");
            String kodeBuku = s1.nextLine();
            System.out.print("Judul buku \t : ");
            String judulBuku = s1.nextLine();
            System.out.print("Tahun Terbit \t : ");
            int tahunTerbit = s.nextInt();
            System.out.print("Pengarang \t : ");
            String pengarang = s1.nextLine();
            System.out.print("Stock \t\t : ");
            int stock = s.nextInt();

            Buku01 m = new Buku01(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(m);
        }
        System.out.println("-----------------------------------------------------------");
        System.out.println("Data keseluruhan Buku : ");
        data.tampil();
        System.out.println("___________________________________________________________");
        System.out.println("___________________________________________________________");
        System.out.println("Pencarian Data : ");
        System.out.println("1. Cari berdasarkan Kode Buku");
        System.out.println("2. Cari berdasarkan Judul Buku");
        System.out.print("Pilihan Anda: ");
        int pilihan = s.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Masukkan Kode Buku yang dicari : ");
                System.out.print("Kode Buku : ");
                String cariKode = s1.nextLine();
                System.out.println("Menggunakan sequential search:");
                int posisiKodeSeq = data.FindSeqSearch(cariKode);
                data.Tampilposisi(cariKode, posisiKodeSeq);
                data.TampilData(cariKode, posisiKodeSeq);
                System.out.println("\nMenggunakan binary search:");
                int posisiKodeBin = data.FindBinarySearch(cariKode, 0, jumBuku - 1);
                data.Tampilposisi(cariKode, posisiKodeBin);
                data.TampilData(cariKode, posisiKodeBin);
                break;
            case 2:
                System.out.println("Masukkan Judul Buku yang dicari : ");
                System.out.print("Judul Buku : ");
                String cariJudul = s1.nextLine();
                data.CariJudulBuku(cariJudul);
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }
    }
}
