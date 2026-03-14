package esrcizio_cinque;

public class Persona {
    private String nome;
    private int eta;

    public Persona(String n, int e) {
        this.nome = n;
        setEta(e);
    }

    public String getNome() {
        return this.nome;
    }

    void saluta() {
        System.out.println("ciao, mi chiamo " + this.nome + " e ho " + this.eta + " anni");
    }
}
