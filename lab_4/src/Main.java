import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Создаём экземпляры класса Sports Equipment
        SportsEquipment FootballBall = new SportsEquipment("Футбольный мяч", "Футбол", "Puma", 500, 0.5f);
        SportsEquipment GolfClub = new SportsEquipment("Клюшка для гольфа", "Гольф", "Callaway", 600, 1.f);
        SportsEquipment DartsKit = new SportsEquipment("Набор для дартса", "Дартс", "Bambi", 150, 0.2f);
        SportsEquipment PingPongDesk = new SportsEquipment("Стол для настольного тенниса", "Настольный теннис", "Stag Sport", 10000, 68f);
        SportsEquipment Bicycle = new SportsEquipment("Велосипед", "Велосипедный спорт", "TRINX", 8000, 15.2f);
        SportsEquipment SwimmingGoggles = new SportsEquipment("Очки для плавания", "Плавание", "Arena Zoom", 420, 0.1f);

        ArrayList<SportsEquipment> MyArray = new ArrayList<SportsEquipment>();

        // Добавляём экземпляры класса Sports Equipment в массив MyArray
        MyArray.add(FootballBall);
        MyArray.add(GolfClub);
        MyArray.add(DartsKit);
        MyArray.add(PingPongDesk);
        MyArray.add(Bicycle);
        MyArray.add(SwimmingGoggles);

        // Выыводим несортированный массив
        System.out.println("Спортивный инвентарь до сортировки:");
        for (SportsEquipment equipment : MyArray) {
            System.out.println(equipment.GiveData());
        }

        // Сортируем массив по цене по убыванию
        PriceComparator MyPriceComparator = new PriceComparator();
        MyArray.sort(MyPriceComparator);
        System.out.println("\nСпортивный инвентарь после сортировки по цене по убыванию:");
        for (SportsEquipment equipment : MyArray) {
            System.out.println(equipment.GiveData());
        }

        // Сортируем массив по именам по возростанию
        NameComparator MyNameComparator = new NameComparator();
        MyArray.sort(MyNameComparator);
        System.out.println("\nСпортивный инвентарь после сортировки по именам по возростанию:");
        for (SportsEquipment equipment : MyArray) {
            System.out.println(equipment.GiveData());
        }
    }
}
