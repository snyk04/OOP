import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Bouquet bouquet = new Bouquet();

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

        bouquet.add(RedRose);
        bouquet.add(YellowRose);
        bouquet.add(WhiteNarcissus);
        bouquet.add(YellowNarcissus);
        bouquet.add(Chrysanthemum);
        bouquet.add(FreshLily);
        bouquet.add(Lily);
        bouquet.add(FreshTulip);
        bouquet.add(RedTulip);
        bouquet.add(YellowTulip);

        bouquet.add(Tape);
        bouquet.add(GreetingCard);
        bouquet.add(Wrapper);

        /* System.out.println(bouquet.countPrice());
        bouquet.sortByFreshness();
        bouquet.printFlowersInLengthRange(); */
    }
}
