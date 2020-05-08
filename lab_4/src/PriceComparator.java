import java.util.Comparator;

public class PriceComparator implements Comparator<SportsEquipment> {

    public int compare(SportsEquipment equipment1, SportsEquipment equipment2) {

        return Float.compare(equipment2.price, equipment1.price);

    }

}
