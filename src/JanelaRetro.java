import javax.swing.*;

public class JanelaRetro {
    private JFrame janela;
    private JButton jogoSuperAventura, jogoCombateEspacial, jogoCorridaTurbo;
    private Pagamento pagamento;
    private JLabel valorTotal, valorTotalComDesconto;


    public JanelaRetro() {
        pagamento = new Pagamento();
        janela = new JFrame("LOJA DE GAMES RETRÔ");
        janela.setSize(620,350);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(null);

        jogoSuperAventura = new JButton("Comprar Super Aventura");
        jogoSuperAventura.setBounds(20,20,200,70);

        jogoCombateEspacial = new JButton("Comprar Combate Espacial");
        jogoCombateEspacial.setBounds(20,110,200,70);

        jogoCorridaTurbo = new JButton("Comprar Corrida Turbo");
        jogoCorridaTurbo.setBounds(20,200,200,70);


        JLabel labelTotal = new JLabel("Total: ");
        labelTotal.setBounds(230,40,160,70);

        valorTotal = new JLabel("0");
        valorTotal.setBounds(290,40,160,70);

        JLabel labelTotalComDesconto = new JLabel("Total Com Desconto: ");
        labelTotalComDesconto.setBounds(230,90,160,70);

        valorTotalComDesconto = new JLabel("0");
        valorTotalComDesconto.setBounds(370,90,160,70);

        janela.add(jogoCombateEspacial);
        janela.add(jogoSuperAventura);
        janela.add(jogoCorridaTurbo);
        janela.add(labelTotal);
        janela.add(valorTotal);
        janela.add(valorTotalComDesconto);
        janela.add(labelTotalComDesconto);

        criarEventos();
    }
    public void criarEventos(){

        Jogos superAventura = new Jogos("Super Aventura 64", 45.00);
        Jogos combateEspacial = new Jogos("Combate Espacial", 60.00);
        Jogos corridaTurbo = new Jogos("Corrida Turbo", 50.00);


        jogoCombateEspacial.addActionListener(e->{
        pagamento.adicionarJogos(combateEspacial, 1);
        atualizarTotais();
    });
        jogoCorridaTurbo.addActionListener(e->{
            pagamento.adicionarJogos(corridaTurbo, 1);
            atualizarTotais();
        });
        jogoSuperAventura.addActionListener(e->{
            pagamento.adicionarJogos(superAventura, 1);
            atualizarTotais();
        });


}

public void atualizarTotais() {
    double total = pagamento.getTotal();
    double totalComDesconto = pagamento.getTotalComDesconto();

    valorTotal.setText("R$ " + total );
    valorTotalComDesconto.setText("R$ " + totalComDesconto);
}
    public void mostrarJanela() {
        // Defini para ficar visivel
        janela.setVisible(true);
    }
}
