package Exercicio_Agenda;

public class LimpezaDeSistema extends Agendavel {
    
    public LimpezaDeSistema(String horario) {
        super(horario);
    }

    @Override
    public void executar() {
        System.out.println("Executando a limpeza de sistema no horário: " + getHorario());
    }

    @Override
    public void monitorar() {
        System.out.println("Monitorando a limpeza de sistema no horário: " + getHorario());
    }  
    
    
}
