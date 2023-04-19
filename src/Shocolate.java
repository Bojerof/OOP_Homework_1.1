public class Shocolate extends Product{

    private final String view;
    public Shocolate(String name, Integer cost, String view) {
        super(name, cost);
        this.view = view;
    }

    @Override
    public String toString() {
        return super.toString() + ", view: " + view;
    }
}
