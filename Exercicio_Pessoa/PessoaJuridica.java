package Exercicio_Pessoa;

public class PessoaJuridica extends Pessoa {
    private final int anoFundacao;
    private final String cnpj;

    public PessoaJuridica (String nome, int anoFundacao, String cnpj){
        super(nome);
        this.anoFundacao = anoFundacao;
        this.cnpj = cnpj;
    }

    public int getAnoFundacao() {
        return anoFundacao;
    }

    public String getCnpj() {
        return cnpj;
    }

    @Override
    public String toString(){
        return String.format("%s | ");

    }
    
}