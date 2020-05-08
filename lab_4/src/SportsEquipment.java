public class SportsEquipment {

    // Переменные класа SportsEquipment
    public String name;
    public String sportName;
    public String manufacturerName;
    public float price;
    public float weight;

    // Контструктор класса SportsEquipment
    public SportsEquipment(String Name, String SportName, String ManufacturerName, float Price, float Weight) {

        this.name = Name;
        this.sportName = SportName;
        this.manufacturerName = ManufacturerName;
        this.price = Price;
        this.weight = Weight;

    }

    // Метод, выводящий все переменные экземпляра класса SportsEquipment
    public String GiveData() {

        StringBuilder data = new StringBuilder();
        data.append("Название = ").append(this.name);
        data.append(" | Спорт = ").append(this.sportName);
        data.append(" | Производитель = ").append(this.manufacturerName);
        data.append(" | Цена = ").append(this.price);
        data.append(" | Вес = ").append(this.weight);
        return data.toString();

    }
}
