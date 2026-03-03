//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Jogos superAventura = new Jogos("Super Aventura 64", 45.00);
        Jogos combateEspacial = new Jogos("Combate Espacial", 60.00);
        Jogos corridaTurbo = new Jogos("Corrida Turbo", 50.00);

        Pagamento pagamento = new Pagamento();
        pagamento.adicionarJogos(superAventura, 1);
        pagamento.adicionarJogos(combateEspacial, 2);
        pagamento.adicionarJogos(corridaTurbo, 2);
        System.out.println(pagamento.getTotal());
        System.out.println(pagamento.getTotalComDesconto());

        JanelaRetro janelaRetro = new JanelaRetro();
        janelaRetro.mostrarJanela();
    }
}