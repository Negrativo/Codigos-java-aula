public class Lanche extends Point {

    
    private String Prato;
    private Point point;

    public Lanche() {
        ImparPar = "";
        Prato = "";
        new Point();
    }

    public Lanche(String ImparPar, String Prato, Point Point) {
        this.ImparPar = ImparPar;
        this.point = new Point();
        this.Prato = Prato;
    }

    public String getImP() {
        return ImP;
    }

    public void setImP(String imP) {
        ImP = imP;
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

    public void calValor(){
        if((getvalConta()%2)==0){
            System.out.println(VALOR_PAR);
            }else{
                System.out.println("Valor Impar");
    }
}
}



