import java.util.Scanner;
    

public class Ex11 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        CadastroPessoa cadastro = new CadastroPessoa();

        for (int i = 0; i < 56; i++) {
            System.out.println("Digite o nome da pessoa " + (i + 1) + ": ");
            String nome = leitor.nextLine();

            System.out.println("Digite o sexo da pessoa (M/F) " + (i + 1) + ": ");
            char sexo = leitor.next().charAt(0);
            leitor.nextLine();

            CadastroPessoa.Pessoa pessoa = cadastro.novaPessoa(nome, sexo);
            cadastro.adicionarPessoa(pessoa);
        }

        cadastro.mostrarInformacoes();

        leitor.close();
    }
}
