public class Main {
    public static void main(String[] args) {
        ReserveAndPickup reserveAndPickup = new BestBuyReserveAndPickup();
        OnlineOrdering onlineOrdering = new OnlineOrderingAdapter(reserveAndPickup);
        
        // Simulate a customer checking availability and placing an order
        String [] productId = new String[] {"0001","0002","0003","0004","0005","0006"};
        String [] zipCode = new String[] {"23047","23054","23099","23032","22347","20987"};
        
        for (int i = 0; i < zipCode.length; i++) {

            if (onlineOrdering.checkAvailability(productId[i], zipCode[i])) {
                onlineOrdering.placeOrder(productId[i], zipCode[i]);
            } else {
                System.out.println("Product " + productId + "is not available for online ordering in ZIP code" + zipCode);
            }

        }

    }
}