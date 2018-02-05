public class CreditPayment extends Payment
{
    //Assume 10% of credit paymnets will fail verification.
    //Unsure if this should be implemented now.
    public CreditPayment(double amountDue)
    {
        super(amountDue);
    }

    @Override
    public void makePayment(double amountPaid)
    {
        //TODO Implement credit payment method
    }
}
