import java.util.*;
public class AppSenha{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.println("Informe o tamanho do vetor: ");
        int tamanho = sc.nextInt();
        
        senha[] vetSenha = new senha[tamanho];
        int instanciados = 0;
        
        while (instanciados < tamanho){
            int posicao = rand.nextInt(tamanho);
            if(vetSenha[posicao] == null){
                vetSenha[posicao] = new senha();
                instanciados++;
            }
        }
        
        for(int i = 0; i < tamanho; i++){
            System.out.println("Posição " + (i + 1)+ " possui a senha: " + vetSenha[i].getMinhaSenha());
        }
        sc.close();
    }
}
