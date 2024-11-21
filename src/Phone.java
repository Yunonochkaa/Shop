public class Phone extends Product implements Device, Mobile {

    private final String name = "Телефон";
    private final int price = 1000;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void enable() {
        System.out.println("Телефон вкл");
    }

    @Override
    public void carry() {
        System.out.println("Телефон взят с собой");
    }
}