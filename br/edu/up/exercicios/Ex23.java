import java.util.Scanner;

public class Ex23 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o nome da pessoa: ");
        String nome = leitor.nextLine();

        System.out.println("Informe o sexo da pessoa (M/F): ");
        char sexo = leitor.next().charAt(0);

        System.out.println("Informe a altura da pessoa (em metros): ");
        double altura = leitor.nextDouble();

        System.out.println("Informe a idade da pessoa: ");
        int idade = leitor.nextInt();

        Pessoa1 pessoa = new Pessoa1(nome, sexo, altura, idade);

        double pesoIdeal = CalculadoraPesoIdeal.calcularPesoIdeal(pessoa); 
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Peso ideal: " + pesoIdeal + " kg");

        leitor.close();
        
    }
}
