package packFatorial;

public class CalculoFatorial {
	/**
     * Calcula n! (fatorial).
     *
     * @param n inteiro não‑negativo ≤ 20
     * @return n!
     * @throws IllegalArgumentException se n < 0 ou n > 20
     */
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Números negativos não são permitidos");
        }
        if (n > 20) {
            throw new IllegalArgumentException("Entrada muito grande; o resultado extrapola long");
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    /** Pequena demo em linha de comando. */
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Uso: java tdd.Tdd <numero>");
            return;
        }
        int n = Integer.parseInt(args[0]);
        System.out.printf("%d! = %d%n", n, factorial(n));
    }
}
