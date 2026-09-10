package Exercicio_Passagem;

public class Economy extends Passagem{

    public Economy(String CPF, String nome, double custoPassagem){
        super(CPF, nome, custoPassagem);
    }

    @Override 
    public double custoBagagem(int qtdade, int[] pesos){
        double CustoBagagemTotal = super.custoBagagem(qtdade, pesos);
        return CustoBagagemTotal + (qtdade * 10.0);
    }
  
}
