package Latihan1;

public class Bola01 {
    double jariJari;

    Bola01(double jariJari) {
        this.jariJari = jariJari;
    }

    double hitungLuasPermukaan() {
        return 4 * Math.PI * jariJari * jariJari;
    }

    double hitungVolume() {
        return (4.0 / 3.0) * Math.PI * jariJari * jariJari * jariJari;
    }
}