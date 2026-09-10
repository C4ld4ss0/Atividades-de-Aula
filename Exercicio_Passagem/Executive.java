package Exercicio_Passagem;

public class Executive extends Passagem{
  
  public Executive(String CPF, String nome, double custoPassagem){
    super(CPF, nome, custoPassagem);
  }

  @Override 
  public double custoBagagem(int qtdade, int[] pesos){
    if(qtdade <= 2){
      return 0.0;
    } 
    double custoExcedente = 0;
    for(int i = 2; i< qtdade; i++){
      custoExcedente += pesos[i] * 0.5;
    }
    return custoExcedente;
  }

  @Override
  public int getMilhas(){
    return (int) (this.custoPassagem * 0.1);
  }
}