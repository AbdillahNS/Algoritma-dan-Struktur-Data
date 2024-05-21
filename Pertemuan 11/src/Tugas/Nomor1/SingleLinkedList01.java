package Tugas.Nomor1;

public class SingleLinkedList01 {
    Mahasiswa01 head, tail;

    boolean isEmpty() {
        return head == null;
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
        } else {
            Mahasiswa01 tmp = head;
            System.out.println("Linked list:");
            while (tmp != null) {
                System.out.println("NIM: " + tmp.nim + ", Nama: " + tmp.nama);
                tmp = tmp.next;
            }
        }
    }
    
    void addFirst(String nim, String nama) {
        Mahasiswa01 ndInput = new Mahasiswa01(nim, nama, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(String nim, String nama) {
        Mahasiswa01 ndInput = new Mahasiswa01(nim, nama, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;   
            tail = ndInput;
        }
    }

    void insertAfter(String key, String nim, String nama) {
        Mahasiswa01 ndInput = new Mahasiswa01(nim, nama, null);
        Mahasiswa01 temp = head;
        while (temp != null) {
            if (temp.nim.equals(key)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        }
    }

    void insertAt(int index, String nim, String nama) {
        if (index < 0) {
            System.out.println("Indeks tidak valid");
            return;
        } else if (index == 0) {
            addFirst(nim, nama);
            return;
        } else {
            Mahasiswa01 ndInput = new Mahasiswa01(nim, nama, null);
            Mahasiswa01 temp = head;
            for (int i = 0; i < index - 1; i++) {
                if (temp.next == null) {
                    System.out.println("Indeks tidak valid");
                    return;
                }
                temp = temp.next;
            }
            ndInput.next = temp.next;
            temp.next = ndInput;
            if (ndInput.next == null) {
                tail = ndInput;
            }
        }
    }
}