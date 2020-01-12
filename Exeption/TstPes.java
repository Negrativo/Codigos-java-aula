public class TstPes{
    public static void main(String arg[]){
        Pessoa p = new Pessoa();
        Leitura l = new Leitura();
        try{
            p.setNome(l.inData("\nNome:"));
            p.setCpf(Integer.parseInt(l.inData("\nCPF:")));
            p.setSalario(Integer.parseInt(l.inData("\nSalario:")));

            System.out.println("\n\n");
            System.out.println("\nCPF:"+p.getCpf());
            System.out.println("\nNome:"+p.getNome());
            System.out.println("\nSalario:"+p.getSalario());
        }catch(SalException se){
            se.impGatilho();
        }catch(NumberFormatException nfe){
            System.out.println("\nO valor de ser numerico!");
        }
    }
}