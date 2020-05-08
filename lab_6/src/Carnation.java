public class Carnation extends Flower {

    public Carnation(float price, float length, int amountOfDaysSinceProducing) {
        super("Гвоздика", price, length, amountOfDaysSinceProducing);
    }

    public Carnation(String name, float price, float length, int freshness) {
        super(name, price, length, freshness);
    }
}
