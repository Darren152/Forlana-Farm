public class Animal implements INoiseMaker,IEater{
    public static void main(String[] args) {
        System.out.println("We are friends, I'm an superNegro!");
    }

    @Override
    public String makeNoise() {

        return "Animals make noise";
    }

    @Override
    public String isEating() {
        return "Animals eat stuff";
    }
}










