package Exercicio_Agenda;


import java.util.*;

public class SistemasDeTarefas {

    private ArrayList<Agendavel> tarefas = new ArrayList<>();
    
    public void adicionarTarefa(Agendavel tarefa) {
        tarefas.add(tarefa);
    }

    public void agendarTodas(String horario) {
        for (Agendavel tarefa : tarefas) {
            tarefa.agendar(horario);
        }
    }

    public void executarTodas() {
        for (Agendavel tarefa : tarefas) {
            tarefa.executar();
        }
    }

    public void monitorarTarefas() {
        for (Agendavel tarefa : tarefas) {
            tarefa.monitorar();
        }
    }

}
