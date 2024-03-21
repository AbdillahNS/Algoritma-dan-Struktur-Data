public class MainHotel01 {
    public static void main(String[] args) {
        HotelService01 list = new HotelService01();
        Hotel01 h1 = new Hotel01("Hotel A", "Jakarta", 200000, (byte) 3);
        Hotel01 h2 = new Hotel01("Hotel B", "Bandung", 150000, (byte) 4);
        Hotel01 h3 = new Hotel01("Hotel C", "Malang", 300000, (byte) 5);
        Hotel01 h4 = new Hotel01("Hotel D", "Surabaya", 180000, (byte) 2);
        Hotel01 h5 = new Hotel01("Hotel E", "Semarang", 250000, (byte) 1);

        list.tambah(h1);
        list.tambah(h2);
        list.tambah(h3);
        list.tambah(h4);
        list.tambah(h5);

        System.out.println("Data Hotel sebelum sorting : ");
        list.tampil();

        System.out.println("Data Hotel setelah sorting asc berdasarkan Harga");
        list.bubbleSortHarga();
        list.tampil();

        System.out.println("Data Hotel setelah sorting desc berdasarkan Bintang");
        list.selectionSortRating();
        list.tampil();
    }
}
