public class BukuMain01 {

    public static void main(String[] args) {
        Buku01 bk1 = new Buku01();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        Buku01 bk2 = new Buku01("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        Buku01 bukuAbdillah = new Buku01("ALgoritma", "Abdillah", 100, 20, 50000);
        bukuAbdillah.terjual(13);
        bukuAbdillah.tampilInformasi();
        System.out.println("Total Harga: RP" + bukuAbdillah.hitungHargaTotal());
        System.out.println("Diskon : " + bukuAbdillah.hitungDiskon());
        System.out.println("Total Harga: RP" + bukuAbdillah.hitungHargaBayar());
    }
}