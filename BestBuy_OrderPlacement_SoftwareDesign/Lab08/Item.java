/**
 * Item
 */
public class Item {

    //fields-----------------------------------------------------------------
    private final int itemID;
    private final String itemSpecs;
    private final int itemPrice;


    //constructor-----------------------------------------------------------------
    public Item(int itemID, String itemSpecs, int itemPrice) {
        this.itemID = itemID;
        this.itemSpecs = itemSpecs;
        this.itemPrice = itemPrice;
    }

    
    //getters-----------------------------------------------------------------
    public int getItemID() {
        return itemID;
    }
    public String getItemSpecs() {
        return itemSpecs;
    }
    public int getItemPrice() {
        return itemPrice;
    }


}