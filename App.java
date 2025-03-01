public class App {
    public static void main(String args[]) {
        ContaBancaria minhaConta = new ContaBancaria();
      

        minhaConta.titular = "Fred August";
        System.out.println("Conta pertecente a " + minhaConta.titular);
        minhaConta.exibirSaldo();

        minhaConta.depositar(500);
        minhaConta.sacar(200);
        minhaConta.exibirSaldo();
    }
}