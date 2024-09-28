package Animal;

public class TesteAnimal {

	public static void main(String[] args) {

      
		Mamifero m = new Mamifero();
		m.setCorDoPelo("Azul");
		m.setIdade(3);
		m.setMembros(4);
		m.setPeso(30);
		m.alimentar();
		m.emitirSom();
		m.locomover();
		m.toString();
		
		Reptil r = new Reptil();
		r.setCorEscama("Verde");
		r.setIdade(2);
		r.setMembros(2);
		r.setPeso(10);
		r.alimentar();
		r.emitirSom();
		r.locomover();
		r.toString();
		
		Peixe p =  new Peixe();
		p.setCorEscama("Verde e amarelo");
		p.setIdade(1);
		p.setMembros(0);
		p.setPeso(320);
		p.alimentar();
		p.emitirSom();
		p.locomover();
		p.toString();
		
		
		Cachorro c = new Cachorro();
		c.reagir(10, 30);
		c.reagir(false);
		c.reagir("toma");
		c.reagir(20);
		
		Tartaruga t = new Tartaruga();
	


	}

}
