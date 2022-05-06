public class Cliente {
    public int id;
    public int idade;
    public String nome;
    public String email;
    public ContaBancaria conta;

    Cliente() {}

    Cliente(int id, int idade, String nome, String email, ContaBancaria conta) {
        this.id = id;
        this.idade = idade;
        this.nome = nome;
        this.email = email;
        this.conta = conta;
    }

    public void atualizarEmail(String novoEmail) {
        this.email = novoEmail;
    }

    public String exibirNomeIdade() {
        return ("Email: " + this.email + "\nId: " + this.id + "\nNome: " + this.nome + "\nIdade: " + this.idade);
    }

    public String exibirDadosConta() {
        return ("Agencia: " + this.conta.agencia + "\nNúmero: " + this.conta.numero
        + "\nSaldo: " + this.conta.saldo);
    }
}
