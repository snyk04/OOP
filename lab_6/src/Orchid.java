public class Orchid extends Flower {

    public Orchid(float price, float length, int amountOfDaysSinceProducing) {
        super("Орхидея", price, length, amountOfDaysSinceProducing);
    }

    public Orchid(String name, float price, float length, int freshness) {
        super(name, price, length, freshness);
    }
}
