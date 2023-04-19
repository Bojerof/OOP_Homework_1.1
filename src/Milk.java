public class Milk extends Product{
    private final double percent;
    public Milk(String name, Integer cost, double percent) {
        super(name, cost);
        this.percent = percent;
    }


    @Override
    public String toString() {
        return String.format("%s, %.1f%%", super.toString(), percent);
    }
}
