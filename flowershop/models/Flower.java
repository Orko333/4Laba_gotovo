package flowershop.models;

public abstract class Flower {
    private double price;
    private int freshness;
    private int stemLength;

    public Flower(double price, int freshness, int stemLength) {
        this.price = price;
        this.freshness = freshness;
        this.stemLength = stemLength;
    }

    public double getPrice() { return price; }
    public int getFreshness() { return freshness; }
    public int getStemLength() { return stemLength; }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " (Ціна: " + price + ", Свіжість: " + freshness + ", Довжина стебла: " + stemLength + ")";
    }
}
