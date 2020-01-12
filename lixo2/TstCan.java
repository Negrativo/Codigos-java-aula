public class TstCan{

	public static void main(String arg[]){

		Caneta c1 = new Caneta(); //instanciação

		Service s = new Service();


		c1.setPreco(s.soma(4,3));

		c1.setMarca("Pilot");

		c1.getOring().setCodP(55);
		c1.getOring().setNomeP(Brasil);



		System.out.println("\nMarca..: "+ c1.getMarca());
		System.out.println("\nPreco..: "+ c1.getPreco());

		System.out.println("\n\t ...Dados de Origem... ");
		System.out.println("\nCodigo pais.: "+ c1.getCodP());
		System.out.println("\nNome pais.: "+ c1.getNomeP());


	}

}
