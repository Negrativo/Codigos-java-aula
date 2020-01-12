public class Capacidade{

    private int qtdmax;
    private int qtd;

    public Capacidade(){
        qtdmax = 40;
        qtd = 0;
    }

    public Capacidade(int qtd, int qtdmax){
        this.qtdmax = qtdmax;
        this.qtd = qtd;
        

    }

    public int getQtdmax() {
        return qtdmax;
    }

    public void setQtdmax(int qtdmax) {
        this.qtdmax = qtdmax;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
		this.qtd = qtd;
	}

}