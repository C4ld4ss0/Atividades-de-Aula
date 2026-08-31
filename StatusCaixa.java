public enum StatusCaixa{
        ATIVO(1),
        INATIVO(2);

        private final int valor;

        StatusCaixa(int valor){
            this.valor = valor;
        }

        public int getValor(){
            return valor;
        }
    }