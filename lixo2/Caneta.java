public class Caneta{  //entidade

	private String nomeP;
	private int codP;
	private Origem orig = new Origem;

	public void setOrig(Origem orig){
		this.orig = orig
	}
	
	public Origem getOrig(){
		return orig;
	}

	public void setNomeP(String nomeP){
		this.nomeP = nomeP;	
	}

	public void setCodeP(int codeP){
		if(codeP > 0){
			this.codeP = codeP;
		}
		else{
			System.out.println("\nValor deve ser> 0");
		}
	}

	public String getNomeP(){
		return nomeP;
	}

	public int getCodeP(){
		 return codeP;
	}

}