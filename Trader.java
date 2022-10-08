/** a class that represents 
  * an entity who can trade stocks.
  * @author Kethan Srinivasan
  * */

public class Trader {
  
  // an entity's given name
  private String name;
  
  /** the creation of a trader entity
    * @param name trader's name
    * */
  public Trader(String name) {
    this.name = name;
  }
  
  /** retrival of a trader's name
    * @return the trader's name
    * */
  public String getName() {
    return name;
  }
  
  /** resetting a trader's name
    * @param newName the trader's new name
    * */
  public void setName(String newName) {
    this.name = newName;
  }
  
}