import java.util.*;
public class ConversaoDeUnidadesDeTemperatura{

  public enum TempDesejada{
    KELVIN, CELCIUS, FAHRENHEIT, REAUMUR, RANKINE  
  }
  

  private double tempInicial;
  private double tempConversao;

  private TempDesejada escalaInicial;
  private TempDesejada escalaFinal;

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    ConversaoDeUnidadesDeTemperatura conversor = new ConversaoDeUnidadesDeTemperatura();

    System.out.println("Informe a Escala da temperatura que vai informar:\n CELCIUS\n FAHRENHEIT\n KELVIN\n REAMUR\n RANKINE\n");
    String entradaEscalaInicial = sc.nextLine().toUpperCase();
    conversor.escalaInicial = TempDesejada.valueOf(entradaEscalaInicial);

    System.out.println("Informe a Escala da temperatura que queres transformar: CELCIUS\n FAHRENHEIT\n KELVIN\n REAMUR\n RANKINE\n"); 
    String entradaEscalaFinal = sc.nextLine().toUpperCase();
    conversor.escalaFinal = TempDesejada.valueOf(entradaEscalaFinal);






    sc.close();
  }

  public void transformarParaKelvin(){ 
      switch(escalaInicial){
        case KELVIN:
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