package Classes_Objetos;

public class ContaBancaria {

    String agencia;
    String numeroDaConta;
    Double saldo;
    String tipoDeConta;
    Cliente cliente;

    public void exibirDetalhes(){
        System.out.println("Agência: " + agencia);
        System.out.println("Número da conta: " + numeroDaConta);
        System.out.println("Titular: " + cliente.titular);
        System.out.println("Saldo: " + saldo);
        System.out.println("Tipo de Conta: " + tipoDeConta);
    }

}
