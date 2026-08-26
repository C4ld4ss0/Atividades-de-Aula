
public class Semaforo{
    private Lampada vermelha;
    private Lampada amarela;
    private Lampada verde;
    
    private int estado;
    
    public Semaforo(){
        this.vermelha = new Lampada();
        this.amarela = new Lampada();
        this.verde = new Lampada();
        
        this.vermelha.ligar();
        this.estado = 0;
    }
    
    public void avancarEstado(){
        if(this.estado == 0){
            this.vermelha.desligar();
            this.verde.ligar();
            this.estado = 1;
        }else if(this.estado == 1){
            this.verde.desligar();
            this.amarela.ligar();
            this.estado = 2;
        }else {
            this.amarela.desligar();
            this.vermelha.ligar();
            this.estado = 0;
        }
    }
    
    public String getEstadoAtual(){
        if(this.estado == 0) return "FECHADO";
        if(this.estado == 1) return "ABERTO";
        return "ATENÇÃO";
    }
    
    public boolean precisaManutencao(){
        return this.vermelha.getEstado()== Lampada.EstadoLampada.QUEIMADA || 
        this.amarela.getEstado()== Lampada.EstadoLampada.QUEIMADA || 
        this.verde.getEstado()== Lampada.EstadoLampada.QUEIMADA;
    }
    
    public String getLuzQueimada(){
        if (this.vermelha.getEstado() == Lampada.EstadoLampada.QUEIMADA){
            return "Luz Vermelha Queimada";
        } else if (this.amarela.getEstado() == Lampada.EstadoLampada.QUEIMADA){
            return "Luz Amarela Queimada";
        }else if (this.verde.getEstado() == Lampada.EstadoLampada.QUEIMADA){
            return "Luz Verde Queimada";
        }
        return "Nenhuma Lâmpada Queimada nesse Semáforo";
    }
}