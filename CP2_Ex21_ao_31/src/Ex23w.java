//  Entrar via teclado com o sexo de determinado usuário, aceitar somente “F” ou “M” como respostas válidas.

import java.util.Scanner;

public class Ex23w {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira seu sexo (f/m): ");
        char sexo = sc.next().charAt(0);
        String sexoFinal;

        while (sexo != 'f' && sexo != 'm') {
            System.out.println("Sexo invalido. Tente novamente: ");
            sexo = sc.next().charAt(0);
        }

        if (sexo == 'f'){
            sexoFinal = "feminino";
        }
        else {
            sexoFinal = "masculino";
        }

        System.out.println("Seu sexo é" + sexoFinal);
    }
}
