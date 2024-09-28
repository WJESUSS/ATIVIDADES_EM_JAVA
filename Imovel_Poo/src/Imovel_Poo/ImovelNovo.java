package Imovel_Poo;

public class ImovelNovo extends Imovel {
    private double adicionalPreco;

    public ImovelNovo(String endereco, double preco, double adicionalPreco) {
        super(endereco, preco);
        this.adicionalPreco = adicionalPreco;
    }

    public double getAdicionalPreco() {
        return adicionalPreco;
    }

    public void setAdicionalPreco(double adicionalPreco) {
        this.adicionalPreco = adicionalPreco;
    }

    @Override
    public void imprimeDados() {
        super.imprimeDados();
        System.out.println("Adicional no preço: " + adicionalPreco);
        System.out.println("Preço total: " + (getPreco() + adicionalPreco));
    }
}