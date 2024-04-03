import java.util.Arrays;

public class PencarianBuku01 {
    Buku01 listBk[] = new Buku01[5];
    int idx;

    void tambah(Buku01 m) {
        if (idx < listBk.length) {
            listBk[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil() {
        for (Buku01 m : listBk) {
            m.tampilDataBuku();
        }
    }

    public int FindSeqSearch(String cari) {
        int posisi = -1;
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].kodeBuku.equals(cari)) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public void Tampilposisi(String x, int pos) {
        if (pos != -1) {
            System.out.println("Data : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data : " + x + " tidak ditemukan");
        }
    }

    public void TampilData(String x, int pos) {
        if (pos != -1) {
            System.out.println("Kode Buku\t : " + x);
            System.out.println("Judul\t\t : " + listBk[pos].judulBuku);
            System.out.println("Tahun Terbit\t : " + listBk[pos].tahunTerbit);
            System.out.println("Pengarang\t : " + listBk[pos].pengarang);
            System.out.println("Stock\t\t : " + listBk[pos].stock);
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }

    public int FindBinarySearch(String cari, int left, int right) {
        if (right >= left) {
            int mid = (left + right) / 2;
            if (listBk[mid].kodeBuku.compareTo(cari) == 0) {
                return mid;
            } else if (listBk[mid].kodeBuku.compareTo(cari) > 0) {
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }

    public int FindSeqSearchJudul(String cari) {
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].judulBuku.equalsIgnoreCase(cari)) {
                return j;
            }
        }
        return -1;
    }

    public int FindBinarySearchJudul(String cari, int left, int right) {
        if (right >= left) {
            int mid = (left + right) / 2;
            if (listBk[mid].judulBuku.compareToIgnoreCase(cari) == 0) {
                return mid;
            } else if (listBk[mid].judulBuku.compareToIgnoreCase(cari) > 0) {
                return FindBinarySearchJudul(cari, left, mid - 1);
            } else {
                return FindBinarySearchJudul(cari, mid + 1, right);
            }
        }
        return -1;
    }

    public void sortDataJudul() {
        Arrays.sort(listBk, (a, b) -> a.judulBuku.compareToIgnoreCase(b.judulBuku));
    }

    public void CariJudulBuku(String judul) {
        sortDataJudul(); // Sorting
        int posSeqSearch = FindSeqSearchJudul(judul);
        int posBinarySearch = FindBinarySearchJudul(judul, 0, listBk.length - 1);
        boolean lebihDariSatuSeq = false;
        boolean lebihDariSatuBin = false;

        if (posSeqSearch != -1) {
            System.out.println("Menggunakan sequential search:");
            Tampilposisi(judul, posSeqSearch);
            TampilData(listBk[posSeqSearch].kodeBuku, posSeqSearch);
            // Mencari buku lain dengan judul yang sama
            for (int i = posSeqSearch + 1; i < listBk.length; i++) {
                if (listBk[i].judulBuku.equalsIgnoreCase(judul)) {
                    System.out.println("========================");
                    TampilData(listBk[i].kodeBuku, i);
                    lebihDariSatuSeq = true;
                } else {
                    break;
                }
            }
        } else {
            System.out.println("Data " + judul + " tidak ditemukan dengan sequential search");
        }

        if (posBinarySearch != -1) {
            System.out.println("\nMenggunakan binary search setelah pengurutan:");
            Tampilposisi(judul, posBinarySearch);
            TampilData(listBk[posBinarySearch].kodeBuku, posBinarySearch);
            // Mencari buku lain dengan judul yang sama
            int i = posBinarySearch - 1;
            while (i >= 0 && listBk[i].judulBuku.equalsIgnoreCase(judul)) {
                System.out.println("========================");
                TampilData(listBk[i].kodeBuku, i);
                i--;
                lebihDariSatuBin = true;
            }
            i = posBinarySearch + 1;
            while (i < listBk.length && listBk[i].judulBuku.equalsIgnoreCase(judul)) {
                System.out.println("========================");
                TampilData(listBk[i].kodeBuku, i);
                i++;
                lebihDariSatuBin = true;
            }
        } else {
            System.out.println("\nData " + judul + " tidak ditemukan dengan binary search setelah pengurutan");
        }

        // Peringatan jika ada lebih dari satu Judul Buku
        if (lebihDariSatuSeq || lebihDariSatuBin) {
            System.out.println("\nPeringatan: Terdapat lebih dari satu hasil dengan judul " + judul);
        }
    }
}