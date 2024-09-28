package Animal;

public class Reptil extends Animal {
	
	private String corEscama;

	@Override
	void locomover() {
		System.out.println("Rastejando");
		
	}

	@Override
	void alimentar() {
		System.out.println("Come vegetal");
	}

	@Override
	void emitirSom() {
		System.out.println("Não emiti som");
		
	}

	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	

}
