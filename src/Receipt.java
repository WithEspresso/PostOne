import java.util.ArrayList;

/*
* I'm assuming Time will come as a String from the following code:
* DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
* Date date = new Date();
* System.out.println(dateFormat.format(date));
*
* */

public class Receipt
{
    String STORE_NAME = "Good Store";
    String ITEM = "Item";
    String TOTAL = "Total $";
    String ASCII_LINE = "-----------";
    String AMOUNT_TENDERED = "Amount Tendered: ";
    String AMOUNT_RETURNED = "Amount Returned: ";

    String customerName = "";
    ArrayList shoppingCart;
    String time = "";

    public Receipt(Customer customer)
    {

    }

    public void printReceipt()
    {

    }
}
