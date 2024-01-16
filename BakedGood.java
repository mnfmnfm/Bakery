
/**
 * Represents a single baked good in our bakery's inventory
 *
 */
public class BakedGood
{
    // instance variables
    private String name;
    private String recipe;
    private double price;
    private int quantity;

    /**
     * Constructor for objects of class BakedGood
     */
    public BakedGood(String name, String recipe, double price, int quantity)
    {
        // initialise instance variables
        this.name = name;
        this.recipe = recipe;
        this.price = price;
        this.quantity = quantity;
    }

    public void increaseQuantity(int count) {
        this.quantity += count;
    }

    public String toString() {
        return "baked good: " + this.name + " (" + this.quantity + " @ $" + this.price + ")";
    }
    public static void main(String[] args) {
        BakedGood croissant = new BakedGood("croissant", "butter, flour, laminate, yum", 20.0, 0);
        // bake a dozen croissants
        croissant.increaseQuantity(12);
        System.out.println(croissant);
        // bake 3 more croissants with the leftover dough
        croissant.increaseQuantity(3);
        System.out.println(croissant);
    }
}
