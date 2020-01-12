public class Pessoa{
    private int cpf;
    private String nome;
    private int salario;

    public Pessoa(){
        cpf=0;
        nome="";
        salario=0;
    }
    public Pessoa(int cpf,int salario,String nome){
        this.cpf=cpf;
        this.nome=nome;
        this.salario=salario;
    }

    public int getCpf(){
        return cpf;
    }
    public String getNome(){
        return nome;
    }
    public int getSalario(){
        return salario;
    }
    public void setCpf(int cpf){
        this.cpf = cpf;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setSalario(int salario)throws SalException{
        if(salario >= 1000){
            this.salario = salario;   
        }else{
            throw new SalException();
        }
    }
}