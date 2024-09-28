package Imovel_Poo;

public class Imprimir_Iovel {

	public static void main(String[] args) {
		
		Imovel im = new Imovel(" rua da bolandeira", 50000.0);
		
		
	
		im.imprimeDados();
		im.setPreco(5000.0);
		 
		
		Imovel_Velho vl =new Imovel_Velho("Rua da bolandeira", 5000.0, 60000.0);
		
		vl.getPreco();
		vl.getEndereco();
		vl.getDescontoPreco();
		vl.imprimeDados();
		
		System.out.println("O valor do imovel " +vl.toString());
		
		
		ImovelNovo in = new ImovelNovo("Rua pituacu", 70000.0, 20000.0);
		
		in.imprimeDados();
		

	}

}
