
public class Product {
    private final String name;

    private Integer cost;

    public String getName() {
        return name;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Product(String name, Integer cost) {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, cost: %d rub", name, cost);

    }
}

