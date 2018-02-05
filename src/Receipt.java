import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/*
* I'm assuming Time will come as a String from the following code:
* DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
* Date date = new Date();
* System.out.println(dateFormat.format(date));
*
* */

public class Receipt
{
    private final String STORE_NAME = "Good Store";
    private final String ITEM = "Item: ";
    private final String TOTAL = "Total $";
    private final String ASCII_LINE = "-----------";

    private String customerName = "";
    private ArrayList shoppingCart;
    private String time = "";
    private Payment payment;

    public Receipt(Customer customer)
    {
        this.customerName = customer.getName();
        this.shoppingCart = customer.getShoppingCart();
        this.time = getTime();
        this.payment = customer.getPayment();
    }

    /* Gets the current time and date and converts it into a string.
    * @param none
    * @return The current time and date in a string format.
    * */
    private String getTime()
    {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        return(dateFormat.format(date));
    }

    /*
    *
    * */
    public void printReceipt()
    {
        double subtotal = 0;
        System.out.println(STORE_NAME + "\n");
        System.out.println(customerName + "\t" + time);
        for(int i = 0; i < shoppingCart.size(); i++)
        {
            Item item = (Item)shoppingCart.get(i);
            subtotal += item.getCostOfItems();
            System.out.println(ITEM + item + " " + subtotal);
        }
        System.out.println(ASCII_LINE);
        System.out.println(TOTAL + subtotal);
        System.out.println(payment);
    }
}
