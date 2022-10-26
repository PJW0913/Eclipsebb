package programmers;

import java.util.Arrays;

public class Height {

	public int solution(int[] array, int height) {
		int count = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i] > height) {
				count++;
			}
		}
		return count;
	}
	
	 public int solution1(int[] array, int height) {
	        return (int) Arrays.stream(array).filter(value -> value > height).count();
	    }
}
