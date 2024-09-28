package Conta_java_Poo;

/**Classe ContaEspecial*/
public class ContaEspecial extends Conta {
 private double limite;

 public ContaEspecial(int numero, String nomeCorrentista, double saldo, double limite) {
     super(numero, nomeCorrentista, saldo);
     this.limite = limite;
 }

 @Override
 public boolean sacar(double valor) {
     if (valor > 0 && getSaldo() + limite >= valor) {
         double novoSaldo = getSaldo() - valor;
         if (novoSaldo < 0) {
             limite += novoSaldo; /** Ajusta o limite*/
         }
         return true;
     }
     return false;
 }

 public double getLimite() {
     return limite;
 }
}
