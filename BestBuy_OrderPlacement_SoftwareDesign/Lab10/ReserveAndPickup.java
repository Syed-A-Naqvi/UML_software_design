public interface ReserveAndPickup {
    boolean checkAvailability(String productId, String storeId);
    void reserveProduct(String productId, String storeId);
}