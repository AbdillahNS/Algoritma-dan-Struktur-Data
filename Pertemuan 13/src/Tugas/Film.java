package Tugas;

public class Film {
    int id;
    String judul;
    double rating;
    Film prev, next;

    Film(Film prev, int id, String judul, double rate, Film next) {
        this.prev = prev;
        this.id = id;
        this.judul = judul;
        rating = rate;
        this.next = next;
    }
}