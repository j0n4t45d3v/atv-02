package entidade;

public class Node {
    private Pessoa value;
    private Node next;
    private Node prev;

    public Node(Pessoa value) {
        this.value = value;
        this.next = null;
        this.prev = null;
    }

    public Pessoa getValue() {
        return value;
    }

    public void setValue(Pessoa value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }
}
