package Exercicio_Agenda;

public class AppAgenda {

    public static void main(String[] args){
        SistemasDeTarefas tarefas = new SistemasDeTarefas();
        tarefas.adicionarTarefa(new LimpezaDeSistema("08:00"));
        tarefas.adicionarTarefa(new RelatorioFinanceiro("09:00"));
        tarefas.adicionarTarefa(new BackupDeDados("07:00"));

        tarefas.executarTodas();
        tarefas.monitorarTarefas();
        
        tarefas.agendarTodas("10:00");

        tarefas.executarTodas();
        tarefas.monitorarTarefas();

    }

}
