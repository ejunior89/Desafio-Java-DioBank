public class ContaPoupanca extends Conta {
    private double taxaRendimento;

    public ContaPoupanca(String titular, double taxaRendimento) {
        super(titular);
        this.taxaRendimento = taxaRendimento;
    }

    public void aplicarRendimento() {
        // Método para Aplicação de rendimento na conta poupança
        double rendimento = getSaldo() * taxaRendimento;
        setSaldo(getSaldo() + rendimento);
        System.out.println("Rendimento aplicado. Novo saldo: R$" + getSaldo());
    }
}
