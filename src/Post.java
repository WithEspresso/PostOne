import java.util.ArrayList;

public class Post
{
    private static double dollarsReceived = 0;
    private static int transactionNumber = 0;

    //Shouldn't this be an actual Queue?
    private ArrayList<> customersInQueue;

    public Post()
    {
        customersInQueue = new ArrayList();
    }

    /*
    * Gets the customer's shopping cart, gets the sum of the items in the shopping cart,
    * creates a receipt with this information, updates the total dollars received.
    * removes customer from queue.
    *
    * @param    Customer to check out
    * @return   True if check out successful, false if authorization failed.
    * */
    public boolean processCustomer()
    {
        if(customersInQueue.size() == 0)
            return false;
        this.transactionNumber++;

        Customer customer = (Customer)customersInQueue.remove(0);
        ArrayList<Item> shoppingCart = customer.getShoppingCart();
        for(int i = 0; i < shoppingCart.size(); i++)
        {
            shoppingCart.get(i).getPrice();
        }
    }

    /*
    *
    * @param
    * */
    public void addCustomerToQueue(Customer customer)
    {
        this.customersInQueue.add(customer);
    }

    public void printReceipt()
    {
        //TODO Print the receipts of all of the customers
    }

    private void makeReceipt(customer)
    {

    }

    public double getDollarsReceived()
    {
        return dollarsReceived;
    }
}
