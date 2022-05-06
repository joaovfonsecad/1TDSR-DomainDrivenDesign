import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int id;
        int idade;
        String nome;
        String email;
        ContaBancaria conta = null;
        char posuiConta;
        char attEmail;
        boolean emailAtualizado = false;

        Cliente[] clientes = new Cliente[5];

        for (int i = 0; i < 5; i++) {
            id = i +1;

            System.out.println("Cliente ID[" + id + "]:");

            System.out.print("Idade: ");
            idade = sc.nextInt();
            sc.nextLine();

            System.out.print("Nome: ");
            nome = sc.nextLine();

            System.out.print("Email: ");
            email = sc.nextLine();

            System.out.print("Possui conta? (y/n): ");

            do {
                posuiConta = sc.next().charAt(0);
                sc.nextLine();
                if (posuiConta == 'y') {
                    ContaBancaria co = new ContaBancaria();

                    System.out.print("Agência: ");
                    co.setAgencia(sc.nextLine());

                    System.out.print("Número: ");
                    co.setNumero(sc.nextLine());

                    System.out.print("Saldo: ");
                    co.setSaldo(sc.nextDouble());

                    conta = co;
                }
                else if (posuiConta != 'n') {
                    System.out.println("Opção inválida, digite 'y' para sim ou 'n' para não: ");
                }
            } while (posuiConta != 'y' && posuiConta != 'n');

            Cliente cli = new Cliente(id, idade, nome, email, conta);
            clientes[i] = cli;
            conta = null;
            System.out.println("---------------");
        }
        exibirLista(clientes);

        System.out.println("Deseja modificar algum email? (y/n)");
        do {
            attEmail = sc.next().charAt(0);
            sc.nextLine();
            if (attEmail == 'y') {
                emailAtualizado = true;
                System.out.println("Qual o id onde deseja modificar o email?");
                do {
                    id = sc.nextInt();
                    sc.nextLine();
                    if (id <= 0 || id > clientes.length) {
                        System.out.println("Id inválido, tente novamente:");
                    }
                }
                while (id <= 0 || id > clientes.length);

                System.out.print("Novo email: ");

                email = sc.nextLine();
                clientes[id - 1].atualizarEmail(email);
                System.out.println("---------------");
                System.out.println("Deseja atualizar outro email? (y/n)");
            }
            else if (attEmail != 'n') {
                System.out.println("Opção inválida, digite 'y' para sim ou 'n' para não: ");
            }
        }
        while (attEmail != 'n');

        if (emailAtualizado) {
            System.out.println("---------------");
            exibirLista(clientes);
        }
    }

    private static void exibirLista(Cliente[] clientes) {
        for (int i = 0; i < 5; i++) {
            System.out.println(clientes[i].exibirNomeIdade());
            if (clientes[i].getConta() != null) {
                System.out.println(clientes[i].exibirDadosConta());
            }
            else {
                System.out.println("Ainda não possui conta.");
            }
            System.out.println("---------------");
        }
    }
}
