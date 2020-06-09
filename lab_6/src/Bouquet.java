import java.util.ArrayList;
import java.util.Scanner;

public class Bouquet {

    private ArrayList<CanBePutIntoBouquet> bouquet = new ArrayList<CanBePutIntoBouquet>();

    public Bouquet() {
    }

    public float countPrice() {
        // Считаем общую стоимость букета

        int bouquetPrice = 0;
        for (CanBePutIntoBouquet bouquetElement: bouquet) {
            bouquetPrice += bouquetElement.getPrice();
        }
        return bouquetPrice;
    }

    public void sortByFreshness() {
        // Сортируем цветы по свежести (сначала свежие)

        FreshnessComparator MyComparator = new FreshnessComparator();
        bouquet.sort(MyComparator);
    }

    public void printFlowersInLengthRange() {
        // Ввод левой и правой границы диапазона длины цветка

        Scanner MyScanner = new Scanner(System.in);
        System.out.println("Введите левую границу:");
        float leftBorder = MyScanner.nextFloat();
        System.out.println("Введите правую границу:");
        float rightBorder = MyScanner.nextFloat();

        // Вывод цветков, чья длина входит в указанный диапазон
        System.out.println("Цветы, длина которых входит в указанный диапазон:");
        for (Object bouquetElement: bouquet) {
            if (bouquetElement instanceof Flower) {
                float flowerLength = ((Flower)bouquetElement).getLength();
                if ((flowerLength >= leftBorder) && (((Flower)bouquetElement).getLength() <= rightBorder)) {
                    System.out.println(((Flower)bouquetElement).getName());
                }
            }
        }
    }

    public void add(CanBePutIntoBouquet bouquetMember) {
        bouquet.add(bouquetMember);
    }
}
