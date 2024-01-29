/**
 * BestBuyReserveAndPickup
 */
public class BestBuyReserveAndPickup implements ReserveAndPickup {
    
    public boolean checkAvailability(String productId, String storeId) {
        // Always return true for simplicity
        return true;
    }
    
    public void reserveProduct(String productId, String storeId) {
        
        if(checkAvailability(productId, storeId)){
            System.out.println("Reserved product " + productId + " at store " + storeId);
        }
        else{
            System.out.println("Failed to reserve product. Product unavailable.");
        }

    }
}