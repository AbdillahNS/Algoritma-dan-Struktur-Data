public class MainMobil {
    public static void main(String[] args) {
        DaftarMobil01 outputMobil = new DaftarMobil01();
        System.out.println("=====================================================");
        System.out.println("Mobil dengan top Accaleration tertinggi adalah "
                + outputMobil.maxAcceleration(outputMobil.topAcceleration, 0, outputMobil.topAcceleration.length - 1));
        System.out.println("Mobil dengan top Accaleration terendah adalah "
                + outputMobil.minAcceleration(outputMobil.topAcceleration, 0, outputMobil.topAcceleration.length - 1));
        System.out.println("Rata-rata top power adalah " + outputMobil.rataPower());
    }
}