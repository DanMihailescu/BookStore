import java.util.*;
public class AccountHolder
{
    private String name; 
    private int accountNumber;
    private ArrayList<EBook> shoppingCart;
    
    public AccountHolder(String name, int accNum)
    {
        this.name = name;
        this.accountNumber = accNum;
        shoppingCart = new ArrayList<EBook>();
    }
    
    public void emptyShoppingCart()
    {
        shoppingCart.clear();
    }
    
    public void addEbook(EBook book){
        for(int i = shoppingCart.size(); i > 0; i--){
            if(book.getTitle().equals(shoppingCart.get(i).getTitle())){
                shoppingCart.remove(i);     //Both can be replaced with .set(i, book)
                shoppingCart.add(book);
                return;
            }
        }
    }
    
    public int sizeOfCart(){
        return shoppingCart.size();
    }
    
    public double totalPurchasePrice(){
        double total = 0.0;
        for(EBook b : shoppingCart){
            total += b.getDiscountedPrice();
        }
        return total;
    }
}
