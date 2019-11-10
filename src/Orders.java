public class Orders {
    private String customer;
    private String product;
    
    public Orders(String customer,String product){
        this.customer = customer;
        this.product = product;
    }
    
    public String getCustomer(){
        return customer;
    }
    
    public String getProduct(){
        return product;
    }
}
