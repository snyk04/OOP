public class Chamomile extends Flower {

    public Chamomile(float price, float length, int amountOfDaysSinceProducing) {
        super("Ромашка", price, length, amountOfDaysSinceProducing);
    }

    public Chamomile(String name, float price, float length, int freshness) {
        super(name, price, length, freshness);
    }
}
