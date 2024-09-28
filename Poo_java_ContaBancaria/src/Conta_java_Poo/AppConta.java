package Conta_java_Poo;

import java.util.Scanner;

public class AppConta {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    
    	
    	System.out.println("Deseja sacar quanto");
    	int sacar = sc.nextInt();
    	
    
        Conta[] contas = new Conta[3];
        contas[0] = new ContaEspecial(1, "wash", 500.0, 1000.0);
        contas[1] = new Conta(2, "Maria", 1500.0);
        contas[2] = new Conta(3, "José", 2000.0);
        
        
        // Exemplo de operações
        contas[0].sacar(500.0);
        contas[1].sacar(300.0);
        contas[2].sacar(2500.0); 

        // Exibir saldos
        for (Conta conta : contas) {
            System.out.println("Conta " + conta.getNumero() + " - Saldo: " + conta.getSaldo());
        }
    }
}
