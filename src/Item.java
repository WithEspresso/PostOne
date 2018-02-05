public class Item
{
    private String upc;
    private String description;
    private double price;
    int quantity;

    public Item(String upc, String description, double price, int quantity)
    {
        this.upc = upc;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    public String getUpc()
    {
        return this.upc;
    }

    public String getDescription()
    {
        return description;
    }

    public double getPrice()
    {
        return this.price;
    }

    public int getQuantity()
    {
        return this.quantity;
    }

    public double getCostOfItems()
    {
        return this.quantity * this.price;
    }

    @Override
    public String toString()
    {
        return (this.description + " @ " + this.quantity + " $" + this.price);
    }

}
