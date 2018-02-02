public class Manager
{
    private Store store;

    public Manager()
    {
        this.store = new Store();
        store.setIsOpen(true);
    }

    public void setInventory()
    {
        //TODO Implement way to read textfile into store inventory
    }

    private void openStore(boolean isOpen)
    {
        this.store.setIsOpen(isOpen);
    }

    public boolean isOpen()
    {
        return store.isOpen();
    }
}
