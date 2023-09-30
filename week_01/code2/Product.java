//class name = file name

public class Product{
    private int id;
    private String name;
    private double price;
    private int quantity;
    static int counter;
    private Date mafDate;
    

    // constructor:

    Product(String name, double price,int quantity,Date mafDate){
        this.id = ++this.counter;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.mafDate = mafDate;
    }

    //setters:

    public void setName (String name){
        this.name = name;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
    
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    
    public void setDate(Date mafDate){
        this.mafDate = mafDate;
    }

    //getters: 

    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public double getPrice(){
        return this.price;
    }
    public int getQuantity(){
        return this.quantity;
    }
    public Date getDate(){
        return this.mafDate;
    }
   
    public String toString(){
        String productDetails = String.format("%04d\t%-20s%,.2f\t%d\t%s",id,name,price,quantity, this.mafDate.toString());
        return productDetails;
    }

    public Product recentProduct(Product obj1,Product obj2){
        Date temp = mafDate.checkRecent(obj1.getDate(),obj2.getDate());
       return temp == obj1.getDate()  ?  obj1 : obj2;
    } 
}