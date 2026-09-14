package Exercicio_Agenda;

public class BackupDeDados extends Agendavel {
    
    public BackupDeDados(String horario) {
        super(horario);
    }

    @Override
    public void executar() {
        System.out.println("Executando o backup de dados no horário: " + getHorario());
    }

    @Override
    public void monitorar() {
        System.out.println("Monitorando o backup de dados no horário: " + getHorario());
    }
    
}
