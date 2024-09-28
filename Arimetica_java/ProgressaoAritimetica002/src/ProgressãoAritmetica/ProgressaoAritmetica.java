package ProgressãoAritmetica;

	public class ProgressaoAritmetica {
	    private int primeiroTermo;
	    private int razao;
	    private int termoAtual;

	    public ProgressaoAritmetica(int primeiroTermo, int razao) {
	        this.setPrimeiroTermo(primeiroTermo);
	        this.razao = razao;
	        this.termoAtual = primeiroTermo;
	    }

	    public int proximoTermo() {
	        int termo = termoAtual;
	        termoAtual += razao;
	        return termo;
	    }

		public int getPrimeiroTermo() {
			return primeiroTermo;
		}

		public void setPrimeiroTermo(int primeiroTermo) {
			this.primeiroTermo = primeiroTermo;
		}
	}

