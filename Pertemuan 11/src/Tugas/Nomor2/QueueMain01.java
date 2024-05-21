package Tugas.Nomor2;

public class QueueMain01 {
    public static void main(String[] args) {
        Queue01 queue = new Queue01();

        queue.enqueue("111", "Anton");
        queue.enqueue("112", "Prita");
        queue.enqueue("113", "Yusuf");
        queue.enqueue("114", "Doni");
        queue.enqueue("115", "Sari");
        queue.print();

        System.out.println("Mengeluarkan Mahasiswa di antrian pertama");
        queue.dequeue();
        queue.print();
    }
}