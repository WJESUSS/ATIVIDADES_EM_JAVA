package Imovel_Poo;

public class Imovel_Velho extends Imovel {
    private double descontoPreco;

    public Imovel_Velho(String endereco, double preco, double descontoPreco) {
        super(endereco, preco);
        this.descontoPreco = descontoPreco;
    }

    public double getDescontoPreco() {
        return descontoPreco;
    }

    public void setDescontoPreco(double descontoPreco) {
        this.descontoPreco = descontoPreco;
    }

    @Override
    public void imprimeDados() {
        super.imprimeDados();
        System.out.println("Desconto no preço: " + descontoPreco);
        System.out.println("Preço com desconto: " + (getPreco() - descontoPreco));
    }

	@Override
	public String toString() {
		return " " + descontoPreco + "";
	}
}