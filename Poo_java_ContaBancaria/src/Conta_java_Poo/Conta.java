package Conta_java_Poo;

/**Classe Conta*/
public class Conta {
 private int numero;
 private String nomeCorrentista;
 private double saldo;

 public Conta(int numero, String nomeCorrentista, double saldo) {
     this.numero = numero;
     this.nomeCorrentista = nomeCorrentista;
     this.saldo = saldo;
 }



public void depositar(double valor) {
     if (valor > 0) {
         saldo += valor;
     }
 }

 public boolean sacar(double valor) {
     if (valor > 0 && saldo >= valor) {
         saldo -= valor;
         return true;
     }
     return false;
 }

 public double getSaldo() {
     return saldo;
 }

 public int getNumero() {
     return numero;
 }

 public String getNomeCorrentista() {
     return nomeCorrentista;
 }



}