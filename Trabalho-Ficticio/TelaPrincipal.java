import javax.swing.*;
import java.awt.*;

public class TelaPrincipal extends JFrame {
    private Equipe equipe;
    
    private JTextArea areaExibicao;
    private JTextField campoCpfBusca;
    private JButton botaoBuscar, botaoListarMembros, botaoEstatisticas;

    public TelaPrincipal() { 
        super("Sistema de Gerenciamento da Equipe - POO"); 
        this.equipe = new Equipe();

    equipe.addMembro(new Instrutor("João Silva", "123.456.789-00", 35, "Musculação", 2500.00)); 
    equipe.addMembro(new Atleta("Maria Souza", "987.654.321-00", 22, "Natação"));

    setSize(600, 450);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new BorderLayout());

    JPanel painelSuperior = new JPanel(new FlowLayout());
    painelSuperior.add(new JLabel("CPF para busca:"));
    campoCpfBusca = new JTextField(12);
    painelSuperior.add(campoCpfBusca);
    botaoBuscar = new JButton("Buscar");
    painelSuperior.add(botaoBuscar);
    add(painelSuperior, BorderLayout.NORTH);

    areaExibicao = new JTextArea();
    areaExibicao.setEditable(false);
    add(new JScrollPane(areaExibicao), BorderLayout.CENTER);

    JPanel painelInferior = new JPanel(new FlowLayout());
    botaoListarMembros = new JButton("Listar Membros");
    painelInferior.add(botaoListarMembros);
    botaoEstatisticas = new JButton("Estatísticas");
    painelInferior.add(botaoEstatisticas);
    add(painelInferior, BorderLayout.SOUTH);

    botaoBuscar.addActionListener(e -> {
        String cpfDigitado = campoCpfBusca.getText().trim();
        try {
            Pessoa pessoaEncontrada = equipe.buscarPorCpf(cpfDigitado);
            areaExibicao.setText("Pessoa encontrada:\n");
            areaExibicao.append(pessoaEncontrada.obterDadosFormatados() + "\n");
        } catch (PessoaNaoEncontradaException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Erro durante a busca", JOptionPane.ERROR_MESSAGE);    
        }
    });

    botaoListarMembros.addActionListener(e -> {
        areaExibicao.setText("-- LISTA DE MEMBROS --\n");
        for (Pessoa p : equipe.getMembros()) {
            if (p instanceof Atleta) {
                Atleta a = (Atleta) p;
                areaExibicao.append("Atleta: " + a.getNome() + ", CPF: " + a.getCpfFormatado() + ", Modalidade: " + a.getModalidade() + "\n");
            } else if (p instanceof Instrutor) {
                Instrutor i = (Instrutor) p;
                areaExibicao.append("Instrutor: " + i.getNome() + ", CPF: " + i.getCpfFormatado() + ", Especialidade: " + i.getEspecialidade() + ", Salário: R$ " + String.format("%.2f", i.getSalario()) + "\n");
            }
        }
    });

    botaoEstatisticas.addActionListener(e -> {
        String status = String.format(
            "-- Painel de Estatísticas --\n" +
            "Total de Membros: %d\n" +
            "Total de Atletas: %d\n" + 
            "Total de Instrutores: %d\n" +
            "Soma dos Salários: R$ %.2f\n" +
            "Média dos Salários dos Instrutores: R$ %.2f\n",
            equipe.getTotalMembros(),
            equipe.getTotalAtletas(),
            equipe.getTotalInstrutores(),
            equipe.getSomaSalarios(),
            equipe.getMediaSalarios()
        );
        JOptionPane.showMessageDialog(this, status, "Resultado da Busca", JOptionPane.INFORMATION_MESSAGE);
    });
        
    setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TelaPrincipal());
    }
}
