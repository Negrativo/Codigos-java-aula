public class TstCan{ 

	public static void main(String arg[]){

		Service s = new Service();


		Caneta c1 = new Caneta(); //instanciação

		c1.setPreco(s.soma(4,3));
		c1.setMarca("Pilot");

		c1.getOrig().setCodP(55);
		c1.getOrig().setNomeP("Brasil");



		System.out.println("\nMarca..: "+ c1.getMarca());
		System.out.println("\nPreco..: "+ c1.getPreco());

		System.out.println("\n\t ...Dados da Origem...." );

	System.out.println("\nCod Pais...: "+ c1.getOrig().getCodP());
	System.out.println("\nNome Pais..: "+ c1.getOrig().getNomeP());

		

	}

}