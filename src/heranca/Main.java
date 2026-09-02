package heranca;

public class Main {
    static void main() {
        PessoaJuridica pj = new PessoaJuridica();
        pj.setEndereco(new Endereco("Rua J", "500", "Centro", "Sousa"));
        pj.setContato(new Contato("4444-4444", "pj@gmail.com"));
        pj.setNome("Space-X");
        pj.setCnpj("541645651");

        PessoaFisica pf = new PessoaFisica("José",
                new Endereco("Rua 2", "18", "Iracema", "Sousa"),
                new Contato("0000-0000", "jose@email.com"), "0983918123");
    }
}
