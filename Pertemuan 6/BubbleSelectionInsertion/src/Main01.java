import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        DaftarMahasiswaBerprestasi01 list = new DaftarMahasiswaBerprestasi01();
        Mahasiswa01 m1 = new Mahasiswa01("Nusa", 2017, 25, 3);
        Mahasiswa01 m2 = new Mahasiswa01("Rara", 2012, 19, 4);
        Mahasiswa01 m3 = new Mahasiswa01("Dompu", 2018, 19, 3.5);
        Mahasiswa01 m4 = new Mahasiswa01("Abdul", 2017, 23, 2);
        Mahasiswa01 m5 = new Mahasiswa01("Ummi", 2019, 21, 3.75);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting : ");
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting desc berdasarkan IPK");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting asc berdasarkan IPK");
        list.selectionSort();
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting asc berdasarkan IPK");
        list.insertionSort();
        list.tampil();
    }
}
