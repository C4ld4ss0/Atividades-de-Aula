

public class Retangulo extends FiguraBidimensional
{
    private double largura;
    private double altura;
    
    public Retangulo (double x, double y, double larg, double alt) {
        super(x, y);

        this.largura = Math.abs(larg);
        this.altura = Math.abs(alt);
    }
    
    public double getLargura () {
        return this.largura;
    }
   
    public double getAltura () {
        return this.altura;
    }
    
    public double getArea () {
        return largura * altura;
    }
    
}
