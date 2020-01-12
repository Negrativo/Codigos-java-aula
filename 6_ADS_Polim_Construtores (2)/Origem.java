public class Origem{  //entidade

	private String nomeP;
	private int codP;

//=================Construtores==============

	public Origem(){ //default
		nomeP = "";
		codP = 0;
	}

	public Origem(String nomeP, int codP){ //sobrecarregado
		this.nomeP = nomeP;
		this.codP = codP;
	}

//============================================

	public void setNomeP(String nomeP){
		this.nomeP= nomeP;	
	}

	public void setCodP(int codP){
		this.codP = codP;
	}

	public String getNomeP(){
		return nomeP;
	}

	public int getCodP(){
		 return codP;
	}

}