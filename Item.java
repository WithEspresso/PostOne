

    public class Item
    {
        private String upc;
        private String description;
        private double price;
        private int quantity;

        /*  public Item(String upc, String description, double price, int quantity)
          {
              this.upc = upc;
              this.description = description;
              this.price = price;
              this.quantity = quantity;
          }
  */
        public Item(String upc, String description, double price) {
            this.setUpc(upc);
            this.setDescription(description);
            //this.setQunatity(quantity);
            this.setPrice(price);
        }
        public String getUpc()
        {
            return this.upc;
        }

        public void setUpc(String upc) {
            this.upc = upc;
        }

        public String getDescription()
        {
            return description;
        }

        public double getPrice()
        {
            return this.price;
        }

        public int getQuantity()
        {
            return this.quantity;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public double getCostOfItems()
        {
            return this.quantity * this.price;
        }



        public void setQunatity(int qunatity) {
            this.quantity = qunatity;
        }

        public void setPrice(double price) {
            this.price = price;
        }
    }
    

