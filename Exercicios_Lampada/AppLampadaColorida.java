public class AppLampadaColorida {
    
    public static void main(String[] args){
        LampadaColorida[] lampadas = new LampadaColorida[5];
        LampadaColorida.CorDaLampada[] cores = LampadaColorida.CorDaLampada.values();
    
        for (int i = 0; i < lampadas.length; i++){
            lampadas[i] = new LampadaColorida(cores[i]);
            lampadas[i].setEtiqueta("LPD_" + (i + 1));
            lampadas[i].ligar();
        }

        System.out.printf("\nLâmpadas Queimadas: \n");
        for (int j = 0; j < lampadas.length; j++){
            if (lampadas[j].getEstado() == Lampada.EstadoLampada.QUEIMADA){
                System.out.println(lampadas[j].getEtiqueta());
            }
        }
		 System.out.printf("\nLâmpadas Queimadas (Com a cor inclusa): \n");
        for (int k = 0; k < lampadas.length; k++){
            if (lampadas[k].getEstado() == Lampada.EstadoLampada.QUEIMADA){
                System.out.println(lampadas[k].getEtiqueta() + " " + lampadas[k].getCor());
            }
        }
    }
}