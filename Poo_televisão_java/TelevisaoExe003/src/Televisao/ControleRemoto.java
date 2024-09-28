package Televisao;

public class ControleRemoto {

	    private Televisao tv;

	    /** Construtor*/
	    public ControleRemoto(Televisao tv) {
	        this.tv = tv;
	    }

	    /** Aumentar volume*/
	    public void aumentarVolume() {
	        tv.setVolumeSom(tv.getVolumeSom() + 1);
	    }

	    /** Diminuir volume*/
	    public void diminuirVolume() {
	        tv.setVolumeSom(tv.getVolumeSom() - 1);
	    }

	    /** Aumentar canal*/
	    public void aumentarCanal() {
	        tv.setCanal(tv.getCanal() + 1);
	    }

	    /** Diminuir canal*/
	    public void diminuirCanal() {
	        tv.setCanal(tv.getCanal() - 1);
	    }

	    /** Trocar para um canal indicado*/
	    public void trocarCanal(int novoCanal) {
	        tv.setCanal(novoCanal);
	    }

	    /** Consultar o valor do volume de som*/
	    public int consultarVolume() {
	        return tv.getVolumeSom();
	    }

	    /** Consultar o canal selecionado*/
	    public int consultarCanal() {
	        return tv.getCanal();
	    }
	}


