public class CashPayment extends Payment
{
    /*
    * For now, cash payments will always give the correct amount of change.
    * */
    public CashPayment(double amountDue)
    {
        super(amountDue);
    }

    @Override
    public void makePayment(double amountPaid)
    {
    }
}
