
public class Banana extends Product implements Food {
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
