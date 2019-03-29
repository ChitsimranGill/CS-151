package hw4;
/**
   A product with a price and description.
*/
public class Product implements LineItem
{
   /**
      Constructs a product.
      @param description the description
      @param price the price
   */
   public Product(String description, double price)
   {
      this.description = description;
      this.price = price;
   }
   public double getPrice() { return price; }
   public String toString() { return description; }
   public double ChangePrice(double x)
   {
	   return price = x;
   }
   public String ChangeString(String s)
   {
	  return description = s;
   }
   private String description;
   private double price;
}
