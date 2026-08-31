import java.util.Random;
public class Supermercado {
    private int nroCaixas;
    private double totalFaturamento;
    private double totalPerdas;
    private int totalClientesAtendidos;
    private int totalClientesNaoAtendidos;
    private double valorMenorCompra;
    private double valorMaiorCompra;
    private Caixa[] caixas;

    public Supermercado(int nroCaixas){
        this.nroCaixas = nroCaixas;
        this.caixas = new Caixa[nroCaixas];

        for(int i = 0; i < nroCaixas; i++){
            this.caixas[i] = new Caixa(10);
            this.caixas[i].ativar();
        }

        this.totalFaturamento = 0.0;
        this.totalPerdas = 0.0;
        this.totalClientesAtendidos = 0;
        this.totalClientesNaoAtendidos = 0;
        this.valorMenorCompra = Double.MAX_VALUE;
        this.valorMaiorCompra = 0.0;
    }

    public int getNroClientesNaFila(){
        return nroCaixas;
    }

    public int getNroCaixasPorStatus(StatusCaixa status){
        int contador = 0;
        for(Caixa caixa : caixas){
            if(caixa != null && caixa.getStatus() == status){
                contador++;
            }
        }
        return contador;
    }

    public void simularNovoCliente(){
        Caixa melhorCaixa = localizarMelhorCaixa();

        if(melhorCaixa != null){
            melhorCaixa.adicionarClienteNaFila();
        }else{
            this.totalClientesNaoAtendidos++;
            double valorPerdido = gerarValorCompraAleatorio();
            this.totalPerdas += valorPerdido;
            atualizarExtremosCompra(valorPerdido);
        }
    }

    private Caixa localizarMelhorCaixa(){
        Caixa melhorCaixa = null;
        int menorFila = Integer.MAX_VALUE;

        for(Caixa caixa : caixas){
            if(caixa != null && caixa.getStatus() == StatusCaixa.ATIVO){
                if(caixa.getNroClientesNaFila() < caixa.getNroClientesNaFila()){
                    if(caixa.getNroClientesNaFila() < menorFila){
                        menorFila = caixa.getNroClientesNaFila();
                        melhorCaixa = caixa;
                    }
                }
            }
        }
        return melhorCaixa;
    }

    private double gerarValorCompraAleatorio(){
        Random rand = new Random();
        return ParametrosSimulacao.ValCompraMin + 
                (ParametrosSimulacao.ValCompraMax - ParametrosSimulacao.ValCompraMin) * rand.nextDouble();
    }

    private void atualizarExtremosCompra (double valorCompra){
        if(valorCompra > this.valorMaiorCompra){
            this.valorMaiorCompra = valorCompra;
        }
        if(valorCompra < this.valorMenorCompra){
            this.valorMenorCompra = valorCompra;
        }
    }

    public double getTotalFaturamento() {return totalFaturamento;}

    public double getTotalPerdas() {return totalPerdas;}

    public int getNroClientesAtendidos() {return totalClientesAtendidos;}
    
    public int getNroClientesNaoAtendidos() {return totalClientesNaoAtendidos;}

    public double getValorMenorCompra() {
        return (valorMenorCompra == Double.MAX_VALUE) ? 0.0 : valorMenorCompra;
    }

    public double getValorMaiorCompra() {return valorMaiorCompra; }

    public void avancarTempo(){
        for (Caixa caixa : caixas){
            if(caixa != null && caixa.getStatus() == StatusCaixa.ATIVO && caixa.getNroClientesNaFila() > 0){
                if(Math.random() <= ParametrosSimulacao.ProbAtendimento){
                    caixa.atenderProximoCliente();
                    this.totalClientesAtendidos++;
                    double valorFaturado = gerarValorCompraAleatorio();
                    this.totalFaturamento += valorFaturado;
                    atualizarExtremosCompra(valorFaturado);
                }
            }
        }
    }
}
