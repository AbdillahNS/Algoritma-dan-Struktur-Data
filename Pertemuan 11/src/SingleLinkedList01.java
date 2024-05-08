public class SingleLinkedList01 {
    Node01 head, tail;

    boolean isEmpty() {
        return head == null;
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
        } else {
            Node01 tmp = head;
            System.out.print("Isi Linked List:");
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        }
    }
    
    void addFirst(int input) {
        // node baru yang ditambahkan berisi data melalui parameter
        // pada method addFirst
        Node01 ndInput = new Node01(input, null);
        if(isEmpty()) { // jika kosong, maka peran head dan tail
                        // harus dimiliki node yang sama
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(int input) {
        // node baru yang ditambahkan berisi data melalui parameter
        // pada method addLast
        Node01 ndInput = new Node01(input, null);
        if(isEmpty()) { // jika kosong, maka peran head dan tail
                        // harus dimiliki node yang sama
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;   
            tail = ndInput;
        }
    }

    void insertAfter(int key, int input) {
        Node01 ndInput = new Node01(input, null);
        Node01 temp = head;
        do{
            if(temp.data == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if(ndInput.next == null) { // jika tidak ada node selanjutnya
                                           // maka jadikan ndInput sebagai tail
                    tail = ndInput;
                }
            }
            temp = temp.next;
        } while (temp != null); // selama masih ada node, dilanjutkan
    }

    void insertAt(int index, int input) {
        // pastikan operasi dari method ini adalah menggeser posisi
        // node yang terletak di indeks dan node tersebut berpindah satu indeks setelahnya
        if (index < 0) {
            System.out.println("Indeks tidak valid");
            return;
        } else if (index == 0) {
            addFirst(input);
            return;
        } else {
            Node01 ndInput = new Node01(input, null);
            Node01 temp = head;
            for (int i = 0; i < index - 1; i++) {
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