package Tugas;

public class Vaksin {
        int nomor;
        String nama;
        Vaksin prev, next;
    
        Vaksin(Vaksin prev, int no, String nama, Vaksin next) {
            this.prev = prev;
            nomor = no;
            this.nama = nama;
            this.next = next;
    }
}