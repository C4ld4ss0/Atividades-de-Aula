package Interfaces_uteis;

public class Relatorio implements Imprimivel {
    private String dados;

    public Relatorio(String dados){
        this.dados = dados;
    }

    @Override
    public int imprimir(){
        System.out.println("----------------------");
        System.out.println("| " + dados + " |");
        System.out.println("----------------------");

        return dados.length();
    }
}
