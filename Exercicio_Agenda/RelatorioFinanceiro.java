package Exercicio_Agenda;

public class RelatorioFinanceiro extends Agendavel {
    
    public RelatorioFinanceiro(String horario) {
        super(horario);
    }

    @Override
    public void executar() {
        System.out.println("Executando o relatório financeiro no horário: " + getHorario());
    }

    @Override
    public void monitorar() {
        System.out.println("Monitorando o relatório financeiro no horário: " + getHorario());
    }
    
}
