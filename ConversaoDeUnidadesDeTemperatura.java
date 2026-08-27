import java.util.*;
public class ConversaoDeUnidadesDeTemperatura{

  public enum TempDesejada{
    KELVIN, CELCIUS, FAHRENHEIT, REAUMUR, RANKINE  
  }

  private double tempInicial;
  private double tempConversao;

  private TempDesejada escalaAtual = TempDesejada.KELVIN;
  public static void main(String[] args){


  }

  public void transformarParaKelvin(){
    if(escalaAtual == TempDesejada.KELVIN){
      tempConversao = tempInicial;
      return;
    } else { 
      switch(escalaAtual){
        case CELCIUS:
          tempConversao = tempInicial + 273.15;
          break;
        case FAHRENHEIT:
          tempConversao = ((tempInicial - 32.0) * 5/9) + 273.15;
          break;
        case REAUMUR:
          tempConversao = (tempInicial) * 5.0/4.0 + 273.15;
          break;
        case RANKINE:
          tempConversao = tempInicial/1.8;
          break;
      }
      escalaAtual = TempDesejada.KELVIN;
    }
  public void transformarParaDesejado(){
    if(){
      
    }
  }

  }

  public double getTempInicial(){
    return this.tempInicial;
  }

  public void setTempInicial(double tempInicial){
    this.tempInicial = tempInicial;
  }
  
}