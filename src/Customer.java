class Customer {
    private int customerid;
    private String customername,address,phone;
    
    public Customer(int customerid,String customername,String address,String phone){
        this.customerid = customerid;
        this.customername = customername;
        this.address = address;
        this.phone = phone;
    }
    public Customer(String customername,String address,String phone){
        
        this.customername = customername;
        this.address = address;
        this.phone = phone;
    }
    
    public int getCustomerId(){
        return customerid;
    }
    public String getCustomerName(){
        return customername;
    }
    public String getAddress(){
        return address;
    }
    public String getPhone(){
        return phone;
    }
}
