package Exercicio_Pessoa;

public abstract class Pessoa{
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

}