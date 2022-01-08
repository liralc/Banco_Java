package Banco;
import java.util.Scanner;
import java.text.ParseException;

public class Main {
    public  static void  main(String[] args) {
        Cliente lira = new Cliente();
        lira.setNome("Anderson Lira");

        Conta CC = new ContaCorrente(lira);
        Conta CP = new ContaPoupanca(lira);

        CC.depositar(200.00);
        CP.depositar(101.10);

        CC.ImprimirExtrato();
        CC.transferir(50.00, CP);
        CP.ImprimirExtrato();
        CC.ImprimirExtrato();

    }
}
