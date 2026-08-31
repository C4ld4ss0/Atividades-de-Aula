
public class ConversaoDeUnidadesDeTemperatura{

  public enum TempDesejada{
    KELVIN, CELCIUS, FAHRENHEIT, REAUMUR, RANKINE  
  }
  
  public static double transformarParaKelvin(double tempInicial, TempDesejada escalaInicial){ 
      switch(escalaInicial){
        case KELVIN:
            return tempInicial;
        case CELCIUS:
            return tempInicial + 273.15;
        case FAHRENHEIT:
            return ((tempInicial - 32.0) * 5.0/9.0) + 273.15;
        case REAUMUR:
            return (tempInicial) * 5.0/4.0 + 273.15;
        case RANKINE:
            return tempInicial/1.8;
        default:
          System.out.println("Escala Desconhecida!!!");
          return 0.0;
      }
  }

  public static double transformarParaDesejado(double tempEmKelvin, TempDesejada escalaFinal){
      switch(escalaFinal){
        case KELVIN:
            return tempEmKelvin;
        case CELCIUS:
            return tempEmKelvin - 273.15;
        case FAHRENHEIT:
            return ((tempEmKelvin - 273.15) * 9.0/5.0) + 32.0;
        case REAUMUR:
            return (tempEmKelvin - 273.15) * 4.0/5.0;
        case RANKINE:
            return tempEmKelvin * 1.8;
        default:
          System.out.println("Escala desconhecida!!!");
            return 0.0;
      }
  }
}
