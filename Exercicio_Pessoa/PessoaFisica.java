package Exercicio_Pessoa;

public class PessoaFisica extends Pessoa{
    private final int anoNascimento;
    private final String cpf;

    public PessoaFisica (String nome, int anoNascimento, String cpf){
        super(nome);
        this.anoNascimento = anoNascimento;
        this.cpf = cpf;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString(){
        return String.format("%s | ");
    }
    
}