package esrcizio_cinque;

public class studente extends Persona {
    String matricola;

    public studente(String nome, int e, String m) {
        super(nome, e);
        this.matricola = m;
    }

    @Override
    public void saluta() {
        System.out.println("Ciao, sono " + getNome() + ", ho " + getEta() + " anni e la mia matricola è " + matricola);
    }

    @Override
    public void stampa() {
        System.out.println("[Studente] Nome: " + getNome() + ", Matricola: " + matricola);
    }
}