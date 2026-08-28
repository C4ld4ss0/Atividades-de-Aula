
public class senha{
    private static int senhaAtual = 1;
    private int minhaSenha;
    
    public senha(){
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
