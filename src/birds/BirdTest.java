package birds;

public class BirdTest {
    public static void main(String[] args) {


        Bird goldfinch = new Bird();
        goldfinch.setName("Goldfinch");
        goldfinch.makeNoise();

        Duck duck = new Duck();
        duck.makeNoise();
    }
}
