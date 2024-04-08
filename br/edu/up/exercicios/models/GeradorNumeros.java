import java.util.Random;

public class GeradorNumeros {

    public static int[] gerarNumerosAleatorios(int quantidade) {
        int[] numeros = new int[quantidade];
        Random random = new Random();
        
        for (int i = 0; i < quantidade; i++) {
            numeros[i] = random.nextInt(200) + 1; 
        }
        
        return numeros;
    }

    public static int contarNumerosNoIntervalo(int[] numeros) {
        int quantidade = 0;
        
        for (int numero : numeros) {
            if (estaNoIntervalo(numero)) {
                quantidade++;
            }
        }
        
        return quantidade;
    }

    public static boolean estaNoIntervalo(int numero) {
        return numero >= 10 && numero <= 150;
    }
}
