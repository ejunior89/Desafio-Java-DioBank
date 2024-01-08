public class ContaCorrente extends Conta {
    private double taxaDeOperacao;

    public ContaCorrente(String titular, double taxaDeOperacao) {
        super(titular);
        this.taxaDeOperacao = taxaDeOperacao;
    }

    @Override
    public void sacar(double valor) {
        // Aplicação padrão de taxa de operação para saques na conta corrente
        double valorComTaxa = valor + taxaDeOperacao;
        super.sacar(valorComTaxa);
    }
}
