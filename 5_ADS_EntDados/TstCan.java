public class TstCan{ 

	public static void main(String arg[]){

		Caneta c1 = new Caneta(); //instanciação
		Leitura l = new Leitura();


	System.out.println("\n\t ...Entrada de Dados...." );

	c1.setPreco(Integer.parseInt(l.inData("\nInforme o preco: ")));
	c1.setMarca(l.inData("Informe a marca: "));
	c1.getOrig().setCodP(l.inData("Informe o Codigo Pais: ")));
	c1.getOrig().setNomeP(l.inData("Informe o nome Pais: "));

	System.out.println("\n\t ...Saida de Dados...." );

	System.out.println("\nPreco..: "+ c1.getPreco());
	System.out.println("Marca..: "+ c1.getMarca());
	System.out.println("Cod Pais...: "+ c1.getOrig().getCodP());
	System.out.println("Nome Pais..: "+ c1.getOrig().getNomeP());

	}

}