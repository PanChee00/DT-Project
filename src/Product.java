class Product {
    private int productid;
    private String productname,producttype,price;
    
    public Product(int productid,String productname,String producttype,String price){
        this.productid = productid;
        this.productname = productname;
        this.producttype = producttype;
        this.price = price;
    }
    public int getProductid(){
        return productid;
    }
    public String getProductname(){
        return productname;
    }
    public String getProductType(){
        return producttype;
    }
    public String getPrice(){
        return price;
    }
}