import java.util.Scanner;

public class Ex19 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite os três valores inteiros:");
        int lado1 = leitor.nextInt();
        int lado2 = leitor.nextInt();
        int lado3 = leitor.nextInt();

        // Criação do objeto Triangulo
        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);

        // Verificação e exibição do tipo de triângulo
        if (triangulo.verificarTriangulo()) {
            System.out.println("É um triângulo " + triangulo.tipoTriangulo());
        } else {
            System.out.println("Não é possível formar um triângulo com esses valores.");
        }

        leitor.close();
    }
}
