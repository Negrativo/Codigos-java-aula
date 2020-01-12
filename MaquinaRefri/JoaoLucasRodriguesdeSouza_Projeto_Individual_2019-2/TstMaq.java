import java.util.Scanner;

public class TstMaq{




    public static void main(String arg[]){


    
        Painel p = new Painel();
    
        Scanner ler = new Scanner(System.in);
        try {
            p.escolheOpcoes();
            p.getMaq().getDinheiro();
            p.getMaq().setDinheiro(ler.nextInt());
            p.getMaq().Troco(p.getMaq().getDinheiro(),p.getMaq().getValor());
            System.out.println(p.getMaq().getTroco());
    } finally {
        ler.close();
        }
    }
}