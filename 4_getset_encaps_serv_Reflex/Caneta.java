public class Caneta{  //entidade

	private String marca;
	private int preco;
	private Origem orig = new Origem();
//==================================================

	public void setOrig(Origem orig){
		this.orig = orig;
	}

	public Origem getOrig(){
		return orig;
	}


//==================================================

	public void setMarca(String marca){
		this.marca = marca;	
	}

	public void setPreco(int preco){
		if(preco > 0){
			this.preco = preco;
		}
		else{
			System.out.println("\nValor deve ser> 0");
		}
	}

	public String getMarca(){
		return marca;
	}

	public int getPreco(){
		 return preco;
	}

}