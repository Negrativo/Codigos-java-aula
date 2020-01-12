public class Caixa{

    private double valor;
    private double dinheiro;
    private double troco;

    public Caixa(){
        valor = 0;
        dinheiro = 0;
        troco = 0;
    }
    
    public Caixa(double valor, double dinheiro, double troco){
        this.valor = valor;
        this.troco = troco;
        this.dinheiro = dinheiro;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }

     public double getTroco() {
        return troco;
    }

    public void setTroco(double troco) {
        this.troco = troco;
    }

    public double Troco(double dinheiro, double valor) {
        System.out.println("Calculando troco: ");
        troco = dinheiro - valor;
        return troco;
    }

}