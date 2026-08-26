import java.util.*;
public class Lampada{
    
  public enum EstadoLampada{
    DESLIGADA, QUEIMADA, LIGADA
  }
  private Random gerador = new Random();

  private EstadoLampada estadoAtual = EstadoLampada.DESLIGADA;
  
  public static void main(String[] args){
    Lampada lampada = new Lampada();
    lampada.ligar();
    System.out.println(lampada.getEstado());
  }

  public void ligar(){
    if(this.estadoAtual == EstadoLampada.QUEIMADA || this.estadoAtual == EstadoLampada.LIGADA){return;}
    int numeroSorteado = this.gerador.nextInt(100) + 1;
    if(numeroSorteado <= 30){
        this.estadoAtual = EstadoLampada.QUEIMADA;
    }else{
        this.estadoAtual = EstadoLampada.LIGADA;
    }
  }
  
  public void desligar(){
    if(this.estadoAtual == EstadoLampada.QUEIMADA){return;}
    this.estadoAtual = EstadoLampada.DESLIGADA;
  }
  
  public EstadoLampada getEstado(){
    return this.estadoAtual;
  }
}
