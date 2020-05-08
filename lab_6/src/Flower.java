public class Flower extends CanBePutIntoBouquet {

    private float length;
    private int freshness;

    public Flower(String name, float price, float length, int freshness) {
        super(name, price);
        this.length = length;
        this.freshness = freshness;
    }

    public int getFreshness() {
        return freshness;
    }

    public void setFreshness(int freshness) {
        this.freshness = freshness;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }
}
