public class Cliente {
    private int id;
    private int idade;
    private String nome;
    private String email;
    private ContaBancaria conta;

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
        return ("Agencia: " + this.conta.getAgencia() + "\nNúmero: " + this.conta.getNumero()
        + "\nSaldo: " + this.conta.getSaldo());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ContaBancaria getConta() {
        return conta;
    }

    public void setConta(ContaBancaria conta) {
        this.conta = conta;
    }
}
