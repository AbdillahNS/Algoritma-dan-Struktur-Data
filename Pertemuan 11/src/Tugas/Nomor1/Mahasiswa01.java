package Tugas.Nomor1;
public class Mahasiswa01 {
    String nim, nama;
    Mahasiswa01 next;

    Mahasiswa01(String nim, String nama, Mahasiswa01 next) {
        this.nim = nim;
        this.nama = nama;
        this.next = next;
    }
}