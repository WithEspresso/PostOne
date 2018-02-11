import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map.Entry;

public class Store
{

    //private boolean StoreOpen = false;
    private static BufferedReader bufferedReader;
    private static String filePath = "products.txt";
    private static HashMap<String, Item> items;
    private String sname;
    private String saddress;
    public final static String STORENAME = "GoodStore";
    public final static String STOREADDRESS = "1600 Holloway Ave, San Francisco";
    
    public static HashMap<String, Item> getItems() {
        if (items == null) {
            readProducts();
        }
        return items;
    }

    public Store() {
        this.sname = STORENAME;
        this.saddress = STOREADDRESS;

    }
    private static boolean readProducts() {
        try {
            bufferedReader = new BufferedReader(new FileReader(filePath));
            items = new HashMap<String, Item>();
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
            return false;
        }

        String line = " ";
        while (line != null) {
            try {
                line = bufferedReader.readLine();

                if (line != null) {
                    String[] tokens = new String[3];
                    tokens[0] = line.substring(0, 4);
                    tokens[1] = line.substring(9, 29);
                    tokens[2] = line.substring(34);

                    items.put(tokens[0], new Item(tokens[0], tokens[1], Double.parseDouble(tokens[3])));
                }

            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        return true;
    }



        public static void main(String[] args) {
            Post post = new Post();




            }
        }











