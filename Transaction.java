/** this class reepresents a
  * successful trade of stock.
  * 
  * @author Kethan Srinivasan
  */

public class Transaction {

  // representation of a stock
  private char StockSymbol;
  // quantity of shares
  private int NumberShares;
  // price of a stock
  private double price;
  // the stock's customer
  private Trader buyer;
  // the stock's seller
  private Trader seller;
  // the id of a specific transaction
  private int transactionNumber;
  // the transaction number counter
  private static int transactionCount = 1;
  
  /**
   * a constructor for this class.
   * @param StockSymbol the stock symbol the order is for.
   * @param numShares the number of shares the order is for.
   * @param price the price per share the order is for.
   * @param buyer the trader who bought the stock.
   * @param seller the trader who sold the stock.
   */
  public Transaction(char StockSymbol, double price,
                     int NumberShares, Trader buyer,
                     Trader seller) {
    this.StockSymbol = StockSymbol;
    this.price = price;
    this.NumberShares = NumberShares;
    this.buyer = buyer;
    this.seller = seller;
    transactionNumber = transactionCount++;
  }
  
  /** retrieval of the stock symbol*/
  public char getStockSymbol() {
    return this.StockSymbol;
  }
  
  /** retrieval of the number of shares*/
  public int getNumberShares() {
    return this.NumberShares;
  }
  
  /** retrieval of the stock price*/
  public double getPrice() {
    return this.price;
  }
  
  /** retrieval of the buyer's information*/
  public Trader getBuyer() {
    return this.buyer;
  }
  
  /** retrieval of the seller's information*/
  public Trader getSeller() {
    return this.seller;
  }
  
  /** retrieval of the transaction number */
  public int getTransactionNumber() {
    return this.transactionNumber;
  }
  
  
  
  
}
