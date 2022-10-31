package programmers_level0;

public class Duplication {

	public int solution(int[] array, int n) {
		
		int count = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i] == n) {
				count++;
			}
		}
		return count;
	}
}
