public abstract class Payment
{
    private double amountDue;

    public Payment(double amountDue)
    {
        this.amountDue = amountDue;
    }

    public abstract void makePayment(double amountPaid);

    public double getAmountDue()
    {
        return this.amountDue;
    }
}
