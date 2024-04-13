package exercicios;
public class exc6 {
    public static void main(String[] args) {
        int nmrAnterior = 0;
        int nmrAtual = 1;
        while (nmrAtual<=100) {
            System.out.println(nmrAtual);
            int prxNumero = nmrAnterior + nmrAtual;
            nmrAnterior = nmrAtual;
            nmrAtual = prxNumero;
        }
    }
}
