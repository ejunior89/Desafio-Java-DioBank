public class DioBankTeste {
    public static void main(String[] args) {
        // Criando contas de usuario para teste.
        ContaCorrente contaCorrente = new ContaCorrente("João", 5.0);
        ContaPoupanca contaPoupanca = new ContaPoupanca("Maria", 0.03);

        // Realizando operações de deposito, saque e transferência entre contas
        contaCorrente.depositar(1000.0);
        contaCorrente.sacar(100.0);

        contaPoupanca.depositar(500.0);
        contaPoupanca.aplicarRendimento();

        // Transferência entre contas
        contaCorrente.transferir(contaPoupanca, 200.0);
    }
}
