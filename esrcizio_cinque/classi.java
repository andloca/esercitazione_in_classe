package esrcizio_cinque;

public class classi {
    public static void main(String[] args) {
        Stampabile[] elenco = new Stampabile[2];

        Persona p = new Persona("Marco", 45);
        studente s = new studente("Luca", 21, "12345");

        p.stampa();
        s.stampa();
    }
}
