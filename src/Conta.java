public class Conta {
    private String titular;
    private double saldo;

    public Conta(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
    }

    // Métodos getters e setters para encapsulamento dos dados
    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double novoSaldo) {
        this.saldo = novoSaldo;
    }

    // operações comuns a todas as contas
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado. Novo saldo: R$" + saldo);
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado. Novo saldo: R$" + saldo);
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    public void transferir(Conta destino, double valor) {
        if (valor <= saldo) {
            sacar(valor);
            destino.depositar(valor);
            System.out.println("Transferência de R$" + valor + " realizada para " + destino.getTitular());
        } else {
            System.out.println("Saldo insuficiente para transferência.");
        }
    }
}