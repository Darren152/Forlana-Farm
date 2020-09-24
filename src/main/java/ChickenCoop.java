import java.util.ArrayList;

public class ChickenCoop {
        ArrayList<Chicken> Coop = new ArrayList<>();

        public ChickenCoop(){}

        public ChickenCoop(ArrayList<Chicken> coop) {
                Coop = coop;
        }

        public ArrayList<Chicken> getCoop() {
                return Coop;
        }

        public void setCoop(ArrayList<Chicken> coop) {
                Coop = coop;
        }
}
