package ArrayBalok;

public class ArrayBalok01 {
    public static void main(String[] args) {
        Balok01[] blArray = new Balok01[3];
        blArray[0] = new Balok01(100, 30, 12);
        blArray[1] = new Balok01(120, 40, 15);
        blArray[2] = new Balok01(210, 50, 25);

        for (int i = 0; i < 3; i++) {
            System.out.println("Volume balok ke " + i + ": " + blArray[i].hitungVolume());
        }
    }
}