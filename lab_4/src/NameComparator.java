import java.util.Comparator;

public class NameComparator implements Comparator<SportsEquipment> {

    public int compare(SportsEquipment equipment1, SportsEquipment equipment2) {

        return Character.compare(equipment1.name.charAt(0), equipment2.name.charAt(0));

    }

}
