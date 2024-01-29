public interface OnlineOrdering {
    boolean checkAvailability(String productId, String zipCode);
    void placeOrder(String productId, String zipCode);
}
