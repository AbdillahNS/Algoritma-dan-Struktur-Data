public class Buku01 {
    int tahunTerbit, stock;
    String kodeBuku, judulBuku, pengarang;

    public Buku01(String kodeBuku, String judulBuku, int tahunTerbit, String pengarang, int stock) {
        this.kodeBuku = kodeBuku;
        this.judulBuku = judulBuku;
        this.tahunTerbit = tahunTerbit;
        this.pengarang = pengarang;
        this.stock = stock;
    }

    public void tampilDataBuku() {
        System.out.println("=========================");
        System.out.println("Kode buku : " + kodeBuku);
        System.out.println("Judul buku: " + judulBuku);
        System.out.println("Tahun Terbit : " + tahunTerbit);
        System.out.println("Pengarang  : " + pengarang);
        System.out.println("Stock : " + stock);
    }
}