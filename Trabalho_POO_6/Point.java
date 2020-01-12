public abstract class Point {

    private int codpoint;
    private String nome;
    private int valConta;
    private Endereço ender;

    public Point(int codpoint, String nome, int valConta) {
        this.codpoint = codpoint;
        this.nome = nome;
        this.valConta = valConta;
    }

    public Endereço getEnder() {
        return ender;
    }

    public void setEnder(Endereço ender) {
        this.ender = ender;
    }

    public Point() {
        codpoint = 0;
        nome = "";
        valConta = 0;
        ender = new Endereço();
    }

    public int getCodpoint() {
        return codpoint;
    }

    public void setCodpoint(int codpoint) {
        this.codpoint = codpoint;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getValConta() {
        return valConta;
    }

    public void setValConta(int valConta) {
        this.valConta = valConta;
    }

    public void CalcVal(){
        valConta= valConta+10;
    }

}