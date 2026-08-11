import java.util.*;
public class RevisaoEx1{
  
  private double raio = 3.0;
  private int pontoX = 7;
  private int pontoY = 9;
  
  public static void main(String [] args){
    RevisaoEx1 circulo = new RevisaoEx1();  
    
    circulo.getInformacoes();
    
    circulo.mudarPosicao(12, 18);
    
    circulo.getInformacoes();
  }
  public void getInformacoes(){
    System.out.printf("A área é: %.2f\n", this.getArea());
    System.out.printf("O perimetro é: %.2f\n", this.getPerimetro());
    System.out.printf("A posição atual do círculo é: (%d , %d)\n", this.getPontoX() , this.getPontoY());
  }

  public double getRaio(){
    return this.raio;
  }
  
  public void setRaio(double raio){
    if(raio <= 0 ){return;}
    this.raio = raio;
  }
  
  public int getPontoX (){
    return this.pontoX;
  }
  
  public void setPontoX(int pontoX){
    if(pontoX < 0){return;}
    this.pontoX = pontoX;
  }
  
  public int getPontoY(){
    return this.pontoY;
  }
  
  public void setPontoY(int pontoY){
    if(pontoY < 0){return;}
    this.pontoY = pontoY;
  }
  
  public double getArea(){
    return Math.PI *(this.raio * this.raio);
  }
  
  public double getPerimetro(){
    return Math.PI * 2 * this.raio;
  }
  
  public void mudarPosicao(int novoX, int novoY){
    this.setPontoX(novoX);
    this.setPontoY(novoY);
  }
}
