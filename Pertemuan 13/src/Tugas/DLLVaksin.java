package Tugas;

public class DLLVaksin {
    Vaksin head;
    int size;

    public DLLVaksin() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int no, String nama) {
        if (isEmpty()) {
            head = new Vaksin(null, no, nama, null);
        } else {
            Vaksin newNode = new Vaksin(null, no, nama, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int no, String nama) {
        if (isEmpty()) {
            addFirst(no, nama);
        } else {
            Vaksin current = head;
            while (current.next != null) {
                current = current.next;     
            }
            Vaksin newNode = new Vaksin(current, no, nama, null);
            current.next = newNode;
            size++;
        }
    }

    public int size() {
        return size;    
    }

    public void print() {
        if (!isEmpty()) {
            Vaksin tmp = head;
            System.out.println("++++++++++++++++++++++++");
            System.out.println("Daftar Pengantri Vaksin");
            System.out.println("++++++++++++++++++++++++");
            System.out.println("|No." + "\t" + "|Nama" + "\t" + "|");
            while (tmp != null) {
                System.out.println("|" + tmp.nomor + "\t" + "|" + tmp.nama + "\t" + "|");
                tmp = tmp.next;
            }
            System.out.printf("Sisa Antrian: %d\n", size);
        } else {
            System.out.println("Antrian masih kosong!");
        }
    }

    void Enqueue(int no, String nama) {
        if (isEmpty()) {
            addFirst(no, nama);
        } else {
            addLast(no, nama);
        }
    }

    Vaksin Dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong, tidak dapat dihapus!");
            return null;
        } else if (size == 1) {
            Vaksin eq = head;
            head = null;
            size --;
            return eq;
        } else {
            Vaksin eq = head;
            head = head.next;
            head.prev = null;
            size--;
            return eq;
        }      
    }
}
