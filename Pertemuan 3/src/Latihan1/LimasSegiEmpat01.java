package Latihan1;

public class LimasSegiEmpat01 {
    double sisiAlas;
    double tinggiLimas;

    LimasSegiEmpat01(double sisiAlas, double tinggiLimas) {
        this.sisiAlas = sisiAlas;
        this.tinggiLimas = tinggiLimas;
    }

    double hitungLuasPermukaan() {
        double luasAlas = sisiAlas * sisiAlas;
        double luasSegitiga = (sisiAlas - tinggiLimas) / 2;
        return luasAlas + 4 * luasSegitiga;
    }

    double hitungVolume() {
        return (1.0 / 3.0) * sisiAlas * sisiAlas * tinggiLimas;
    }
}