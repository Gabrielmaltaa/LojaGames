public class Jogos {
    private String jogoNome;
    private double preco;

    public Jogos(String jogoNome, double preco) {
        this.jogoNome = jogoNome;
        this.preco = preco;

    }


    public String getJogoNome() {
        return jogoNome;
    }

    public void setJogoNome(String jogoNome) {
        this.jogoNome = jogoNome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
