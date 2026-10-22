import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Equipe {
    private List<Pessoa> membros;

    public Equipe() {
        this.membros = new ArrayList<>();
    }

    public void addMembro(Pessoa p) {
        this.membros.add(p);
    }

    public List<Pessoa> getMembros() {
        return membros;
    }

    public Pessoa buscarPorCpf(String cpfBusca) {
        String cpfLimpo = cpfBusca == null ? "" : cpfBusca.replaceAll("[^0-9]", "");
        return membros.stream()
            .filter(p -> p.getCpf().equals(cpfLimpo))
            .findFirst()
            .orElseThrow(() -> new PessoaNaoEncontradaException("Pessoa com CPF " + cpfBusca + " não encontrada."));
    }

    public long getTotalMembros() {
        return membros.stream().count();
    }

    public long getTotalAtletas() {
        return membros.stream().filter(p -> p instanceof Atleta).count();
    }

    public long getTotalInstrutores() {
        return membros.stream().filter(p -> p instanceof Instrutor).count();
    }

    public double getSomaSalarios() {
        return membros.stream()
            .filter(p -> p instanceof Instrutor)
            .mapToDouble(p -> ((Instrutor) p).getSalario())
            .sum();
    }

    public double getMediaSalarios() {
        return membros.stream()
            .filter(p -> p instanceof Instrutor)
            .mapToDouble(p -> ((Instrutor) p).getSalario())
            .average()
            .orElse(0.0);
    }

    public List<Pessoa> buscarPorTrechoCpf(String trechoCpf){
        String trechoLimpo = trechoCpf == null ? "" : trechoCpf.replaceAll("[^0-9]", "");
        List<Pessoa> encontrados = membros.stream()
            .filter(p -> p.getCpf().contains(trechoLimpo))
            .collect(Collectors.toList());
        if (encontrados.isEmpty()) {
            throw new PessoaNaoEncontradaException("Nenhuma pessoa encontrada com o trecho de CPF: " + trechoCpf);
        }
        return encontrados;
    }

}