import java.util.ArrayList;

/**
 * Order
 */
public class Order {

    //fields--------------------------------------------------------------------
    private final int orderNumber;
    private ArrayList<Item> itemList;
    public boolean completionStatus;


    //Constructors--------------------------------------------------------------------
    public Order() {
        this.orderNumber = 0;
        this.itemList = new ArrayList<Item>();
        this.completionStatus = false;
    }

    public Order(int orderNumber) {
        this.orderNumber = orderNumber;
        this.itemList = new ArrayList<Item>();
        this.completionStatus = false;
    }


    //Getters--------------------------------------------------------------------
    public int getOrderNumber() {
        return orderNumber;
    }
    public ArrayList<Item> getItemList() {
        return itemList;
    }


    //add and remove items--------------------------------------------------------------------
    public void addItem(Item item) {
        this.itemList.add(item);
    }
    public void removeItem(Item item) {
        this.itemList.remove(item);
    }

    //return total--------------------------------------------------------------------
    public double getTotal() {
        double total = 0.0;
        for (Item item : itemList) {
            total += item.getItemPrice();
        }
        return total;
    }
    
    //complete order--------------------------------------------------------------------
    public void completeOrder() {
        this.completionStatus = true;
    }

}