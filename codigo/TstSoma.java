public class TstSoma{ 

	public static void main(String arg[]){

		Service s = new Service();

		int val1 = s.soma(3,4);
		int val2 = s.soma("Jesus", "Cristo");
		int val3 = s.soma(10,"Abacaxi");
		

		System.out.println("\n Val1...: "+val1);
		System.out.println("\n Val2...: "+val2);
		System.out.println("\n Val3...: "+val3);

	}

}