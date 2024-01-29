/**
 * OnlineOrderingAdapter
 */
public class OnlineOrderingAdapter implements OnlineOrdering {

    private ReserveAndPickup RandP;
    
    public OnlineOrderingAdapter(ReserveAndPickup reserveAndPickup) {
        this.RandP = reserveAndPickup;
    }
    
    public boolean checkAvailability(String productId, String zipCode) {
        // Map the zip code to a store ID (for simplicity, we assume all products are available in all stores)
        String storeId = zipCodeToStoreId(zipCode);
        // Check availability using the ReserveAndPickup interface
        return RandP.checkAvailability(productId, storeId);
    }
    
    public void placeOrder(String productId, String zipCode) {
        // Map the zip code to a store ID
        String storeId = zipCodeToStoreId(zipCode);
        // Reserve the product using the ReserveAndPickup interface
        RandP.reserveProduct(productId, storeId);
        System.out.println("Placed online order for product " + productId + " with pickup at store " + storeId);
    }
    
    private String zipCodeToStoreId(String zipCode) {
        // For simplicity, we just use the zip code as the store ID
        return zipCode;
    }
}
