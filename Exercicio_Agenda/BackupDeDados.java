package Exercicio_Agenda;

public class BackupDeDados implements Agendavel {
    private String horario;

    public BackupDeDados(String horario) {
        this.horario = horario;
    }

    @Override
    public void agendar(String horario) {
        this.horario = horario;
    }

    @Override
    public void executar() {
        System.out.println("Executando o backup de dados no horário: " + horario);
    }

    @Override
    public void monitorar() {
        System.out.println("Monitorando o backup de dados no horário: " + horario);
    }
}
