
public class ConversaoDeUnidadesDeTemperaturaV2{

  public enum TempDesejada{
    KELVIN, CELCIUS, FAHRENHEIT, REAUMUR, RANKINE  
  }
  
  private double tempInicial;
  private double tempConversao;

  private TempDesejada escalaInicial;
  private TempDesejada escalaFinal;


  public void transformarParaKelvin(){ 
      switch(escalaInicial){
        case KELVIN:
          tempConversao = tempInicial;
          break;
        case CELCIUS:
          tempConversao = tempInicial + 273.15;
          break;
        case FAHRENHEIT:
          tempConversao = ((tempInicial - 32.0) * 5.0/9.0) + 273.15;
          break;
        case REAUMUR:
          tempConversao = (tempInicial) * 5.0/4.0 + 273.15;
          break;
        case RANKINE:
          tempConversao = tempInicial/1.8;
          break;
        default:
          System.out.println("Escala Desconhecida!!!");
      }
    escalaInicial = TempDesejada.KELVIN;
  }

  public void transformarParaDesejado(){
      switch(escalaFinal){
        case KELVIN:
          break;
        case CELCIUS:
          tempConversao = tempConversao - 273.15;
          break;
        case FAHRENHEIT:
          tempConversao = ((tempConversao - 273.15) * 9.0/5.0) + 32.0;
          break;
        case REAUMUR:
          tempConversao = (tempConversao - 273.15) * 4.0/5.0;
          break;
        case RANKINE:
          tempConversao = tempConversao * 1.8;
          break;
        default:
          System.out.println("Escala desconhecida!!!");
      }
    System.out.println(" A temperatura convertida em " + escalaFinal + " é: " + tempConversao);
  }

  public double getTempInicial(){
    return this.tempInicial;
  }

  public void setTempInicial(double tempInicial){
    this.tempInicial = tempInicial;
  }
}
