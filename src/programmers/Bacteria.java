package programmers;

public class Bacteria {

	public int solution(int n, int t) {
        int answer = n;
       
        for(int i = 0; i < t; i++) {
        	answer *= 2;
        }
        
        return answer;
    }
}
