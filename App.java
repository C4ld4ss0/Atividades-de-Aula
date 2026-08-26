
public class App{
    public static void main(String[] args){
        
        Semaforo[] listaSemaforo = new Semaforo[10];
        
        for(int i = 0; i < listaSemaforo.length; i++){
            listaSemaforo[i] = new Semaforo();
        }
        
        for(int i = 0; i < listaSemaforo.length; i++){
            listaSemaforo[i].avancarEstado();
            listaSemaforo[i].avancarEstado();        
            listaSemaforo[i].avancarEstado();
        }
        
        System.out.println("ESTADO FINAL DOS SEMÁFOROS");
        for(int i = 0; i < listaSemaforo.length; i++){
            System.out.println("Semáforo [" + (i+1) + "]: " + listaSemaforo[i].getEstadoAtual());
        }
        
        System.out.println("\n RELATÓRIO DE MANUTENÇÃO");
        for(int i = 0; i < listaSemaforo.length; i++){
            if(listaSemaforo[i].precisaManutencao()){
                System.out.println("Atenção: O Semáforo [" + (i+1) + "] " + listaSemaforo[i].getLuzQueimada()+ " e precisa de reparos.");
            }
            
        }
    }
}