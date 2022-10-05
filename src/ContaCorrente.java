public class ContaCorrente extends Conta {

    @Override
    public void nomeTitular(String nome) {
        System.out.println("Titular: " + nome);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("#### Extrato Conta Corrente ####");
        super.imprimirInfosComuns();
    }
}
