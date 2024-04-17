class Pessoa {
    private int idade;

    public void setIdade(int idade){
        this.idade = idade;
    }
    public void verificarIdade() {
        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
    } 
}