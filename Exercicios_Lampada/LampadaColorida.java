public class LampadaColorida extends Lampada {
    public enum CorDaLampada{
        BRANCA, AMARELA, VERMELHA, VERDE, AZUL, NEGRA
    }

    private CorDaLampada cor;

    public LampadaColorida(CorDaLampada cor){
        this.cor = cor;
    }

    public CorDaLampada getCor(){
        return this.cor;
    }

}
