package Classes_Objetos;

public class Main {
    static void main() {
        ContaBancaria contaDaMaria = new ContaBancaria();
        contaDaMaria.cliente = new Cliente();

        contaDaMaria.cliente.titular = "Maria";
        contaDaMaria.tipoDeConta = "Conta Poupança";
        contaDaMaria.saldo = 1500.50;
        contaDaMaria.agencia = "234-X";
        contaDaMaria.numeroDaConta = "5412-5";

        ContaBancaria contaDoJose = new ContaBancaria();
        contaDoJose.cliente = new Cliente();

        contaDoJose.cliente.titular = "José";
        contaDoJose.tipoDeConta = "Conta Corrente";
        contaDoJose.saldo = 2300.50;
        contaDoJose.agencia = "544-A";
        contaDoJose.numeroDaConta = "7689-0";

        contaDaMaria.exibirDetalhes();
        System.out.println("------------------------------------------");
        contaDoJose.exibirDetalhes();
    }
}
