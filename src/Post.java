import java.util.ArrayList;

public class Post
{
    private static double dollarsReceived = 0;
    private static int transactionNumber = 0;

    //Shouldn't this be an actual Queue?
    private ArrayList customersInQueue;
    private ArrayList receiptsProcessed;

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
        transactionNumber++;

        Customer customer = (Customer)customersInQueue.remove(0);
        ArrayList<Item> shoppingCart = customer.getShoppingCart();
        double currentTransactionTotal = 0;

        for(int i = 0; i < shoppingCart.size(); i++)
        {
            Item item = shoppingCart.get(0);
            currentTransactionTotal += item.getPrice() * item.getQuantity();
        }

        if(!verifyPayment(customer.getPayment(), currentTransactionTotal))
            return false;
        return true;
    }

    /*
    *
    * @param A Customer to add to this post's queue
    * @return none
    * */
    public void addCustomerToQueue(Customer customer)
    {
        this.customersInQueue.add(customer);
    }

    /*
    * Takes all of the customer's information and creates a nicely formatted receipt.
    * @param The customer being checked out.
    * @return none
    * */
    private void printReceipt(Customer customer)
    {
        Receipt receipt = new Receipt(customer);
        receipt.printReceipt();
    }

    /*
    * This function will assume that 10% of the credit card
    * payments are declined in the future.
    * @param A Payment to verify
    * @return true if the payment went through, false otherwise.
    * */
    private boolean verifyPayment(Payment payment, double total)
    {
        return true;
    }

    /*
    * @param none
    * @return The total dollars processed through this post.
    * */
    public static double getDollarsReceived()
    {
        return dollarsReceived;
    }
}
