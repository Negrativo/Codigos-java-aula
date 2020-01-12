public class TstMain{ 


	public static void main(String arg[]){

        Caneta c1 = new Caneta(); 

        Notebook not = new Notebook();

		EntradaT l = new EntradaT();


	System.out.println("\n\t ...Entrada de Dados Caneta...." );

	c1.setPreco(Integer.parseInt(l.inData("\nInforme o preco: ")));
	c1.setMarca(l.inData("Informe a marca: "));
    c1.getOrig().setCodP(Integer.parseInt(l.inData("Informe o Codigo Pais: ")));
    c1.getOrig().setNomeP(l.inData("Informe o nome Pais: "));
    
    System.out.println("\n\t ...Entrada de Dados Notebook...." );

	not.setPreco(Integer.parseInt(l.inData("\nInforme o preco: ")));
    not.setNome(l.inData("\n Informe Nome do aparelho: "));
    not.setMarca(l.inData("\n Fabricante: "));
    
/* ---------------------------------------------------------------------------------*/

    System.out.println("\n\t ...Saida de Dados...." );

	System.out.println("\nPreco..: "+ c1.getPreco());
	System.out.println("Marca..: "+ c1.getMarca());

	System.out.println("Cod Pais...: "+ c1.getOrig().getCodP());
    System.out.println("Nome Pais..: "+ c1.getOrig().getNomeP());
    
    System.out.println("\n\n Notebook");
    System.out.println("\n Nome: "+ not.getNome());
    System.out.println("\n Marca: "+ not.getMarca());
    System.out.println("\n Preço: "+ not.getPreco());

	}

}