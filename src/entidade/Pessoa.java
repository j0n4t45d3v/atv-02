package entidade;

public class Pessoa {
    private String nome;
    private int chave;

    public Pessoa(String nome, int chave) {
        this.nome = nome;
        this.chave = chave;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getChave() {
        return chave;
    }

    public void setChave(int chave) {
        this.chave = chave;
    }
}
