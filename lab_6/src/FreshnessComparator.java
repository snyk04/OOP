import java.util.Comparator;

public class FreshnessComparator implements Comparator<Object> {

    public int compare(Object object1, Object object2) {
        if (object1 instanceof Flower) {
            return Float.compare(((Flower)object1).getFreshness(), ((Flower)object2).getFreshness());
        }
        return -2;
    }
}
