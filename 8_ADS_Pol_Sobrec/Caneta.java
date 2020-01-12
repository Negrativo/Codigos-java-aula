public class Caneta{  //entidade

	private String marca;
	private int preco;
	private Origem orig;

//===================Sobrescrita==============

	public void impLocal(){
		System.out.println("\nEstou na classe-mae Caneta");
	}


//=================Construtores==============

	public Caneta(){ //default
		marca = "";
		preco = 0;
		orig = new Origem();
	}
	
public Caneta(String marca, int preco, Origem orig){ //sobrecarregado
		this.marca = marca;
		this.preco = preco;
		this.orig = orig;
	}


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