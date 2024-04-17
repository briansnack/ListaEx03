import java.util.Random;

public class GeradorNumeros {
    private int quantidade;
    private int[] numeros;

    public GeradorNumeros(int quantidade){
        this.quantidade = quantidade;
        this.numeros = new int[quantidade];
    }
    public int[] gerarNumerosAleatorios() {
        Random random = new Random();
        
        for (int i = 0; i < quantidade; i++) {
            numeros[i] = random.nextInt(200) + 1; 
        }
        
        return numeros;
    }

    public int contarNumerosNoIntervalo() {
        int quantidade = 0;
        
        for (int numero : numeros) {
            if (estaNoIntervalo(numero)) {
                quantidade++;
            }
        }
        
        return quantidade;
    }

    public boolean estaNoIntervalo(int numero) {
        return numero >= 10 && numero <= 150;
    }
}
