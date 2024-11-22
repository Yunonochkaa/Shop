
public class Banana extends Product implements Food {
    //Open Closed Principle - имплементируя интерфейс Food мы добавляем
    // классу функциональности, не изменяя его код
    private final String name = "Банан";
    private final int price = 200;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void eat() {
        System.out.println("Банан съеден");
    }
}
