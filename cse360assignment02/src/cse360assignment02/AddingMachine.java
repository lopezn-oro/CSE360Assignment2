package cse360assignment02;

public class AddingMachine {
  private int total;
  private String history;
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    history= "0";
  }
  
  public int getTotal () {
	  return total;
  }
  
  public void add (int value) {
	  total = total+value;
	  history += " + " + value;
  }

  public void subtract (int value) {
	  total = total-value;
	  history += " - " + value;
  }

  public String toString () {
    return history;
  }
 

  public void clear() {
  }

  
public static void main(String[] args) {
    
AddingMachine myAddingMachine= new AddingMachine();
 
myAddingMachine.add(4);
 
myAddingMachine.subtract(2);
 
myAddingMachine.add(5);
 
    System.out.println(myAddingMachine.toString());
     
    System.out.println("Total is: "+myAddingMachine.getTotal());
}

}

