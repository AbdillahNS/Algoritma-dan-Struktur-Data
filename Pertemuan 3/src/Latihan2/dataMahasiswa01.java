package Latihan2;

public class dataMahasiswa01 {
    public String nama, nim;
    public char jenisKelamin;
    public double ipk;

    public dataMahasiswa01(String nama, String nim, char jenisKelamin, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jenisKelamin = jenisKelamin;
        this.ipk = ipk;
    }

    public static double hitungRataIpk(dataMahasiswa01[] mhs) {
        double totalIpk = 0;
        for (dataMahasiswa01 mahasiswa : mhs) {
            totalIpk += mahasiswa.ipk;
        }
        return totalIpk / mhs.length;
    }

    public static dataMahasiswa01 mhsTerbaik(dataMahasiswa01[] mhs) {
        dataMahasiswa01 mhsTerbaik = mhs[0];
        for (dataMahasiswa01 mahasiswa : mhs) {
            if (mahasiswa.ipk > mhsTerbaik.ipk) {
                mhsTerbaik = mahasiswa;
            }
        }
        return mhsTerbaik;
    }
}
