package UTS;

public class UTS01 {

    int[] data;
    int idx;

    void tampil() {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    // Menggunakan Insertion Sort
    void SortAsc() {
        for (int i = 1; i < data.length; i++) {
            int key = data[i];
            int j = i - 1;

            while (j >= 0 && data[j] > key) {
                data[j + 1] = data[j];
                j = j - 1;
            }
            data[j + 1] = key;
        }
    }

    // Menggunakan Insertion Sort
    void SortDsc() {
        for (int i = 1; i < data.length; i++) {
            int key = data[i];
            int j = i - 1;

            while (j >= 0 && data[j] < key) {
                data[j + 1] = data[j];
                j = j - 1;
            }
            data[j + 1] = key;
        }
    }

    public int beforeSort(int cari) {
        return beforeSort(cari, 0, data.length - 1);
    }

    public int beforeSort(int cari, int left, int right) {
        if (left <= right) {
            int mid = left + (right - left) / 2;

            if (data[mid] == cari) {
                return mid;
            }

            int leftResult = beforeSort(cari, left, mid - 1);
            if (leftResult != -1) {
                return leftResult;
            }

            int rightResult = beforeSort(cari, mid + 1, right);
            if (rightResult != -1) {
                return rightResult;
            }
        }
        return -1;
    }

    public int binSearchAsc(int cari, int left, int right) {
        SortAsc();
        if (right >= left) {
            int mid = (left + right) / 2;
            if (cari == data[mid]) {
                return mid;
            } else if (cari < data[mid]) {
                return binSearchAsc(cari, left, mid - 1);
            } else {
                return binSearchAsc(cari, mid + 1, right);
            }
        }
        return -1;
    }

    public int binSearchDsc(int cari, int left, int right) {
        SortDsc();
        if (right >= left) {
            int mid = (left + right) / 2;
            if (cari == data[mid]) {
                return mid;
            } else if (cari > data[mid]) {
                return binSearchDsc(cari, left, mid - 1);
            } else {
                return binSearchDsc(cari, mid + 1, right);
            }
        }
        return -1;
    }
}