public class Graph01 {
    int vertex;
    DoubleLinkedList01 list[];

    public Graph01(int v) {
        vertex = v;
        list = new DoubleLinkedList01[v];
        for (int i = 0; i < v; i++) {
            list[i] = new DoubleLinkedList01();
        }
    }

    public void addEdge(int asal, int tujuan, int jarak) {
        list[asal].addFirst(tujuan, jarak); //directed
    }

    public void degree(int asal) throws Exception {
        int totalIn = 0, totalOut = list[asal].size();
        // InDegree
        for (int i = 0; i < vertex ; i++) {
            for (int j = 0; j < list[i].size(); j++) {
                if (list[i].get(j) == asal) {
                    totalIn++;
                }
            }
        }
        System.out.println("InDegree dari Gedung " +(char) ('A' + asal) + ": " + totalIn);
        System.out.println("OutDegree dari Gedung " +(char) ('A' + asal) + ": " + totalOut);
        System.err.println("Degree dari Gedung " +(char) ('A' + asal) + ": " + (totalIn + totalOut)); // Directed
    }

    public void removeEdge(int asal, int tujuan) throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (i == tujuan) {
                list[asal].remove(tujuan);
            }
        }
    }

    public void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graf berhasil dikosongkan");
    }

    public void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.println("Gedung " + (char) ('A' + i) + " terhubung dengan ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print((char) ('A' + list[i].get(j)) + " (" + list[i].getJarak(j) + "m),");
                }
                System.out.println("");
            }
        }
        System.out.println("");
    }
}