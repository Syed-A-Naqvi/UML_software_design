/**
 * Customer
 */
public class Customer {


    //fields----------------------------------------------------------------
    private final int CustomerID;
    private final String email;
    private Order order;


    //constructor----------------------------------------------------------------
    public Customer(int Id, String email) {
        this.CustomerID = Id;
        this.email = email;
    }


    //getters----------------------------------------------------------------
    public int getCustomerID() {
        return CustomerID;
    }
    public String getEmail() {
        return email;
    }
    public Order getOrder() {
        return order;
    }


    //setters----------------------------------------------------------------
    public void setOrder(int Id) {
        
        Order order = new Order();

        //Retrieve order information from store website based on customer ID
        //..................
        this.order = order;

    }
     

}