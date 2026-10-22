
public class AppAtleta{
    public static void main(String[] args) {
        Equipe equipe = new Equipe();    

        Instrutor instrutor1 = new Instrutor("João", "123.456.789-00", 35, "Treinamento Funcional", 2000.00);
        Atleta atleta1 = new Atleta("Maria", "987.654.321-00", 25, "Natação");

        equipe.addMembro(instrutor1);
        equipe.addMembro(atleta1);

        System.out.println("Total de Membros: " + equipe.getTotalMembros());
        System.out.println("Total de Atletas: " + equipe.getTotalAtletas());
        System.out.println("Total de Instrutores: " + equipe.getTotalInstrutores());
        System.out.printf("Soma dos Salários: R$ %.2f%n", equipe.getSomaSalarios());
        System.out.printf("Média dos Salários: R$ %.2f%n", equipe.getMediaSalarios());
        
        instrutor1.setSalario(2500.00); // Atualiza o salário do instrutor
        instrutor1.setSalario(1500.00); // Tenta atualizar para um salário menor que o mínimo   

        try {
            System.out.println("Buscando pessoa com CPF ...");
            Pessoa pessoaEncontrada = equipe.buscarPorCpf("987.654.321-00");
            pessoaEncontrada.exibirDados();

            Pessoa pessoaNaoExiste = equipe.buscarPorCpf("000.000.000-00");
            pessoaNaoExiste.exibirDados();

        } catch (PessoaNaoEncontradaException e) {
            System.out.println("Erro durante a busca: " + e.getMessage());
        } finally {
            System.out.println("Busca finalizada.");
        }
    }
}