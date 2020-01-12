public class Notebook{

    private String nome;
    private int preco;
    private String marca;
    

    public void setMarca(String marca){
		this.marca = marca;	
	}

	public void setPreco(int preco){
		if(preco > 0){
            this.preco = preco;}
            else{
			System.out.println("\nErro no codigo.!");
            }
        }
    
    public void setNome(String nome){
            this.nome = nome;
        }
		

	public String getMarca(){
		return marca;
	}

	public int getPreco(){
         return preco;
    }
    
    public String getNome(){
        return nome;
    }
    
}