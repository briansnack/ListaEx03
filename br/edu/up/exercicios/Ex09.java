import java.util.Random;

public class Ex09 {
    public static void executar() {
        int[] numeros = GeradorNumeros.gerarNumerosAleatorios(80);
        int quantidadeNumerosNoIntervalo = GeradorNumeros.contarNumerosNoIntervalo(numeros);
        
        System.out.println("Números gerados:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

        System.out.println("Quantidade de números no intervalo entre 10 e 150: " + quantidadeNumerosNoIntervalo);
    }
}
