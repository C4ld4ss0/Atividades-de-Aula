

public class App
{
    
    public static void main (String[] args)
    {
        System.out.println("INICIO");
        
        Circulo c1 = new Circulo(2, 3, 4);
        Retangulo r1 = new Retangulo(10, 10, 7, 4);
        
        FiguraBidimensional[] minhasFiguras = new FiguraBidimensional[4];
        minhasFiguras[0] = c1;
        minhasFiguras[1] = r1;
        minhasFiguras[2] = new Retangulo (4, 5, 20, 30);
        minhasFiguras[3] = new Circulo (40, 45, 9.5);
        
        // quero calcular a soma das areas de todas as figuras:
        double somaAreas = 0.0;
        
        /*
        for (int i = 0; i < minhasFiguras.length; i++) {
            somaAreas += minhasFiguras[i].getArea();    
        }
        */
       
        for (FiguraBidimensional fig : minhasFiguras) {
            somaAreas += fig.getArea();
        }
        
        System.out.println("Soma das areas = " + somaAreas);
        
        
    }
}
