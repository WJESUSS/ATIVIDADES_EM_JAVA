package Animal;



public class Cachorro extends Mamifero{
      
	
	@Override void emitirSom() {
		System.out.println("Late");

	}
	@Override void alimentar() {
		System.out.println("Come ração");
	}
	public void reagir(String frase) {
		if(frase =="toma") {
			System.out.println("Abanar o rabo e latir");
		}
	
	}
	public void reagir(int hora) {
		if(hora < 12) {
			System.out.println("Ele que comer");
		}else if(hora <17) {
			System.out.println("Ele que brincar");
		}else {
			System.out.println("Ele que dormi");
		}
	}
	public void reagir(boolean dono) {
		if(dono==true) {
			System.out.println("Ele vai abanar o rabo");
		}else {
			System.out.println("Ele vai rosnar");
		}
	}
	public void reagir(int idade , float peso) {
		if(idade < 5 && peso < 10) {
			System.out.println("Ele é pequeno");
		}else if( idade < 10 && peso < 50 ) {
			System.out.println("Ele é medio");
		}else {
			System.out.println("Ele é grande");
		}
	}
	
}
