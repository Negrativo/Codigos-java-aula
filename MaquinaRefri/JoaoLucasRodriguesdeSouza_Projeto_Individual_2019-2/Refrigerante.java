public class Refrigerante extends Capacidade{

    private int quantidade;
    private double preco;
     
    public Refrigerante(){
        quantidade = 0;
        preco = 0.0;
    }
    
    public Refrigerante(int quantidade, double preco){
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    
}