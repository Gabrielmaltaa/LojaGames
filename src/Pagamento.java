import java.util.ArrayList;

public class Pagamento {
    private ArrayList<Biblioteca> bibliotecaGamer;

    public Pagamento() {
        bibliotecaGamer = new ArrayList<Biblioteca>();
    }

    public void adicionarJogos(Jogos produtos, int quantidade ){
        Biblioteca repertorio = new Biblioteca(produtos , quantidade);
        bibliotecaGamer.add(repertorio);
    }

    public double getTotal() {
        double total = 0;

        for (Biblioteca jogosBiblioteca : bibliotecaGamer){
        double subTotal = jogosBiblioteca.subTotal();
        total += jogosBiblioteca.subTotal();
        }
        return total;
    }

    public double getTotalComDesconto() {
        double valorTotalComDesconto = 0;
        double valorDesconto = 0.15;
        if (getTotal() >= 150){
        valorTotalComDesconto = getTotal() - (getTotal() * valorDesconto);

        }
        return valorTotalComDesconto;
    }

}
