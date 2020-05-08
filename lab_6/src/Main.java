import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Object> Bouquet = new ArrayList<Object>();
        float BouquetPrice = 0;

        Rose RedRose = new Rose("Красная роза", 49.99f, 30, 0);
        Rose YellowRose = new Rose("Жёлтая роза", 39.99f, 10, 2);
        Narcissus WhiteNarcissus = new Narcissus("Белый нарцисс", 44.99f, 25, 0);
        Narcissus YellowNarcissus = new Narcissus("Жёлтый нарцисс", 39.99f, 35, 3);
        Chrysanthemum Chrysanthemum = new Chrysanthemum(74.99f, 5, 3);
        Lily FreshLily = new Lily("Свежая лилия",24.99f, 15, 0);
        Lily Lily = new Lily(19.99f, 5, 4);
        Tulip FreshTulip = new Tulip(9.99f, 40, 0);
        Tulip RedTulip = new Tulip("Красный тюльпан", 14.99f, 20, 2);
        Tulip YellowTulip = new Tulip("Жёлтый тюльпан", 19.99f, 60, 3);

        Accessory Tape = new Accessory("Декоративная лента", 9.99f);
        Accessory GreetingCard = new Accessory("Поздравительная открытка", 9.99f);
        Accessory Wrapper = new Accessory("Декоративная обёртка", 4.99f);

        Bouquet.add(RedRose);
        Bouquet.add(YellowRose);
        Bouquet.add(WhiteNarcissus);
        Bouquet.add(YellowNarcissus);
        Bouquet.add(Chrysanthemum);
        Bouquet.add(FreshLily);
        Bouquet.add(Lily);
        Bouquet.add(FreshTulip);
        Bouquet.add(RedTulip);
        Bouquet.add(YellowTulip);

        Bouquet.add(Tape);
        Bouquet.add(GreetingCard);
        Bouquet.add(Wrapper);

        // Считаем и выводим общую стоимость букета
        for (Object bouquetElement: Bouquet) {
            BouquetPrice += ((CanBePutIntoBouquet)bouquetElement).getPrice();
        }
        System.out.println("Общая стоимость букета: " + Math.round(BouquetPrice));

        // Сортируем цветы по свежести (сначала свежие)
        FreshnessComparator MyComparator = new FreshnessComparator();
        Bouquet.sort(MyComparator);

        // Ввод левой и правой границы диапазона длины цветка
        Scanner MyScanner = new Scanner(System.in);
        System.out.println("Введите левую границу:");
        float leftBorder = MyScanner.nextFloat();
        System.out.println("Введите правую границу:");
        float rightBorder = MyScanner.nextFloat();

        // Вывод цветков, чья длина входит в указанный диапазон
        System.out.println("Цветы, длина которых входит в указанный диапазон:");
        for (Object bouquetElement: Bouquet) {
            if (bouquetElement instanceof Flower) {
                float flowerLength = ((Flower)bouquetElement).getLength();
                if ((flowerLength >= leftBorder) && (((Flower)bouquetElement).getLength() <= rightBorder)) {
                    System.out.println(((Flower)bouquetElement).getName());
                }
            }
        }

    }
}
