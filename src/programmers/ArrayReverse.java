package programmers;

public class ArrayReverse {

	public int[] solution(int[] num_list) {
        int[] reverse = new int[num_list.length];
        
        for(int i = 0; i < num_list.length; i++) {
        	if(num_list.length-i < 0) {
        		break;
        	}
        	reverse[i] = num_list[num_list.length-1-i];
        }
        for(int i = 0; i < num_list.length; i++) {
        	System.out.print(reverse[i]);
        }
        
        return reverse;
    }
}
