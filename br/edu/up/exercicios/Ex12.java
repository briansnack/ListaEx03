    import java.util.Scanner;

    public class Ex12 {
        public static void executar() {
            Scanner leitor = new Scanner(System.in);
            Concessionaria concessionaria = new Concessionaria();
    
            char continuar;
            do {
                System.out.println("Digite o ano do veículo: ");
                int ano = leitor.nextInt();
                leitor.nextLine(); // Limpar o buffer de entrada
                
                System.out.println("Digite o valor do veículo: ");
                double valor = leitor.nextDouble();
                leitor.nextLine(); // Limpar o buffer de entrada
                
                concessionaria.calcularDesconto(ano, valor);
    
                System.out.println("Deseja continuar calculando desconto? (S/N)");
                continuar = leitor.next().charAt(0);
                leitor.nextLine(); // Limpar o buffer de entrada
            } while (continuar == 'S' || continuar == 's');
    
            concessionaria.mostrarTotais();
    
            leitor.close();
        }
    }
