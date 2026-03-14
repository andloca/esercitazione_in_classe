package esercizio_quattro;

public class som {
    public static void main(String[] args) {
        int a = Integer.parseInt(System.console().readLine("Insersci il valore di a: "));
        int b = Integer.parseInt(System.console().readLine("Insersci il valore di b: "));
        System.out.println("Il risutalto è: " + somma(a, b));
    }

    public static int somma(int a, int c) {
        return a + c;
    }
}