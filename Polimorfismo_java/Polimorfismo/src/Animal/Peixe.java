package Animal;

public class Peixe extends Animal {
  private String corEscama;

@Override
void locomover() {
	System.out.println("Nadando");
}

@Override
void alimentar() {
	System.out.println("Se alimemnta de outro peixes ");
	
}

@Override
void emitirSom() {
	System.out.println("Não emitir som");
	
}
public void soltaBolhas() {
	System.out.println("Solta bolhas");
}

public String getCorEscama() {
	return corEscama;
}

public void setCorEscama(String corEscama) {
	this.corEscama = corEscama;
}
}
