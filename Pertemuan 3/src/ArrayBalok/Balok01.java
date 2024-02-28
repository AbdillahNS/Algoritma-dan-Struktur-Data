package ArrayBalok;

public class Balok01 {
    public int panjang;
    public int lebar;
    public int tinggi;

    public Balok01(int p, int l, int t) {
        panjang = p;
        lebar = l;
        tinggi = t;
    }

    public int hitungVolume() {
        return panjang * lebar * tinggi;
    }
}