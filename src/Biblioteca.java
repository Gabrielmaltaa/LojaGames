public class Biblioteca {
    private Jogos produtos;
    private int quantidade;

    public Biblioteca(Jogos produtos, int quantidade) {
        this.produtos = produtos;
        this.quantidade = quantidade;
    }

    public double subTotal() {
        double valorAtual = produtos.getPreco() * quantidade;

        return valorAtual;
    }

}
