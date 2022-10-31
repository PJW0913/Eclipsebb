package programmers_level1;

public class HateEvenNumber {
	
	public int[] solution(int n) {
		int count=0;
		int[] answer = new int[count];
        
        for(int i = 1; i <= n; i++) {
        	if(i%2 != 0) {
        		answer[count] = i;
        		count++;
        	}
        }
        return answer;
    }
}
