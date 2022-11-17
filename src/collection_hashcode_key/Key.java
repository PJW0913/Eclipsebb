package collection_hashcode_key;

public class Key {

	public int number;
	  public Key(int number) {
		  this.number = number;
	  }
	  
	  @Override
	  public boolean equals(Object obj) {
		  if(obj instanceof Key) {
			  Key compareKey = (Key)obj;
			  if(this.number == compareKey.number) {
				  System.out.println("eqauls true ½ÇÇà");
				  return true;
			  }
		  }
		  System.out.println("equals false ½ÇÇà");
		  return false;
	  }
	  
	  @Override
	  public int hashCode() {
		  System.out.println("hasCode ½ÇÇà");
		  return number;
	  }
}