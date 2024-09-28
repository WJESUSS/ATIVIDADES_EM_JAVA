package Televisao;

public class Televisao {
    private int canal;
    private int volumeSom;

    /** Construtor*/
    public Televisao(int canal, int volumeSom) {
        this.canal = canal;
        this.volumeSom = volumeSom;
    }

    /** Métodos get e set para canal*/
    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    /** Métodos get e set para volumeSom*/
    public int getVolumeSom() {
        return volumeSom;
    }

    public void setVolumeSom(int volumeSom) {
        this.volumeSom = volumeSom;
    }
}

