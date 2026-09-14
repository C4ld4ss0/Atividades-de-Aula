package Exercicio_Agenda;

public abstract class Agendavel {
    
    private String horario;

    public Agendavel(String horario) {
        this.horario = horario;
    }

    public String getHorario() {
        return horario;
    }

    public void executar(){
        System.out.println("Executando a tarefa agendada no horário: " + horario);
    }

    public void monitorar(){
        System.out.println("Monitorando a tarefa agendada no horário: " + horario);
    }
}

