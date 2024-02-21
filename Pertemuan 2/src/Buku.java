public class Buku {
    String judul, pengarang;
    int halaman, stok, harga;

    public Buku() {

    }

    public Buku(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: RP " + harga);
    }

    void terjual(int jml) {
        if (stok > 0 && stok >= jml) {
            stok -= jml;
        } else {
            System.out.println("Stok buku " + judul + " Sudah habis");
        }
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }

    void hitungHargaTotal() {

    }
}