public class ContaBancaria {
    String titular;
    double saldo;


    public void depositar(double valor) {
    if (valor <= 0) {
        System.out.println("Valor informado não é válido pra depósito.");
    } else {
    saldo += valor;
    System.out.println("Depósito de " + valor + " realizado com sucesso!");
    }
    }

    public void sacar(double valor) {
    if (valor > saldo) {
        System.out.println("Valor informado não é válido pra saque.");
    } else {
        saldo -= valor;
    System.out.println("Saque de " + valor + " realizado com sucesso!");
    }
    }

    public void exibirSaldo() {
    System.out.println("Saldo atual de: R$" + saldo);
    }
}