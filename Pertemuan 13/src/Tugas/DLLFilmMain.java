package Tugas;

import java.util.Scanner;

public class DLLFilmMain {
    public static void menu() {
        System.out.println("===============================");
        System.out.println("DATA FILM LAYAR LEBAR");
        System.out.println("===============================");
        System.out.println("1. Tambah Data Awal");
        System.out.println("2. Tambah Data Akhir");
        System.out.println("3. Tambah Data Index Tertentu");
        System.out.println("4. Hapus Data Pertama");
        System.out.println("5. Hapus Data Terakhir");
        System.out.println("6. Hapus Data Tertentu");
        System.out.println("7. Cetak");
        System.out.println("8. Cari ID Film");
        System.out.println("9. Urut Data Rating Film-DESC");
        System.out.println("10. Keluar");
        System.out.println("===============================");
    } 
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        int id, idx;
        double rate;
        String judul;

        DLLFilm listFilm = new DLLFilm();

        short pilih;
        do {
            menu();
            pilih = sc.nextShort();
            switch (pilih) {
                case 1:
                    System.out.println("Masukkan Data Film Posisi Awal");
                    System.out.println("ID FIlm: ");
                    id = sc.nextInt();
                    System.out.println("Judul Film: ");
                    judul = s.nextLine();
                    System.out.println("Rating FIlm: ");
                    rate = sc.nextDouble();
                    listFilm.addFirst(id, judul, rate);
                    break;
                case 2:
                    System.out.println("Masukkan Data Film Posisi Akhir");
                    System.out.println("ID FIlm: ");
                    id = sc.nextInt();
                    System.out.println("Judul Film: ");
                    judul = s.nextLine();
                    System.out.println("Rating FIlm: ");
                    rate = sc.nextDouble();
                    listFilm.addLast(id, judul, rate);
                    break;
                case 3:
                    System.out.println("Masukkan Data Film");
                    System.out.println("Urutan ke- ");
                    idx = sc.nextInt();
                    System.out.println("ID FIlm: ");
                    id = sc.nextInt();
                    System.out.println("Judul Film: ");
                    judul = s.nextLine();
                    System.out.println("Rating FIlm: ");
                    rate = sc.nextDouble();
                    listFilm.add(id, judul, rate, idx);
                    System.out.println("Data Film ini akan masuk di urutan ke-");
                    System.out.println(idx);
                    break;
                case 4:
                    listFilm.removeFirst();
                    break;
                case 5:
                    listFilm.removeLast();
                    break;
                case 6:
                    System.out.println("Masukkan Urutan Data Film yang ingin dihapus");
                    idx = sc.nextInt();
                    listFilm.remove(idx);
                    break;
                case 7:
                    System.out.println("Cetak Data");
                    listFilm.print();
                    break;
                case 8:
                    System.out.println("Masukkan ID Film yang Anda cari");
                    int idKey = sc.nextInt();
                    Film found = listFilm.findFilm(idKey);
                    int pos = listFilm.findIdx(idKey);
                    if (found != null) {
                        System.out.println("Data Id Film: " + idKey + " berada di node ke- " + pos);
                        System.out.println("IDENTITAS");
                        System.out.println(" ID Film: " + found.id);
                        System.out.println(" Judul Film: " + found.judul);
                        System.out.println(" IMDB Rating: " + found.rating);
                    } else {
                        System.out.println("Film dengan ID " + idKey + "tidak ada di dalam list!");
                    }
                    break;
                case 9:   
                    listFilm.sortDesc();
                    listFilm.print();
                    break;
                case 10:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Menu yang Anda masukkan tidak valid!");
                    break;
            }
        } while (pilih <= 10 && pilih > 0);
    }
}