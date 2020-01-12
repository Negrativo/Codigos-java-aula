import java.util.Scanner;

public class Painel{

    private int opcao;
    private MaquinaRefri maq;

    Scanner ler = new Scanner(System.in);

    public Painel(){
        opcao = 5;
        maq = new MaquinaRefri();
    }

    public Painel(int opcao, Refrigerante refri, EntradaT t){
        this.opcao = opcao;
        this.maq = MaquinaRefri;
    }

    public String getOpcao() {
        return opcao;
    }

    public void setOpcao(int opcao) {
        this.opcao = opcao;
    }

    public MaquinaRefri getMaq() {
        return maq;
    }

    public void setMaq(MaquinaRefri maq) {
        this.maq = maq;
    }
    public int escolheOpcoes() {
        do {
          try {
            System.out.println("Qual Refrigerante deseja");
            System.out.println("( 1 ) - Guarana Antartica");
            System.out.println("( 2 ) - Coca-Cola");
            System.out.println("( 3 ) - Sprite");
            System.out.println("( 4 ) - Fanta");
            System.out.println("( 5 ) - Sair");
            System.out.printf("Digite uma opcão: ");
            opcao = ler.nextInt();
            if(opcao == 1){
                System.out.println("( 1 ) - Guarana Antartica");
                maq.getValor();
                maq.setValor(6.5);
                System.out.println("Insira o dinheiro: ");
            } 
            if(opcao < 0 && opcao > 4){
              System.out.println("Escolha um número entre 0 e 4\n");
            }
            if(opcao == 2){
                System.out.println("( 2 ) - Coca-Cola");
                maq.getValor();
                maq.setValor(7.0);
                System.out.println("Insira o dinheiro: ");
            }
            if(opcao == 3){
                System.out.println("( 3 ) - Sprite");
                maq.getValor();
                maq.setValor(5.5);
                System.out.println("Insira o dinheiro: ");
            }
            if(opcao == 4){
                System.out.println("( 4 ) - Fanta");
                maq.getValor();
                maq.setValor(4.89);
                System.out.println("Insira o dinheiro: ");
            }
            }
            catch(NumberFormatException e) {
            System.out.println("Escolha um número entre 0 e 4\n");
            }
        }   
            while (opcao == 0);
            return opcao;
    }
}