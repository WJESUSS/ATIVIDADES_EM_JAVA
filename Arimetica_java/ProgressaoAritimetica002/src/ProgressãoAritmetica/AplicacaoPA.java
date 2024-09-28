package ProgressãoAritmetica;

import java.util.Scanner;

public class AplicacaoPA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro termo da progressão aritmética: ");
        int primeiroTermo = scanner.nextInt();

        System.out.print("Digite a razão da progressão aritmética: ");
        int razao = scanner.nextInt();

        System.out.print("Digite o número de termos que deseja exibir: ");
        int n = scanner.nextInt();

      ProgressaoAritmetica pa =  new ProgressaoAritmetica(primeiroTermo, razao);

        System.out.println("Os primeiros " + n + " termos da progressão aritmética são:");
        for (int i = 0; i < n; i++) {
            System.out.print(pa.proximoTermo() + " ");
            scanner.close();
        }
    }
}