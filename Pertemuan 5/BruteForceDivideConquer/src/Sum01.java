public class Sum01 {
    int elemen;
    double[] keuntungan;
    double total;

    Sum01(int elemen) {
        this.elemen = elemen;
        this.keuntungan = new double[elemen];
        this.total = 0;
    }

    public void setKeuntungan(double[] keuntungan) {
        this.keuntungan = keuntungan;
    }

    double totalBF() {
        total = 0;
        for (int i = 0; i < elemen; i++) {
            total = total + keuntungan[i];
        }
        return total;
    }

    double totalDC(int l, int r) {
        if (l == r) {
            return keuntungan[l];
        } else if (l < r) {
            int mid = (l + r) / 2;
            double lsum = totalDC(l, mid);
            double rsum = totalDC(mid + 1, r);
            return lsum + rsum;
        }
        return 0;
    }
}
