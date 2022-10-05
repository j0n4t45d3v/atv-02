package entidade;

public class Lista {
    private Node head;
    private Node tail;

    public Lista() {
        this.head = null;
        this.tail = null;
    }

    public void add(Pessoa value){
        Node node = new Node(value);

        if(this.head == null){
            this.head = node;
            this.tail = node;
        }else{
            Node p = this.head;

            while(p != null){
                if(node.getValue().getChave() < p.getValue().getChave()){
                    if(p.equals(this.head)){
                        node.setNext(this.head);
                        this.head.setPrev(node);
                        this.head = node;
                    } else{
                        node.setNext(p);
                        p.setPrev(node);
                    }
                    break;
                }
                if(p.equals(this.tail) && node.getValue().getChave() > p.getValue().getChave()){
                    this.tail.setNext(node);
                    node.setPrev(this.tail);
                    this.tail = node;
                    break;
                }
                p = p.getNext();
            }
        }
    }

    public void printList(){
        Node p = this.head;
        while (p != null){
            System.out.println("Id: "+p.getValue().getChave()+", Nome: "+p.getValue().getNome());
            p = p.getNext();
        }
    }

}
