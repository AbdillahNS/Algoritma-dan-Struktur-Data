public class Hotel01 {
    String nama, kota;
    int harga;
    Byte bingtang;

    Hotel01(String n, String k, int h, Byte b) {
        nama = n;
        kota = k;
        harga = h;
        bingtang = b;
    }

    void tampil() {
        System.out.println("Nama : " + nama);
        System.out.println("Kota : " + kota);
        System.out.println("Harga : " + harga);
        System.out.println("Bintang : " + bingtang);
    }
}