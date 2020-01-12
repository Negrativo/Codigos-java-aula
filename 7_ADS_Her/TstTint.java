public class TstTint{ 

	public static void main(String arg[]){

		Tinteiro tnt  = new Tinteiro();
		Caneta cn = new Caneta();

		//cn.setTipoPena("Plastico");

		tnt.setTipoPena("Metal");
		tnt.setTraco(16);

		tnt.setMarca("MontBlanc"); //caneta
		tnt.setPreco(13500); //caneta

	System.out.println("\nTipo: "+tnt.getTipoPena());
	System.out.println("\nTraco: "+tnt.getTraco());

	System.out.println("\nMarca: "+tnt.getMarca());
	System.out.println("\nPreco: "+tnt.getPreco());



	}

}