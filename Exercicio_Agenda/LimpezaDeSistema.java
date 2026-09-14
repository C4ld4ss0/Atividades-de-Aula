package Exercicio_Agenda;

public class LimpezaDeSistema implements Agendavel {
    private String horario;
    
    public LimpezaDeSistema(String horario) {
        this.horario = horario;
    }
    
    @Override 
    public void agendar(String horario) {
        this.horario = horario;
    }

    @Override
    public void executar() {
        System.out.println("Executando a limpeza de sistema no horário: " + horario);
    }

    @Override
    public void monitorar() {
        System.out.println("Monitorando a limpeza de sistema no horário: " + horario);
    }

    
}
