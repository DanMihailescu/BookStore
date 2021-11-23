
/**
 * 
 */
public class PreferredAccountHolder extends AccountHolder
{
    // instance variables - replace the example below with your own
    private static final int DISCOUNT_THRESHOLD = 5;
    private int extraDiscount;

    /**
     * Constructor for objects of class PreferredAccountHolder
     */
    public PreferredAccountHolder(String name, int accNum, int extraDiscount)
    {
        super(name, accNum);
        setExtraDiscount(extraDiscount);
    }

    public double totalPurchasePrice()
    {
        double subTotal = super.totalPurchasePrice();
        if(sizeOfCart() > DISCOUNT_THRESHOLD) 
            return subTotal*(1-extraDiscount/100);
        return subTotal;
    }
    
    public void setExtraDiscount(int discount)
    {
        this.extraDiscount = discount;
    }
}
