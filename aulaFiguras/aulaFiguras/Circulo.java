

public class Circulo extends FiguraBidimensional
{
    private double raio;
    
    public Circulo (double x, double y, double raio) {
        super(x, y);
        this.raio = Math.abs(raio);
    }
  
    public double getRaio () {
        return this.raio;
    }
        
    public double getArea () {
         return Math.PI * raio * raio; 
    }
}
