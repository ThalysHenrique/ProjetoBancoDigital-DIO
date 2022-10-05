import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        Conta cc = new ContaCorrente();
        cc.depositar(200);
        cc.nomeTitular("Thalys");

        Conta cp = new ContaPoupanca();
        cc.transferir(200, cp);
        cp.depositar(150);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        sc.close();
    }
}
