public class Node01 {
    int data;
    Node01 prev, next;
    int jarak;

    Node01(Node01 prev, int data, int jarak, Node01 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
        this.jarak = jarak;
    }
}