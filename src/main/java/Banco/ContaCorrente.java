package Banco;

public class ContaCorrente extends  Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void ImprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfoComuns();
    }
}
