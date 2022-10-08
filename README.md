# Market
A repository containing files from a class project.
This repository contians the following classes:

1. Trader: The Trader represents an entity that is allowed to trade stocks. The Trader has the following methods:

a. getName: Takes no input and returns a String. Returns the name of the trader.
b. setName: Takes a single String as input and returns nothing. The name of the trader is changed to the input value.

2. MarketMaker: A MarketMaker is a trader that guarantees that there is a market for a particular stock. The MarketMaker is required to maintain both a buy and a sell order for the stock whenever the market is open. (There is a "market" for a stock if there is always someone willing to buy and someone willing to sell the stock.) The MarketMaker has the following methods:

a. getName: Takes no input and returns a String. Returns the name of the market maker.
b. setName: Takes a single String as input and returns nothing. The name of the market maker is changed to the input value.
c. getDefaultOrderSize: Takes no input and returns an int that is the default size for a market order by this market maker.
d. setDefaultOrderSize: Takes an int as input and returns nothing. Changes the default size for a market order by this market maker.
e. getPriceOffset: takes no input and returns a double. Returns the price offset for this market maker.
f. setPriceOffset: takes a double as input and returns nothing. Returns the price offset for this market maker.

3. BuyLimitOrder: A BuyLimitOrder represents a request to purchase a stock. The BuyLimitOrder has the following methods:

a. getStockSymbol: takes no input and returns a char. Returns the single character symbol of the stock that this order is for. (Stock symbols are typically strings but for this assignment we will use only one character initials for the stocks.)
b. getNumberShares: Takes no input and returns an int. Returns the number of shares of the order.
c. setNumberShares: Takes a single int value as input and returns nothing. The input value is the number of shares of the order.
d. getPrice: Takes no input and returns a double. Returns the desired price per share of the order.
e. isAllOrNone: Takes no input and returns a boolean. The method returns true if we must trade all the shares of the order. The method returns false if we can trade some, but not all, of the shares of the order.
f. isDayOrder: Takes no input and returns a boolean. If the order is a day order, then it will expire when the market closes. If the order is not a day order, then it will remain even when the market is closed.
g. getTrader: Takes no input and returns a trader or market maker value. The method returns the trader or market maker that placed this order.

4. SellLimitOrder: A SellLimitOrder instance represents an order to sell stock. The SellOrder has the following methods:

a. getStockSymbol: takes no input and returns a char. Returns the single character symbol of the stock that this sell order is for.
b. getNumberShares: Takes no input and returns an int. Returns the number of shares of the order.
c. setNumberShares: Takes a single int value as input and returns nothing. The input value is the number of shares of the order.
d. getPrice: Takes no input and returns a double. Returns the desired price per share of the order.
e. isAllOrNone: Takes no input and returns a boolean. The method returns true if we must trade all the shares of the order. The method returns false if we can trade some, but not all, of the shares of the order.
f. isDayOrder: Takes no input and returns a boolean. If the order is a day order, then it will expire when the market closes. If the order is not a day order, then it will remain even when the market is closed.
g. getTrader: Takes no input and returns a trader or market maker value. The method returns the trader or market maker that placed this order.

5. MarketBuyOrder: A MarketBuyOrder instance represents an order to buy stock that is placed by a market maker in order to create a market for the stock. The MarketBuyOrder has the following methods:

a. getStockSymbol: takes no input and returns a char. Returns the single character symbol of the stock that this buy order is for.
b. getNumberShares: Takes no input and returns an int. Returns the number of shares of the order.
c. setNumberShares: Takes a single int value as input and returns nothing. The input value is the number of shares of the order.
d. getPrice: Takes no input and returns a double. Returns the desired price per share of the order.
e. getTrader: Takes no input and returns the market maker that placed this order.

6. MarketSellOrder: A MarketSellOrder instance represents an order to sell stock that is placed by a market maker in order to create a market for the stock. The MarketSellOrder has the following methods:

a. getStockSymbol: takes no input and returns a char. Returns the single character symbol of the stock that this sell order is for.
b. getNumberShares: Takes no input and returns an int. Returns the number of shares of the order.
c. setNumberShares: Takes a single int value as input and returns nothing. The input value is the number of shares of the order.
d. getPrice: Takes no input and returns a double. Returns the desired price per share of the order.
e. getTrader: Takes no input and returns the market maker that placed this order.

7. Transaction: A Transaction represents the successful trade of stock. The Transaction has the following methods:

a. getStockSymbol: Takes no input and returns a char. Returns the single character symbol of the stock that this trade transaction is for.
b. getNumberShares: Takes no input and returns an int. Returns the number of shares of this trade transaction.
c. getPrice: Takes no input and returns a double. Returns the price per share this of this trade transaction.
d. getBuyer: Takes no input and returns the trader or market maker that purchasing the stock.
e. getSeller: Takes no input and returns the trader or market maker that is selling the stock.
f. getTransactionNumber: Takes no input and returns the number of this transaction. Each transaction should have a unique number, and the numbers should be such that if one transaction occurs before another, the earlier transaction should have a smaller number.

8. Market: The Market type represents a market for a stock. The Market maintains all the buy and sell orders for a stock. The buy and sell orders should be organized as lists of LLNodes, and the lists should be ordered by price. The buy orders should be from highest to lowest, and the sell orders should be from lowest to highest. The Market should has following methods:

a. getStockSymbol: takes no input and returns a char. Returns the stock symbol that this market is for.
b. getSellOrders: Takes no input and returns a list of LLNode containing all the sell orders in the market.
c. getBuyOrders: Takes no input and returns a list of LLNodes containing all the buy orders in the market.
d. getOpenOrders: Takes a trader or market maker as input and returns a list of LLNodes containing all the buy and sell orders for that trader or market maker that is in the market.
e. getCurrentBuyPrice: Takes no input and returns a double. Returns the highest price of a buy order in the market that is not an "all or nothing" order.
f. getCurrentSellPrice: Takes no input and returns a double. Returns the lowest price of a sell order in the market that is not an "all or nothing" order.
g. isOpen: Takes no input and returns a boolean. Returns true if market contains both a MarketBuyOrder and a MarketSellOrder. Returns false otherwise.
h. isValidOrder: Takes an order and returns a boolean. The method returns true if this is a valid order for the market. For an order to be valid, it must be for the same stock symbol as the market. In addition, if the order is a buy order and not a market buy order, the price of the order must not be higher than the highest market sell order, and if the order is a sell order and not a market sell order, the price must not be lower than the lowest market buy order in the market.


