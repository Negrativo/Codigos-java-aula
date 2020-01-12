public class MaquinaRefri extends Caixa{

    private double altura;
    private double largura;
    private Refrigerante refri;

    
    public MaquinaRefri() {
        altura = 1.80;
        largura = 1.10;
        new Caixa();
        new Capacidade();
        new Refrigerante();
    }

    public MaquinaRefri(double altura, double largura, Caixa caixa){
        this.altura = altura;
        this.largura = largura;
        this.caixa = Caixa();
        this.cap = Capacidade();
        this.refri = Refrigerante();
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public Refrigerante getRefri() {
        return refri;
    }

    public void setRefri(Refrigerante refri) {
        this.refri = refri;
    }

	

    
}