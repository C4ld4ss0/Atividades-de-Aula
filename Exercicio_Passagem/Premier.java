package Exercicio_Passagem;

public class Premier extends Executive{

  public Premier(String CPF, String nome, double custoPassagem){
    super(CPF, nome, custoPassagem);
  
  }

  @Override 
  public double custoBagagem(int qtdade, int[] pesos){
    return super.custoBagagem(qtdade, pesos) * 0.5;
  }

  @Override
  public double defineAssento(String a){
    super.defineAssento(a);
    return 0.0;
  }

  @Override
  public int getMilhas(){
    return (int) (this.custoPassagem * 0.20);
  }
}
