package Exercicio_Agenda;

public class RelatorioFinanceiro implements Agendavel {
    private String horario;

    public RelatorioFinanceiro(String horario) {
        this.horario = horario;
    }
    
    @Override
    public void agendar(String horario) {
        this.horario = horario;
    }

    @Override
    public void executar() {
        System.out.println("Executando o relatório financeiro no horário: " + horario);
    }

    @Override
    public void monitorar() {
        System.out.println("Monitorando o relatório financeiro no horário: " + horario);
    }
}
