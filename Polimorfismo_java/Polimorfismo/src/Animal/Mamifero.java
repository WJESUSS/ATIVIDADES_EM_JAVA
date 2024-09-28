package Animal;

public class Mamifero extends Animal {
	
	private String corDoPelo;
	
	
	

	@Override
	void locomover() {
		System.out.println("Correndo");
		
	}

	@Override
	void alimentar() {
		System.out.println("Mamando");
		
	}

	@Override
	void emitirSom() {
		System.out.println("Sim:Emite som");
		
	}

	public String getCorDoPelo() {
		return corDoPelo;
	}

	public void setCorDoPelo(String corDoPelo) {
		this.corDoPelo = corDoPelo;
	}
	


	
}
