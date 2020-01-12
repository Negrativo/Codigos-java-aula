public class Lanche extends Point implements verifica {

    private String Prato;
    private Point point;

    public Lanche() {
        Prato = "";
    }

    public Lanche(String Prato, Point point) {
        this.Prato = Prato;
    }

    public String getPrato() {
        return Prato;
    }

    public void setPrato(String prato) {
        Prato = prato;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    
    public void validar(){
        
    }

    public void CalcVal(){
        if (getValConta()%2==0){
            System.out.println("Valor PAR!");
        }
        else{
            System.out.println("Valor impar!");
        }
    }

}




