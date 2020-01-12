public class Tinteiro extends Caneta{  //entidade

	private String tipoPena;
	private int traco;

//===================================================

	public void impLocal(){
		System.out.println("\nEstou na classe-filha Tinteiro");

		//super.impLocal();
	}


//===================================================

	public void setTipoPena(String tipoPena){
		this.tipoPena = tipoPena;	
	}

	public void setTraco(int traco){
		this.traco = traco;
	}

	public String getTipoPena(){
		return tipoPena;
	}

	public int getTraco(){
		 return traco;
	}

}