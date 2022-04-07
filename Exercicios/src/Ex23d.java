//  Entrar via teclado com o sexo de determinado usuário, aceitar somente “F” ou “M” como respostas válidas.

import java.util.Scanner;

public class Ex23d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char sexo;
        String sexoFinal;

        do {
            System.out.println("Insira seu sexo (f/m): ");
            sexo = sc.next().charAt(0);
        }
        while (sexo != 'f' && sexo != 'm');

        if (sexo == 'f'){
            sexoFinal = "feminino";
        }
        else {
            sexoFinal = "masculino";
        }

        System.out.println("Seu sexo é" + sexoFinal);
    }
}
