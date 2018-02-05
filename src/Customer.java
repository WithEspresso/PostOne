import java.util.ArrayList;

public class Customer
{
    private ArrayList shoppingCart;
    private Payment payment;

    public Customer()
    {
        this.shoppingCart = new ArrayList();
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
