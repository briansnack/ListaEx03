class PrecoProdutos {
    private double mediaPrecoCusto;
    private double mediaPrecoVenda; 
    
    public void verificarLucroPrejuizo(double precoCusto, double precoVenda){
        if (precoVenda > precoCusto) {
            System.out.println("Lucro: Produto vendido por R$" + precoVenda + ", preço de custo R$" + precoCusto);
        } else if (precoVenda < precoCusto) {
            System.out.println("Prejuízo: Produto vendido por R$" + precoVenda + ", preço de custo R$" + precoCusto);
        } else {
            System.out.println("Empate: Produto vendido por R$" + precoVenda + ", preço de custo R$" + precoCusto);
        }
    }

    public void calcularMediaPrecos(double mediaPrecoCusto, double mediaPrecoVenda) {
        this.mediaPrecoCusto = mediaPrecoCusto;
        this.mediaPrecoVenda = mediaPrecoVenda;
    }

    public void mostrarMediaPrecos() {
        System.out.println("Média de preço de custo: R$" + mediaPrecoCusto);
        System.out.println("Média de preço de venda: R$" + mediaPrecoVenda);
    }
}
