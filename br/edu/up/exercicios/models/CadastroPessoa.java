public class CadastroPessoa {
    static class Pessoa {
        public String nome;
        public char sexo;

        public Pessoa(String nome, char sexo) {
            this.nome = nome;
            this.sexo = sexo;
        }

        public String getNome() {
            return nome;
        }

        public char getSexo() {
            return sexo;
        }
    }

    private int totalHomens;
    private int totalMulheres;

    public CadastroPessoa() {
        totalHomens = 0;
        totalMulheres = 0;
    }

    public Pessoa novaPessoa(String nome, char sexo) {
        return new Pessoa(nome, sexo);
    }

    public void adicionarPessoa(Pessoa pessoa) {
        if (pessoa.getSexo() == 'M' || pessoa.getSexo() == 'm') {
            totalHomens++;
        } else if(pessoa.getSexo() == 'F' || pessoa.getSexo() == 'f'){
            totalMulheres++;
        }
    }

    public void mostrarInformacoes() {
        System.out.println("=== Informações ===");
        System.out.println("Total de homens: " + totalHomens);
        System.out.println("Total de mulheres: " + totalMulheres);
    }
}