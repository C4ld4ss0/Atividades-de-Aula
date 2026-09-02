package Exercicio_Senha;

public class Senha{
    private static int senhaAtual = 1;
    private int minhaSenha;
    
    public Senha(){
        this.minhaSenha = senhaAtual;
        senhaAtual++;
    }
    
    public static int getSenhaAtual(){
        return senhaAtual;
    }
    
    public int getMinhaSenha(){
        return minhaSenha;
    }
}
