package cse360assignment02;

public class AddingMachine {
  private int total;
  private String history;
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    history = "0 ";
  }
  /*
   * Returns the value of variable total. 
   * @return the value of total
   */
  public int getTotal () {
    return total;
  }
  /*
   * Adds a value to the variable total.
   * @param value the value to be added to total.
   */
  public void add (int value) {
	  total = total + value;
	  history = history + "+ " + value + " ";
  }
  /*
   * Subtracts a value to the variable total.
   * @param value the value to be subtracted total.
   */
  public void subtract (int value) {
	  total = total - value;
	  history = history + "- " + value + " ";
  }
  /*
   * Returns the variable history.
   * @return history
   */
  public String toString () {
    return history;
  }
  /*
   * Sets variables total and history back to default values.
   */
  public void clear() {
	  total = 0;
	  history = "0 ";
  }
}
