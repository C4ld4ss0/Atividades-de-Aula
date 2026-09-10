package Exercicio_Passagem;

public class AppPassagem{
    public static void main(String[] args) {
        // Array simulando 3 malas: 20kg, 25kg e 10kg
        int[] meusPesos = {20, 25, 10}; 

        Passagem ec = new Economy("111", "João (Economy)", 1000.0);
        System.out.println("--- VOO ECONOMY ---");
        System.out.println("Custo Assento: R$ " + ec.defineAssento("15F"));
        System.out.println("Custo Bagagem: R$ " + ec.custoBagagem(3, meusPesos));
        System.out.println("Milhas: " + ec.getMilhas());

        Passagem ex = new Executive("222", "Maria (Executive)", 2500.0);
        System.out.println("\n--- VOO EXECUTIVE ---");
        System.out.println("Custo Assento: R$ " + ex.defineAssento("4B"));
        System.out.println("Custo Bagagem: R$ " + ex.custoBagagem(3, meusPesos));
        System.out.println("Milhas: " + ex.getMilhas());

        Passagem pr = new Premier("333", "Carlos (Premier)", 4000.0);
        System.out.println("\n--- VOO PREMIER ---");
        System.out.println("Custo Assento: R$ " + pr.defineAssento("1A"));
        System.out.println("Custo Bagagem: R$ " + pr.custoBagagem(3, meusPesos));
        System.out.println("Milhas: " + pr.getMilhas());
    }
}