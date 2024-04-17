public class Ex09 {
    public static void executar() {
        GeradorNumeros gerador = new GeradorNumeros(80);
        int[] numeros = gerador.gerarNumerosAleatorios();
        int quantidadeNumerosNoIntervalo = gerador.contarNumerosNoIntervalo();
        
        System.out.println("Números gerados:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

        System.out.println("Quantidade de números no intervalo entre 10 e 150: " + quantidadeNumerosNoIntervalo);
    }
}
