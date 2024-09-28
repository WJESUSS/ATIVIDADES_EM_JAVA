package Animal;

public class Ave extends Animal {
  
	
	private String corPena;

	@Override
	void locomover() {
		System.out.println("Voando");
	}

	@Override
	void alimentar() {
		System.out.println("Milho piste");
		
	}

	@Override
	void emitirSom() {
		System.out.println("Emite som");
		
	}
	public void fazerNinho() {
		System.out.println("Ele faz ninho");
	}

	public String getCorPena() {
		return corPena;
	}

	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}
	
}
