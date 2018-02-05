import java.util.ArrayList;
import java.io.*;
import java.util.HashMap;

public class Manager
{
    int StoreNumber = 0;
    ArrayList<String> storeName = new ArrayList<>();
    private Store store;
    HashMap<Integer,String> inventoryMap = new HashMap<>();

    public Manager()
    {
        this.store = new Store();
        store.setIsOpen(true);
    }
    public String GetStoreInfo(int storeNumber) {
      String name = storeName.get(storeNumber);
      return name;
    }

    public void setInventory () throws IOException
    {


      FileReader freader = new FileReader("src/inventory.txt");
      BufferedReader br = new BufferedReader(freader);
      String s;
      while((s = br.readLine()) != null) {
        String[] line = s.split("\\s+");
        int key = Integer.parseInt(line[0]);
        String value = line[1]+" "+line[2];
        inventoryMap.put(key,value);

      }
      freader.close();
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
