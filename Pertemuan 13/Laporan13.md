ALGORITMA DAN STRUKTUR DATA </p>

<br><br><br><br>

<p align="center">
   <img src="https://static.wikia.nocookie.net/logopedia/images/8/8a/Politeknik_Negeri_Malang.png/revision/latest?cb=20190922202558" width="30%"> </p>

<br><br><br><br><br>

<p align = "center"> Nama  : Abdillah Noer Said </p>
<p align = "center"> NIM   : 2341720018 </p>
<p align = "center"> Prodi : TEKNIK INFOMATIKA</p>
<p align = "center"> Kelas : 1B </p>
<p align = "center"> Absen : 01 </p>

## Jobsheet 13

### Percobaan 1

Class Node
```java
public class Node {
    int data;
    Node prev, next;

    Node(Node prev, int data, Node next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
```

Class DoubleLinkedLists
```java
public class DoubleLinkedLists {
    Node head;
    int size;

    public DoubleLinkedLists() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int item) {
        if (isEmpty()) {
            head = new Node(null, item, null);
        } else {
            Node newNode = new Node(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;     
            }
            Node newNode = new Node(current, item, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(int item, int index) throws Exception {
        if (isEmpty()) {
            addFirst(item);     
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Node newNode = new Node(null, item, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node newNode = new Node(current.prev, item, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }

    public int size() {
        return size;    
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\nberhasil diisi");
        } else {
            System.out.println("Linked Lists kosong");
        }
    }
}
```

Class DoubleLinkedListsMain
```java
public class DoubleLinkedListsMain {
    public static void main(String[] args) throws Exception {
        DoubleLinkedLists dll = new DoubleLinkedLists();
        dll.print();
        System.out.println("Size : "+dll.size);
        System.out.println("==============================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : "+dll.size);
        System.out.println("==============================");
        dll.add(40, 1);
        dll.print();
        System.out.println("Size : "+dll.size);
        System.out.println("==============================");
        dll.clear();
        dll.print();
        System.out.println("Size : "+dll.size);
        System.out.println("==============================");
    }
}
```

Output<br>
![alt text](docs/img/OP1.png)

### Pertanyaan

1. Jelaskan perbedaan antara single linked list dengan double linked lists!<br>
Jawab : Single linked list adalah struktur data di mana setiap node memiliki satu pointer ke node berikutnya, memungkinkan traversal searah dari awal ke akhir. Ini lebih hemat memori karena hanya menggunakan satu pointer per node, tetapi operasi penambahan dan penghapusan node bisa memakan waktu lebih lama karena perlu traversal dari awal. Jika, double linked list memiliki dua pointer per node satu ke node berikutnya dan satu ke node sebelumnya, memungkinkan traversal dua arah. Ini membuat operasi penambahan dan penghapusan lebih fleksibel dan efisien, terutama untuk node di tengah atau akhir list, meskipun menggunakan lebih banyak memori.<br>

2. Perhatikan class Node, di dalamnya terdapat atribut next dan prev. Untuk apakah atribut tersebut?<br>
Jawab : Atribut next dan prev memungkinkan traversal dua arah dalam double linked list. Ini memberikan fleksibilitas untuk bergerak maju dan mundur melalui list, yang memudahkan operasi penambahan, penghapusan, dan pencarian node di berbagai posisi dalam list.<br>

3. Perhatikan konstruktor pada class DoubleLinkedLists. Apa kegunaan inisialisasi atribut head dan size seperti pada gambar berikut ini?
```java
public DoubleLinkedLists() {
        head = null;
        size = 0;
    }
```
Jawab : Inisialisasi ini memastikan bahwa double linked list dimulai dalam keadaan kosong dan siap untuk menerima operasi penambahan node secara dinamis.<br>

4. Pada method addFirst(), kenapa dalam pembuatan object dari konstruktor class Node prev dianggap sama dengan null?
Node newNode = new Node(null, item, head);<br>
Jawab : karena node baru tersebut akan menjadi node pertama dalam list. Sebagai node pertama, tidak ada node sebelum itu, sehingga prev harus 'null'.<br>

5. Perhatikan pada method addFirst(). Apakah arti statement head.prev = newNode ?<br>
Jawab : menghubungkan node yang sebelumnya menjadi head dengan node baru yang ditambahkan di depan list, memastikan bahwa double linked list tetap terhubung dengan benar dari kedua arah.<br>

6. Perhatikan isi method addLast(), apa arti dari pembuatan object Node dengan mengisikan parameter prev dengan current, dan next dengan null?<br>
Node newNode = new Node(current, item, null);<br>
Jawab : Menyambungkan node baru ke node terakhir yang ada (current) sebagai node berikutnya dan Menunjukkan bahwa node baru ini adalah node terakhir dalam list, sehingga next diatur null.<br>

7. Pada method add(), terdapat potongan kode program sebagai berikut:
```java
if (current.prev == null) {
                Node newNode = new Node(null, item, current);
                current.prev = newNode;
                head = newNode;
```
jelaskan maksud dari bagian yang ditandai dengan kotak kuning.<br>
Jawab : Untuk memastikan bahwa jika node baru ditambahkan pada posisi paling awal dalam double linked list, node baru tersebut akan diatur dengan benar sebagai node pertama, dan node yang sebelumnya menjadi head akan dihubungkan sebagai node berikutnya dalam list.<br>

### Percobaan 2

Modifikasi Class DoubelLinkedLists
```java
public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void remove(int index) throws Exception {
        if (isEmpty()) {
            throw new Exception("Nilai indeks di luar batas");
        } else if (index == 0) {
            removeFirst();
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }
```
Modifikasi Class DoubleLinkedListsMain
```java
        dll.addLast(50);
        dll.addLast(40);
        dll.addLast(10);
        dll.addLast(20);
        dll.print();
        System.out.println("Size : "+dll.size);
        System.out.println("==============================");
        dll.removeFirst();
        dll.print();
        System.out.println("Size : "+dll.size);
        System.out.println("==============================");
        dll.removeLast();
        dll.print();
        System.out.println("Size : "+dll.size);
        System.out.println("==============================");
        dll.remove(1);
        dll.print();
        System.out.println("Size : "+dll.size);
```

Output<br>
![alt text](docs/img/OP2.png)

### Pertanyaan

1. Apakah maksud statement berikut pada method removeFirst()?<br>
head = head.next;
head.prev = null;<br>
Jawab : Untuk menggeser head ke node berikutnya dalam list, karena node pertama akan dihapus, sehingga node yang berada di urutan kedua akan menjadi node pertama baru dan untuk memutuskan hubungan antara node pertama yang baru dengan node sebelumnya.<br>

2. Bagaimana cara mendeteksi posisi data ada pada bagian akhir pada method removeLast()?<br>
Jawab : Untuk menemukan node terakhir dan kemudian memeriksa apakah current.next adalah null. Jika iya, maka kita dapat menghapus current.next, menjadikan current sebagai node terakhir dalam list.<br>

3. Jelaskan alasan potongan kode program di bawah ini tidak cocok untuk perintah remove!
```java
Node tmp = head.next;

head.next=tmp.next;
tmp.next.prev=head;
```
Jawab : Karena tidak memperhatikan node yang akan dihapus bisa jadi node terakhir atau bukan. Ini dapat menyebabkan kehilangan referensi ke node-node lain dalam list.<br>

4. Jelaskan fungsi kode program berikut ini pada fungsi remove!
```java
    current.prev.next = current.next;
    current.next.prev = current.prev;
```
Jawab : Untuk memutuskan hubungan antara node yang akan dihapus dengan node sebelumnya dan node setelahnya dalam list, sehingga node yang dihapus tidak lagi terhubung dengan list.<br>

### Pecobaan 3

Modifikasi Class DoubleLinkedLists
```java
public int getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List kosong");
        }
        return head.data;
    }

    public int getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List kosong");
        } 
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int get(int index) throws Exception {
        if (isEmpty() || index >=size) {
            throw new Exception("Nilai indeks di luar batas");
        }
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
```

Modifikasi Class DoubleLinkedListsMain
```java
dll.print();
        System.out.println("Size : "+dll.size);
        System.out.println("==============================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : "+dll.size);
        System.out.println("==============================");
        dll.add(40, 1);
        dll.print();
        System.out.println("Size : "+dll.size);
        System.out.println("==============================");
        System.out.println("Data awa; pada Linked Lists adalah: " + dll.getFirst());
        System.out.println("Data akhir pada Linked Lists adalah: " + dll.getLast());
        System.out.println("Data indeks ke-1 pada Linked Lists adalah: " + dll.get(1));
```

Output<br>
![alt text](docs/img/OP3.png)

### Pertanyaan

1. Jelaskan method size() pada class DoubleLinkedLists!<br>
Jawab : Untuk mengembalikan jumlah node yang ada dalam double linked list. Ini memberikan informasi tentang berapa banyak elemen yang ada dalam list pada saat itu.<br>

2. Jelaskan cara mengatur indeks pada double linked lists supaya dapat dimulai dari indeks ke1!<br>
Jawab : Cara mengatur indeks pada double linked lists supaya dapat dimulai dari indeks ke-1 adalah dengan mengisi nilai awal variabel counter index (biasanya i) dengan 1 bukan nol. Berikut contohnya:
```java
Node current = head;
int i = 1; // sebelumnya int i = 0;
while (i < index) {
        current = current.next;
        i++;
```

3. Jelaskan perbedaan karakteristik fungsi Add pada Double Linked Lists dan Single Linked Lists!<br>
Jawab : Perbedaan antara fungsi add pada DLL dan SLL terletak pada kompleksitas waktu operasi penambahan di berbagai posisi dalam list. DLL memiliki fleksibilitas lebih besar untuk menambahkan elemen di tengah list dengan kompleksitas waktu yang tetap efisien, sementara SLL memiliki kompleksitas waktu yang lebih rendah untuk penambahan di depan list.<br>

4. Jelaskan perbedaan logika dari kedua kode program di bawah ini!<br>

A
```java
public boolean isEmpty(){
    if(size==o){
        return true;
    } else {
        return false;
    }
}
```
B
```java
public boolean isEmpty() {
        return head == null;
    }
```
Jawab : <br>
- Kode program A menggunakan variabel size untuk menentukan apakah linked list kosong atau tidak, sedangkan kode program B menggunakan variabel head.
- Kode program A bergantung pada jumlah elemen (size) dalam linked list, sementara kode program B bergantung pada keberadaan node pertama (head).
- Kode program B memiliki logika yang lebih langsung dan efisien, karena langsung memeriksa keberadaan node pertama, sementara kode program A memerlukan variabel tambahan (size) dan operasi perbandingan.

### Tugas Praktikum

1.  Buat program antrian vaksinasi menggunakan queue berbasis double linked list sesuai ilustrasi
dan menu di bawah ini! (counter jumlah antrian tersisa di menu cetak(3) dan data orang yang
telah divaksinasi di menu Hapus Data(2) harus ada)<br>

Class Vaksin
```java
package Tugas;

public class Vaksin {
        int nomor;
        String nama;
        Vaksin prev, next;
    
        Vaksin(Vaksin prev, int no, String nama, Vaksin next) {
            this.prev = prev;
            nomor = no;
            this.nama = nama;
            this.next = next;
    }
}
```

Class DLLVaksin
```java
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
```

Class DLLVaksinMain
```java
package Tugas;

import java.util.Scanner;

public class DLLVaksinMain {
    public static void menu() {
        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println(" PENGANTRI VAKSIN EXTRAVAGANZA");
        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println("\n1. Tambah Data Penerima Vaksin");
        System.out.println("2. Hapus Data Pengantri Vaksin");
        System.out.println("3. Daftar Penerima Vaksin");
        System.out.println("4. Keluar");
        System.out.println("+++++++++++++++++++++++++++++");
    }    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        DLLVaksin vaksinQueue = new DLLVaksin();

        short pilih;

        do {
            menu();
            pilih = sc.nextShort();
            switch (pilih) {
                case 1:
                    System.out.println("-----------------------------");
                    System.out.println("Masukkan Data Penerima Vaksin");
                    System.out.println("-----------------------------");
                    System.out.println("Nomor Antrian: ");
                    int no = sc.nextInt();
                    System.out.println("Nama Penerima: ");
                    String nama = s.nextLine();
                    vaksinQueue.Enqueue(no, nama);
                    break;
                case 2:
                    Vaksin data = vaksinQueue.Dequeue();
                    if (data != null) {
                        System.out.println(data.nama + " telah selesai di vaksinasi.");
                    } 
                    vaksinQueue.print();
                    break;
                case 3:
                    vaksinQueue.print();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Menu yang Anda masukkan tidak valid!");
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);
    }
}
```

Output<br>
Penambahan Data<br>
![alt text](docs/img/OPT1.1.png)

Cetak Data<br>
![alt text](docs/img/OPT1.2.png)

Hapus Data<br>
![alt text](docs/img/OPT1.3.png)

2. Buatlah program daftar film yang terdiri dari id, judul dan rating menggunakan double linked
lists, bentuk program memiliki fitur pencarian melalui ID Film dan pengurutan Rating secara
descending. Class Film wajib diimplementasikan dalam soal ini.

Class Film
```java
package Tugas;

public class Film {
    int id;
    String judul;
    double rating;
    Film prev, next;

    Film(Film prev, int id, String judul, double rate, Film next) {
        this.prev = prev;
        this.id = id;
        this.judul = judul;
        rating = rate;
        this.next = next;
    }
}
```

Class DLLFilm
```java
package Tugas;

public class DLLFilm {
    Film head;
    int size;

    public DLLFilm() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int id, String judul, double rate) {
        if (isEmpty()) {
            head = new Film(null, id, judul, rate, null);
        } else {
            Film newNode = new Film(null, id, judul, rate, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int id, String judul, double rate) {
        if (isEmpty()) {
            addFirst(id, judul, rate);
        } else {
            Film current = head;
            while (current.next != null) {
                current = current.next;     
            }
            Film newNode = new Film(current, id, judul, rate, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(int id, String judul, double rate, int index) throws Exception {
        if (isEmpty()) {
            addFirst(id, judul, rate);     
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        } else {
            Film current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Film newNode = new Film(null, id, judul, rate, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Film newNode = new Film(current.prev, id, judul, rate, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }

    public int size() {
        return size;    
    }

    public void print() {
        if (!isEmpty()) {
            Film tmp = head;
            while (tmp != null) {
                System.out.println("ID: " + tmp.id);
                System.out.println(" Judul Film: " + tmp.judul);
                System.out.println(" Rating Film: " + tmp.rating);
                tmp = tmp.next;
            }
        } else {
            System.out.println("Daftar Film masih kosong");
        }
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Daftar Film masih kosong, tidak dapat dihapus!");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Daftar Film masih kosong, tidak dapat dihapus!");
        } else if (head.next == null) {
            head = null;
            size --;
            return;
        } 
        Film current = head;
        while (current.next.next != null) {
            current = current.next;     
        }
        current.next = null;
        size--;
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks diluar batas");
        } else if (index == 0) {
            removeFirst();
        } else {
            Film current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }

    public Film findFilm(int key) {
        Film temp = head;
            while (temp != null) {
                if (temp.id == key) {
                    break;
                }
                temp = temp.next;
            }
        return temp;
    }

    public int findIdx(int key) {
        Film temp = head;
        int i = 0;
            while (temp != null) {
                if (temp.id == key) {
                    break;
                }
                temp = temp.next;
                i++;
            }
        return i;
    }

    public void sortDesc() {
        if (!isEmpty()) {
            boolean swapped;
            do {
                swapped = false;
                Film current = head;
                while (current.next != null) {
                    if (current.rating < current.next.rating) {
                        double tempRate = current.rating;
                        current.rating = current.next.rating;
                        current.next.rating = tempRate;
                        
                        int tempId = current.id;
                        current.id = current.next.id;
                        current.next.id = tempId;
                        
                        String tempJudul = current.judul;
                        current.judul = current.next.judul;
                        current.next.judul = tempJudul;
                        
                        swapped = true;
                    }
                    current = current.next;
                }
            } while (swapped);
        }
    }
}
```

Class DLLFilmMain
```java
package Tugas;

import java.util.Scanner;

public class DLLFilmMain {
    public static void menu() {
        System.out.println("===============================");
        System.out.println("DATA FILM LAYAR LEBAR");
        System.out.println("===============================");
        System.out.println("1. Tambah Data Awal");
        System.out.println("2. Tambah Data Akhir");
        System.out.println("3. Tambah Data Index Tertentu");
        System.out.println("4. Hapus Data Pertama");
        System.out.println("5. Hapus Data Terakhir");
        System.out.println("6. Hapus Data Tertentu");
        System.out.println("7. Cetak");
        System.out.println("8. Cari ID Film");
        System.out.println("9. Urut Data Rating Film-DESC");
        System.out.println("10. Keluar");
        System.out.println("===============================");
    } 
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        int id, idx;
        double rate;
        String judul;

        DLLFilm listFilm = new DLLFilm();

        short pilih;
        do {
            menu();
            pilih = sc.nextShort();
            switch (pilih) {
                case 1:
                    System.out.println("Masukkan Data Film Posisi Awal");
                    System.out.println("ID FIlm: ");
                    id = sc.nextInt();
                    System.out.println("Judul Film: ");
                    judul = s.nextLine();
                    System.out.println("Rating FIlm: ");
                    rate = sc.nextDouble();
                    listFilm.addFirst(id, judul, rate);
                    break;
                case 2:
                    System.out.println("Masukkan Data Film Posisi Akhir");
                    System.out.println("ID FIlm: ");
                    id = sc.nextInt();
                    System.out.println("Judul Film: ");
                    judul = s.nextLine();
                    System.out.println("Rating FIlm: ");
                    rate = sc.nextDouble();
                    listFilm.addLast(id, judul, rate);
                    break;
                case 3:
                    System.out.println("Masukkan Data Film");
                    System.out.println("Urutan ke- ");
                    idx = sc.nextInt();
                    System.out.println("ID FIlm: ");
                    id = sc.nextInt();
                    System.out.println("Judul Film: ");
                    judul = s.nextLine();
                    System.out.println("Rating FIlm: ");
                    rate = sc.nextDouble();
                    listFilm.add(id, judul, rate, idx);
                    System.out.println("Data Film ini akan masuk di urutan ke-");
                    System.out.println(idx);
                    break;
                case 4:
                    listFilm.removeFirst();
                    break;
                case 5:
                    listFilm.removeLast();
                    break;
                case 6:
                    System.out.println("Masukkan Urutan Data Film yang ingin dihapus");
                    idx = sc.nextInt();
                    listFilm.remove(idx);
                    break;
                case 7:
                    System.out.println("Cetak Data");
                    listFilm.print();
                    break;
                case 8:
                    System.out.println("Masukkan ID Film yang Anda cari");
                    int idKey = sc.nextInt();
                    Film found = listFilm.findFilm(idKey);
                    int pos = listFilm.findIdx(idKey);
                    if (found != null) {
                        System.out.println("Data Id Film: " + idKey + " berada di node ke- " + pos);
                        System.out.println("IDENTITAS");
                        System.out.println(" ID Film: " + found.id);
                        System.out.println(" Judul Film: " + found.judul);
                        System.out.println(" IMDB Rating: " + found.rating);
                    } else {
                        System.out.println("Film dengan ID " + idKey + "tidak ada di dalam list!");
                    }
                    break;
                case 9:   
                    listFilm.sortDesc();
                    listFilm.print();
                    break;
                case 10:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Menu yang Anda masukkan tidak valid!");
                    break;
            }
        } while (pilih <= 10 && pilih > 0);
    }
}
```

Output<br>
Menu Awal dan Penambahan Data<br>
![alt text](docs/img/OPT2.1.png)

![alt text](docs/img/OPT2.2.png)

Cetak Data<br>
![alt text](docs/img/OPT2.3.png)

Pencarian Data<br>
![alt text](docs/img/OPT2.4.png)