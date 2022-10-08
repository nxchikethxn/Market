/** a class that represents a trader who
  * guarantees that there is a market for
  * a particular stock. Must maintain both 
  * a buy and a sell order for the stock 
  * whenever the market is open.
  * 
  * @author Kethan Srinivasan
  */

public class MarketMaker extends Trader {
  
  // default size for a market order by this maker
  private int defaultOrderSize;
  // price offset marked by this maker
  private double priceOffset;
  
  /** constructor for this class
    * @param name the name of this market maker
    * @param defaultOrderSize the default size of a market order
    * @param priceOffset the price offset marked by this market maker
    */
  public MarketMaker(String name, int defaultOrderSize, double priceOffset) {
    super(name);
    this.defaultOrderSize = defaultOrderSize;
    this.priceOffset = priceOffset;
  }
  
  // retrieval of the default order size
  public int getDefaultOrderSize() {
    return this.defaultOrderSize;
  }
  
  /** resetting of a default order size by another value
    * @param newDOS a new default order size
    * @result a new default order size
    */
  public void setDefaultOrderSize(int newDOS) {
    this.defaultOrderSize = newDOS;
  }
  
  // retrieval of the price offset
  public double getPriceOffset() {
    return this.priceOffset;
  }
  
  /** resetting of a price offset by another value
    * @param newPO a new price offset
    * @result a new price offset
    */
  public void setPriceOffset(double newPO) {
    this.priceOffset = newPO;
  }
  
  
}