package Exercicio_Pessoa;
import Interfaces_uteis.Imprimivel;

public abstract class Pessoa implements Imprimivel{
    private static int contador = 100;
    private final int id;
    private String nome;

    public Pessoa (String nome){
        this.id = contador;
        contador++;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString(){
        return String.format("(%d) %s", id + nome);
    }

    @Override
    public int imprimir(){
        String texto = this.toString();
        System.out.println("-------------------------");
        System.out.println("| " + texto);
        System.out.println("-------------------------");
        return texto.length();
    }
}