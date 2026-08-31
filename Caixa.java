public class Caixa {
    private static int idGerador = 0;
    private int id;
    private int tamMaxFila;
    private int nroClientesNaFila;
    private StatusCaixa status;

    public Caixa(int tamMaxFila){
        idGerador++;
        this.id = idGerador;
        this.tamMaxFila = tamMaxFila;
        this.nroClientesNaFila = 0;
        this.status = StatusCaixa.INATIVO;
    }

    public int getID() {return id;}

    public int getTamMaxFila() {return tamMaxFila;}

    public int getNroClientesNaFila() {return nroClientesNaFila;}

    public StatusCaixa getStatus() {return this.status;}

    public boolean ativar(){
        if(this.status == StatusCaixa.INATIVO){
            this.status = StatusCaixa.ATIVO;
            return true;
        }
        return false;
    }

    public boolean desativar(){
        if(this.status == StatusCaixa.ATIVO){
            this.status = StatusCaixa.INATIVO;
            this.nroClientesNaFila = 0;
            return true;
        }
        return false;
    }

    public boolean adicionarClienteNaFila(){
        if(this.status == StatusCaixa.ATIVO && this.nroClientesNaFila < this.tamMaxFila){
            this.nroClientesNaFila++;
            return true;
        }
        return false;
    }

    public boolean atenderProximoCliente(){
        if(this.status == StatusCaixa.ATIVO && this.nroClientesNaFila > 0){
            this.nroClientesNaFila--;
            return true;
        }
        return false;
    }
}