public class Hanoi {

    static int movimentos = 0;
    static void hanoi(int n, char origem, char destino, char auxiliar) {
        if (n > 0) {
            hanoi(n - 1, origem, auxiliar, destino); // T(n-1) - variáveis // chamamos hanoi
            System.out.println("Moveu de " + origem + " para " + destino); // O(1)
            movimentos++; // O(1) (Tempo Constante)
            hanoi(n - 1, auxiliar, destino, origem); // T(n-1)
        }
    }

    public static void main(String[] args) {
        int n = 3;
        long t0 = System.currentTimeMillis();
        hanoi(n, 'A', 'C', 'B');
        long t1 = System.currentTimeMillis();
        System.out.println("Movimentos:  " + movimentos + " | Tempo: " + (t1 - t0) + " ms");
    }
}

