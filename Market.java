/** The Market type represents a 
  * market for a stock. The Market 
  * maintains all the buy and sell 
  * orders for a stock.
  * 
  * @author Kethan Srinivasan
  */

public class Market {
  
  // representation of a stock
  private char StockSymbol = ' ';
  // LLNode assosciated with sell orders
  private LLNode<SellLimitOrder> sellOrders;
  // LLNode associated with buy orders
  private LLNode<BuyLimitOrder> buyOrders;
  // all open orders associated with a trader
  private LLNode<Order> openOrders;
  
  // new instance of a market maker for the stock
  public static MarketMaker marketMaker = new MarketMaker(" ", 0, 0.0);
  
  //new instance of a buy limit order
  public static BuyLimitOrder buyLimitOrder = new BuyLimitOrder(marketMaker, ' ', 0, 0.0, true, true);
  // new instance of a sell limit order
  public static SellLimitOrder sellLimitOrder = new SellLimitOrder(marketMaker, ' ', 0, 0.0, true, true);

  /** a constructor that sets up a new Market instance
    * @param StockSymbol an identifier for a particular stock
    */
  public Market(char StockSymbol) {
    this.StockSymbol = StockSymbol;
  }
  
  // retrieval of the stock symbol
  public char getStockSymbol() {
    return this.StockSymbol;
  }
  
  // retrieval of the associated sell order
  public LLNode<SellLimitOrder> getSellOrders() {
    return this.sellOrders;
  }
  
  // retrieval of the associated buy orders
  public LLNode<BuyLimitOrder> getBuyOrders() {
    return this.buyOrders;
  }
  
  // retrieval of all open orders associated with a trader
  public LLNode<Order> getOpenOrders() {
    return this.openOrders;
  }
  
  // retrieval of the price assigned to the buy order
  public double getCurrentBuyOrders() {
    return buyLimitOrder.getPrice();
  }
  
  // retrieval of the price assigned to the sell order
  public double getCurrentSellOrders() {
    return sellLimitOrder.getPrice();
  }
  
  public boolean isOpen() {
    return true;
  }
  
  public boolean isValidOrder() {
    return true;
  }
  
  
  
  
}

