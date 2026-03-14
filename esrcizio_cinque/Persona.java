package esrcizio_cinque;

public class Persona {
    protected String nome;
    protected int eta;

    public Persona(String n, int e) {
        this.nome = n;
        this.eta = e;
    }

    public String getNome() {
        return this.nome;
    }

    public int getEta() {
        return this.eta;
    }

    void saluta() {
        System.out.println("ciao, mi chiamo " + this.nome + " e ho " + this.eta + " anni");
    }
}
