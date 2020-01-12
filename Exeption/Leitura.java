import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Leitura{
    public String inData(String msg){
        InputStreamReader teclado = new InputStreamReader(System.in);
        BufferedReader memoria = new BufferedReader(teclado);
        System.out.println(msg);
        String s="";
        try{
            s=memoria.readLine();
        }catch(IOException e){
            System.out.println("Erro de entrada!");
        }
        return s;
    }
}