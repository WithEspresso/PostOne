import java.util.ArrayList;

public class Customer
{
    private String name;
    private ArrayList shoppingCart;
    private Payment payment;

    public Customer()
    {
        this.shoppingCart = new ArrayList();
    }

    public String getName()
    {
        return this.name;
    }

    public ArrayList getShoppingCart()
    {
        return this.shoppingCart;
    }

    public Payment getPayment()
    {
        return this.payment;
    }
}
