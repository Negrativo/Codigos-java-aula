public class Endereço{

    private String rua;
    private int num;

    public Endereço(){
        rua = "";
        num = 0;
    }

    public Endereço(String rua, int num){
        this.num = num;
        this.rua = rua;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    

}