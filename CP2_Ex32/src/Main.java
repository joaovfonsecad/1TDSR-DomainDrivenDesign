//  Crie uma classe conforme o Diagrama de Classe (UML). Crie um programa que utilize essa classe para
//  cadastrar 5 clientes em uma lista de clientes. Ao final exibir apenas os clientes que tem mais de 18 anos.

public class Main {
    public static void main(String[] args) {
        Cliente[] listaClientes = new Cliente[5];

        Cliente clienteA = new Cliente();
        Cliente clienteB = new Cliente();
        Cliente clienteC = new Cliente();
        Cliente clienteD = new Cliente();
        Cliente clienteE = new Cliente();

        clienteA.id = 1;
        clienteA.idade = 10;
        clienteA.email = "clienteA@fakemail.com";
        clienteA.nome = "Cliente Antunes";

        clienteB.id = 2;
        clienteB.idade = 20;
        clienteB.email = "clienteB@fakemail.com";
        clienteB.nome = "Cliente Bronson";

        clienteC.id = 3;
        clienteC.idade = 22;
        clienteC.email = "clienteC@fakemail.com";
        clienteC.nome = "Cliente Colson";

        clienteD.id = 4;
        clienteD.idade = 12;
        clienteD.email = "clienteD@fakemail.com";
        clienteD.nome = "Cliente Doberman";

        listaClientes[0] = clienteA;
        listaClientes[1] = clienteB;
        listaClientes[2] = clienteC;
        listaClientes[3] = clienteD;

        for (int i = 0; i < 4; i++) {
            if (listaClientes[i].idade >= 18) {
                System.out.println(listaClientes[i].nome + " já pode ser preso.");
            }
        }
    }
}
