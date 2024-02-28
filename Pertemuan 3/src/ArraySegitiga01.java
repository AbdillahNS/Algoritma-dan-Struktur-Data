public class ArraySegitiga01 {
    public static void main(String[] args) {
        Segitiga01[] sgArray = new Segitiga01[4];
        sgArray[0] = new Segitiga01(10, 4);
        sgArray[1] = new Segitiga01(20, 10);
        sgArray[2] = new Segitiga01(15, 6);
        sgArray[3] = new Segitiga01(25, 10);

        for (int i = 0; i < 4; i++) {
            System.out.println("Segitiga ke-" + i);
            System.out.println("Luas: " + sgArray[i].hitungLuas());
            System.out.println("Keliling: " + sgArray[i].hitungKeliling());
        }
    }
}