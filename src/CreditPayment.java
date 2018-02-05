public class CreditPayment extends Payment
{
    //Assume 10% of credit paymnets will fail verification.
    //Unsure if this should be implemented now.
    private String creditCardNumber;

    public CreditPayment(double amountDue, String creditCardNumber)
    {
        super(amountDue);
        this.creditCardNumber = creditCardNumber;
    }

    @Override
    public void makePayment(double amountPaid)
    {
        //TODO Implement credit payment method
    }

    @Override
    public String toString()
    {
        return ("Credit Card" + creditCardNumber);
    }
}
