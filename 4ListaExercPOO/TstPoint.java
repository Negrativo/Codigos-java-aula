public class TstPoint{

    public static void main(String arg[]){

        Lanche Lanche = new Lanche();
        
        Point P = new Point();

        Endereco End = new Endereco();

        Cine cine = new Cine();
 
        EntradaT l = new EntradaT();

        Sistem.out.println("");

        /* --------------------------- C.1-------------------*/
        cine.setNome("cinema");
        cine.getLanche().setValConta("145");
        cine.getEnder().setRua("Rua sao paulo");

        /* --------------------------- C.2-------------------*/

        System.out.println("Nome do cinema: "+cine.getNome());
        System.out.println("Endereço: "+cine.getRua());




    }


}