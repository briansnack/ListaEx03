 class Alistamento {
    private String nome;
    private char sexo;
    private int idade;
    private String saude;

    public Alistamento() {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.saude = saude;
    }

    public Alistamento(String nome2, char sexo2, int idade2, String saude2) {
        //TODO Auto-generated constructor stub
    }

    public String getNome() {
        return nome;
    }

    public char getSexo() {
        return sexo;
    }

    public int getIdade() {
        return idade;
    }

    public String getSaude() {
        return saude;
    }

    public void verificarIdade1(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'verificarIdade'");
    }
}

class ServicoMilitar {
    public int totalAptas;
    public int totalInaptas;

    public ServicoMilitar() {
        totalAptas = 0;
        totalInaptas = 0;
    }

    public void verificarAptidao(Alistamento alistamento) {
        if (alistamento.getSexo() == 'M' || alistamento.getSexo() == 'm' && alistamento.getIdade() >= 18 && alistamento.getIdade() <= 45 && alistamento.getSaude().equalsIgnoreCase("Apta") || alistamento.getSaude().equalsIgnoreCase("apta")) {
            System.out.println(alistamento.getNome() + " está apto para o serviço militar obrigatório.");
            totalAptas++;
        } else {
            System.out.println(alistamento.getNome() + " não está apto para o serviço militar obrigatório.");
            totalInaptas++;
        }
    }

    public void mostrarTotais() {
        System.out.println("Total de pessoas aptas: " + totalAptas);
        System.out.println("Total de pessoas inaptas: " + totalInaptas);
    }
}