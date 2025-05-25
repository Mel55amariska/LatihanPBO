public class Node {
    private int value;
    private Node nextNode; // Objek Node menjadi tipe data untuk atribut nextNode

    public Node(int value) {
        this.value = value;
        this.nextNode = null; // Inisialisasi awal
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}