import java.util.HashMap;

public class Store
{
    private HashMap inventory;
    private boolean isOpen;
    int registersOn = 0;
    double todaysRevenue = 0;

    public Store()
    {
        inventory = new HashMap();
    }

    public String getInventory(String key)
    {
        return (String)this.inventory.get(key);
    }

    public void readFromFile()
    {
        //TODO Implement way to read from file.
    }

    public void setIsOpen(boolean isOpen)
    {
        this.isOpen = isOpen;
    }

    public boolean isOpen()
    {
        return this.isOpen;
    }
}
