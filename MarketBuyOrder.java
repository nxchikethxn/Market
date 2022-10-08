/** A MarketBuyOrder instance represents 
  * an order to buy stock that is placed 
  * by a market maker in order to create 
  * a market for the stock.
  * 
  * @author Kethan Srinivasan
  */

public class MarketBuyOrder extends BuyLimitOrder {
 
  // this order cannot be traded in entirety
  private boolean isAllOrNone = false;
  // this is definitely a day order
  private boolean isDayOrder = true;
  
  /** constructor for this class
    * @param trader the associated trader or market maker
    * @param StockSymbol the representation of the associated stock
    * @param NumberShares the number of shares associated with an order
    * @param price the price associated with this order
    * @param isAllOrNone checking if this order is traded in entirety
    * @param isDayOrder checks if this is a day order
    */
  public MarketBuyOrder(Trader trader, char StockSymbol, 
                        int NumberShares, double price, 
                        boolean isAllOrNone, boolean isDayOrder) {
    super(trader, StockSymbol, NumberShares, price, isAllOrNone, isDayOrder);
  }
  
  
  
}