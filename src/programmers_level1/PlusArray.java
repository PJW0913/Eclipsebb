package programmers_level1;

public class PlusArray {

	public long[] solution(int x, int n) {
        long[] answer = new long[n];
        answer[0] = x;
        
        for(int i = 1; i < n; i++) {
        	answer[i] = answer[i-1] + x;
        }
        
        return answer;
    }
}
