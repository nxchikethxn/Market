/** A SellLimitOrder instance 
  * represents an order to sell stock.
  * 
  * @author Kethan Srinivasan
  */

public class SellLimitOrder extends Order {
  
  // detecting whether the entirety of an order is traded
  private boolean isAllOrNone;
  // detecting if this order is a day order
  private boolean isDayOrder;
  
  /** constructor for this class
    * @param trader the associated trader or market maker
    * @param StockSymbol the representation of the associated stock
    * @param NumberShares the number of shares associated with an order
    * @param price the price associated with this order
    * @param isAllOrNone checking if this order is traded in entirety
    * @param isDayOrder checks if this is a day order
    */
  public SellLimitOrder(Trader trader, char StockSymbol, 
                        int NumberShares, double price, 
                        boolean isAllOrNone, boolean isDayOrder) {
    super(trader, StockSymbol, NumberShares, price);
    this.isAllOrNone = isAllOrNone;
    this.isDayOrder = isDayOrder;
  }
  
  // returns the result of checking for the amount of shares to be traded
   @Override
  public boolean isAllOrNone() {
    return isAllOrNone;
  }
  
  // returns the result of whether this is a day order 
  @Override
  public boolean isDayOrder() {
    return isDayOrder;
  }
  
}