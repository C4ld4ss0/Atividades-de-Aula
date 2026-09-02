package Exercicio_temperatura;
import java.util.*;

public class AppTemperatura{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a Escala da temperatura inicial:\n CELCIUS\n FAHRENHEIT\n KELVIN\n REAUMUR\n RANKINE\n");
        String entradaEscalaInicial = sc.nextLine().toUpperCase();
        ConversaoDeUnidadesDeTemperatura.TempDesejada escalaInicial = ConversaoDeUnidadesDeTemperatura.TempDesejada.valueOf(entradaEscalaInicial);

        System.out.println("Informe para qual Escala da temperatura que queres transformar:\n CELCIUS\n FAHRENHEIT\n KELVIN\n REAUMUR\n RANKINE\n"); 
        String entradaEscalaFinal = sc.nextLine().toUpperCase();
        ConversaoDeUnidadesDeTemperatura.TempDesejada escalaFinal  = ConversaoDeUnidadesDeTemperatura.TempDesejada.valueOf(entradaEscalaFinal);

        System.out.println("Informe o Valor da temperatura: ");
        double tempInicial = sc.nextDouble();

        double tempEmKelvin = ConversaoDeUnidadesDeTemperatura.transformarParaKelvin(tempInicial, escalaInicial);
        double tempFinal = ConversaoDeUnidadesDeTemperatura.transformarParaDesejado(tempEmKelvin, escalaFinal);
        
        System.out.println("A temperatura convertida em " + escalaFinal + " é: " + tempFinal);
        
        sc.close();
   }
}
