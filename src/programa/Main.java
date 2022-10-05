package programa;

import entidade.Lista;
import entidade.Pessoa;

public class Main {
    public static void main(String[] args) {
        Lista l = new Lista();
        Pessoa p = new Pessoa("joão1", 1);
        Pessoa p1 = new Pessoa("joão2", 2);
        Pessoa p2 = new Pessoa("joão", 0);
        Pessoa p3 = new Pessoa("joão4", 3);

        l.add(p1);
        l.add(p);
        l.add(p2);
        l.add(p3);
        l.printList();

    }
}
