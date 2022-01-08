package Banco;

public abstract class Conta implements IConta {
    private static int       SEQUENCIA      = 2;
    private static final int AGENCIA_PADRAO = 1;

    protected  int     agencia;
    protected  int     numero;
    protected  double  saldo;
    protected  Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero  = SEQUENCIA++;
        this.cliente = cliente;

    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta ContaDestino) {
        sacar(valor);
        ContaDestino.depositar(valor);
    }

    protected void imprimirInfoComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Número: %d",  this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}
