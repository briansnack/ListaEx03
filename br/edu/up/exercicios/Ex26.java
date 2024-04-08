import java.util.Scanner;


public class Ex26 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o nome do pretendente: ");
        String nome = leitor.nextLine();

        System.out.println("Informe a idade do pretendente: ");
        int idade = leitor.nextInt();

        // Verificar se a idade está na faixa necessária
        if (idade < 17 || idade > 70) {
        System.out.println("Desculpe, o pretendente não se enquadra em nenhuma das categorias ofertadas.");
        } else {
        System.out.println("Informe o grupo de risco do pretendente (baixo/médio/alto): ");
        String grupoRisco = leitor.next().toLowerCase();

        int categoria = Categoria.determinarCategoria(idade, grupoRisco);

        System.out.println("Nome do pretendente: " + nome);
        System.out.println("Idade do pretendente: " + idade);
        System.out.println("Grupo de risco do pretendente: " + grupoRisco);
        System.out.println("Categoria: " + categoria);
        }

        leitor.close();
    }
}
