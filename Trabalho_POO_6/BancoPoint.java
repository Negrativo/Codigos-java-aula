import java.util.ArrayList;
import java.util.List;


public class BancoPoint{


    private List<Cine> BDCine = new ArrayList<Cine>();

        public void insereBDCine(Cine cine){
            BDCine.add(cine);
        }

        public List<Cine>consBDCine(){
            return BDCine;
        }

        public void deletaCine(int local) {
            BDCine.remove(local);
        }

        public void altItemBDCine(int local, Cine cine) {
            BDCine.set(local, cine);
        }

        



}