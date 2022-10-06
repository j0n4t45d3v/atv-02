package programa;

import entidade.Lista;
import entidade.Pessoa;

public class Main {
    public static void main(String[] args) {
        Lista l = new Lista();
        Lista l2 = new Lista();
        Pessoa p = new Pessoa("joão", 1);
        Pessoa p1 = new Pessoa("pedro", 2);
        Pessoa p2 = new Pessoa("marcos", 0);
        Pessoa p3 = new Pessoa("fabio", 3);

        l.add(p1);
        l.add(p);
        l.add(p2);
        l.add(p3);
        l.remove(p1);
        l.printList();
        l.cloneList(l2);
        l2.printList();
        l.searchName(0);
    }
}
