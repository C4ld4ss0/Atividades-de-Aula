import java.util.*;
import Interfaces_uteis.Etiquetavel;

public class Lampada implements Etiquetavel{
    
  public enum EstadoLampada{
    DESLIGADA, QUEIMADA, LIGADA
  }
  private Random gerador = new Random();
  private EstadoLampada estadoAtual = EstadoLampada.DESLIGADA;
  private String etiqueta = "????";
  
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

  public void setEtiqueta(String etiqueta){
    if(etiqueta != null && etiqueta.length() >= 4 && etiqueta.length() <= 15){
      this.etiqueta = etiqueta;
    } else {
      this.etiqueta = "????";
    }
  }
  
  @Override 
  public String getEtiqueta(){
    return this.etiqueta;
  }

  public EstadoLampada getEstado(){
    return this.estadoAtual;
  }
}
