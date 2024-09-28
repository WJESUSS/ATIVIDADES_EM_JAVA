package Animal;

public abstract class Animal {
    private int peso;
    private int idade;
    private int membros;
    
    abstract void locomover();
    abstract void alimentar();
    abstract void emitirSom();
    
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getMembros() {
		return membros;
	}
	public void setMembros(int membros) {
		this.membros = membros;
	}
@Override
public String toString() {
	
	System.out.println("Peso "+this.getPeso());
	System.out.println("Idade "+this.getIdade());
	System.out.println("Membros "+this.getMembros());
	System.out.println("-----------------------");


	return super.toString();
}
    
}
