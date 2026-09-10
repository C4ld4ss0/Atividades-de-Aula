package Exercicio_Passagem;

public abstract class Passagem{
  private String CPF;
  private String nome;
  private String assento;
  private double custoPassagem;

  

  public Passagem(String CPF, String nome, double custoPassagem){
    this.CPF = CPF;
    this.nome = nome;
    this.custoPassagem = custoPassagem;
  }

  public double custoBagagem(int qtdade, int[] pesos){
    double custoBagagemTotal = 0;
    for(int i = 0; i < qtdade; i++){
      custoBagagemTotal += (pesos[i] * 0.5);
    }
    return custoBagagemTotal;
  }

  public double defineAssento(String a){
    this.assento = a;
    return 5.0;
  }

  public int getMilhas(){
    return 0;
  }

}