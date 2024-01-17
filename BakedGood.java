
/**
 * Represents a single baked good in our bakery's inventory
 *
 */
public class BakedGood
{
    // instance variables
    private String name;
    private String recipe;
    private double itemPrice;
    private int quantity;

    /**
     * Constructor for objects of class BakedGood
     */
    public BakedGood(String name, String recipe, double price, int quantity)
    {
        // initialise instance variables
        this.name = name;
        this.recipe = recipe;
        this.itemPrice = price;
        this.quantity = quantity;
    }

    public void increaseQuantity(int count) {
        this.quantity += count;
    }
    
    // instance method to buy some baked goods
    // takes in an argument, count, for how many of the baked good we are purchasing
    public double purchase(int count) {
        if (count > this.quantity) {
            throw new IllegalArgumentException("you cannot buy more than our current inventory");
        }
        this.quantity -= count;
        return this.itemPrice * count;
    }

    public String toString() {
        return "baked good: " + this.name + " (" + this.quantity + " @ $" + this.itemPrice + ")";
    }
    public static void main(String[] args) {
        BakedGood croissant = new BakedGood("croissant", "butter, flour, laminate, yum", 20.0, 0);
        // bake a dozen croissants
        croissant.increaseQuantity(12);
        System.out.println(croissant);
        System.out.println(croissant.purchase(3));
        System.out.println(croissant);
        // purchasing too many should throw the error
        croissant.purchase(10);
        // bake 3 more croissants with the leftover dough
        // croissant.increaseQuantity(3);
        // System.out.println(croissant);
        
    }
}
