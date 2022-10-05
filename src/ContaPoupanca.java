public class ContaPoupanca extends Conta {
    @Override
    public void nomeTitular(String nome) {
        System.out.println("Titular: " + nome);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("#### Extrato Conta Poupança ####");
        super.imprimirInfosComuns();
    }
}
