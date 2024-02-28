import java.lang.Math;

public class Segitiga01 {
    public int alas;
    public int tinggi;

    public Segitiga01(int a, int t) {
        alas = a;
        tinggi = t;
    }

    public double hitungLuas() {
        return alas * tinggi / 2;
    }

    public double hitungKeliling() {
        double sisiMiring = Math.sqrt(alas * alas + tinggi * tinggi);
        return alas + tinggi + sisiMiring;
    }
}