public class Cine extends Point implements verifica{

    private int qtdCad;
    private Lanche Lanche;

    public Cine(){
        qtdCad = 0;
        Lanche = new Lanche();
    }

    public Cine(int qtdCad, Lanche Lanche){
        this.Lanche = new Lanche();
        this.qtdCad = qtdCad;
    }

    public int getQtdCad() {
        return qtdCad;
    }

    public void setQtdCad(int qtdCad) {
        this.qtdCad = qtdCad;
    }

    public Lanche getLanche() {
        return Lanche;
    }

    public void setLanche(Lanche lanche) {
        Lanche = lanche;
    }

    public void validar(){
        
    }

    public void CalcVal(){
        
    }


}