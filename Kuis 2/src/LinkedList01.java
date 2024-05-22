public class LinkedList01 {
    Node01 head, tail;

    boolean isEmpty(){
        return head == null;
    }

    void print() {
        if (!isEmpty()) {
            Node01 tmp = head;
            System.out.println("\t\t\t\t====================");
            System.out.println("\t\t\t\t      Klasemen      ");
            System.out.println("\t\t\t\t====================");
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.printf("| %-4s | %-32s | %-7s | %-7s | %-7s | %-7s |\n", "Rank", "Tim", "Game", "Menang", "Kalah", "Poin");
            System.out.println("-----------------------------------------------------------------------------------");
            int i = 1;
            while(tmp != null){
                System.out.printf("| %-4s | %-32s | %-7s | %-7s | %-7s | %-7s |\n", i, tmp.data.namaTim, tmp.data.jmlMatch, tmp.data.jmlMenang, tmp.data.jmlKalah, tmp.data.point);
                tmp = tmp.next;
                i++;
            }
            System.out.println("-----------------------------------------------------------------------------------");
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    void addLast(Tim01 input) {
        Node01 ndInput = new Node01(input, null);
        if (!isEmpty()) {
            tail.next = ndInput;
            tail = ndInput;
        } else {
            head = ndInput;
            tail = ndInput;
        }
        sort();
    }

    public void search(String namaTim01){
        Node01 temp = head;
        int i = 1;
        while(temp != null){
            if (temp.data.namaTim.equalsIgnoreCase(namaTim01)) {
                System.out.printf("| %-4s | %-32s | %-7s | %-7s | %-7s | %-7s |\n", "Rank", "Tim", "Game", "Menang", "Kalah", "Poin");
                System.out.printf("| %-4s | %-32s | %-7s | %-7s | %-7s | %-7s |\n", i, temp.data.namaTim, temp.data.jmlMatch, temp.data.jmlMenang, temp.data.jmlKalah, temp.data.point);
                break;
            }
            temp = temp.next;
            i++;
        }
    }

    public void sort() {
        Node01 temp = head;
        while (temp != null) {
            Node01 temp2 = temp.next;
            while (temp2 != null) {
                if (temp.data.point < temp2.data.point) {
                    Tim01 temp3 = temp.data;
                    temp.data = temp2.data;
                    temp2.data = temp3;
                }
                temp2 = temp2.next;
            }
            temp = temp.next;
        }
    }

    public void Update(String namaTim1, int skor1, String namaTim2, int skor2) {
        Node01 tim1 = null, tim2 = null;
        Node01 temp = head;

        while (temp != null) {
            if (temp.data.namaTim.equalsIgnoreCase(namaTim1)) {
                tim1 = temp;
            } else if (temp.data.namaTim.equalsIgnoreCase(namaTim2)) {
                tim2 = temp;
            }
            if (tim1 != null && tim2 != null) {
                break;
            }
            temp = temp.next;
        }

        if (tim1 != null && tim2 != null) {
            tim1.data.jmlMatch++;
            tim2.data.jmlMatch++;
            if (skor1 > skor2) {
                tim1.data.jmlMenang++;
                tim1.data.point += 2;
                tim2.data.jmlKalah++;
                tim2.data.point += 1;
            } else {
                tim2.data.jmlMenang++;
                tim2.data.point += 2;
                tim1.data.jmlKalah++;
                tim1.data.point += 1;
            }
            sort();
            System.out.println("Klasemen berhasil diupdate.");
        } else {
            System.out.println("Tim tidak ditemukan dalam klasemen.");
        }
    }   
}