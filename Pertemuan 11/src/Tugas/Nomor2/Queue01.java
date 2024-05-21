package Tugas.Nomor2;

public class Queue01 {
    Mahasiswa201 front, rear;

    boolean isEmpty() {
        return front == null;
    }

    void enqueue(String nim, String nama) {
        Mahasiswa201 newMhs = new Mahasiswa201(nim, nama, null);
        if (isEmpty()) {
            front = rear = newMhs;
        } else {
            rear.next = newMhs;
            rear = newMhs;
        }
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            front = front.next;
            if (front == null) {
                rear = null;
            }
        }
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            Mahasiswa201 tmp = front;
            System.out.println("Antrian: ");
            while (tmp != null) {
                System.out.println("NIM: " + tmp.nim + ", Nama: " + tmp.nama);
                tmp = tmp.next;
            }
        }
    }
}