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
				  System.out.println("eqauls true 실행");
				  return true;
			  }
		  }
		  System.out.println("equals false 실행");
		  return false;
	  }
	  
	  @Override
	  public int hashCode() {
		  System.out.println("hasCode 실행");
		  return number;
	  }
}
