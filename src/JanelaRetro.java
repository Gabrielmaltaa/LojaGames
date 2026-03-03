import javax.swing.*;

public class JanelaRetro {
    private JFrame janela;
    private JButton jogoSuperAventura, jogoCombateEspacial, jogoCorridaTurbo;
    private Pagamento pagamento;
    private JLabel valorTotal, valorTotalComDesconto;


    public JanelaRetro() {
        pagamento = new Pagamento();
        janela = new JFrame("APP");
        janela.setSize(620,350);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(null);

        jogoSuperAventura = new JButton("Adicionar Super Aventura: ");
        jogoSuperAventura.setBounds(20,20,190,60);

        jogoCombateEspacial = new JButton("Adicionar Combate Espacial: ");
        jogoCombateEspacial.setBounds(20,100,190,60);

        jogoCorridaTurbo = new JButton("Adicionar Corrida Turbo");
        jogoCorridaTurbo.setBounds(20,180,190,60);


        JLabel labelTotal = new JLabel("Total: ");
        labelTotal.setBounds(190,40,120,30);


        valorTotal = new JLabel("0");
        valorTotal.setBounds(340,40,120,30);


        JLabel labelTotalComDesconto = new JLabel("Total Com Desconto: ");
        labelTotalComDesconto.setBounds(190,100,120,30);


        valorTotalComDesconto = new JLabel("0");
        valorTotalComDesconto.setBounds(340,100,120,30);

        janela.add(jogoCombateEspacial);
        janela.add(jogoSuperAventura);
        janela.add(jogoCorridaTurbo);
        janela.add(labelTotal);
        janela.add(valorTotal);
        janela.add(valorTotalComDesconto);
        janela.add(labelTotalComDesconto);

        criarEventos();
    }

    public void criarEventos() {



    }

    public void mostrarJanela() {
        // Defini para ficar visivel
        janela.setVisible(true);
    }
}
