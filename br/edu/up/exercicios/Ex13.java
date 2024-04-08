import java.util.Scanner;

public class Ex13 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);{
            ServicoMilitar servicoMilitar = new ServicoMilitar();

            System.out.println("Quantas pessoas deseja cadastrar?");
            int n = leitor.nextInt();
            leitor.nextLine(); // Limpar o buffer de entrada

            for (int i = 0; i < n; i++) {
            System.out.println("Dados da pessoa " + (i + 1) + ":");
            System.out.println("Nome:");
            String nome = leitor.nextLine();
            System.out.println("Sexo (M/F):");
            char sexo = leitor.nextLine().toUpperCase().charAt(0);
            System.out.println("Idade:");
            int idade = leitor.nextInt();
            leitor.nextLine(); // Limpar o buffer de entrada
            System.out.println("Saúde (Apta/Inapta):");
            String saude = leitor.nextLine();

            Alistamento pessoa = new Alistamento(nome, sexo, idade, saude);
            servicoMilitar.verificarAptidao(pessoa);
        }

        servicoMilitar.mostrarTotais();

        leitor.close();
        }
    }
}
