public class EBook
{
    private String title;
    private double price;
    private int discount;
    private static final int DEFAULT_DISCOUNT = 0;

    /**
     * Constructor for objects of class EBook
     */
    public EBook(String title, double price){
        this(title, price, DEFAULT_DISCOUNT);
    }

    public EBook(String title, double price, int discount){
      this.title = title;
      this.price = price;
      setDiscount(discount);
    }
    
    public void setDiscount(int discount){
        this.discount = discount;
    }
    
    public String getTitle(){
        return title;
    }
    
    public double getPrice(){
        return price;
    }
    
    public double getDiscountedPrice(){
        return price*(1-discount/100);
    }
}
