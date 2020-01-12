public abstract class Point{

    private String nome;
    private int valConta;
    private Endereco Ender;

    public Point(){
        nome = "";
        valConta = 0;
        Ender = new Endereco();
    }

    public Point(String nome, int valConta, Endereco Ender){
        this.nome = nome;
        this.valConta = valConta;
        this.Ender = Ender;
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

    public void setValConta(String string) {
        this.valConta = string;
    }

    public Endereco getEnder() {
        return Ender;
    }

    public void setEnder(Endereco ender) {
        Ender = ender;
    }

    public void calValor(){
        System.out.println("val: "+ valConta*5);
    }
    


}