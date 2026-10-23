

public abstract class FiguraBidimensional
{
    private double posX;
    private double posY;
    
    public FiguraBidimensional (double x, double y) {
        this.posX = x;
        this.posY = y;
    }
    
    public double getX () { return this.posX; }
    
    public double getY () { return this.posY; }
    
    
    public abstract double getArea ();
    
}
