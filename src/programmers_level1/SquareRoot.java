package programmers_level1;

public class SquareRoot {
	public long solution(long n) {
        long answer = 0;
        
        for(int i =1; i < n; i++ ) {
        	if((int)Math.pow(i, 2) == n) {
        		answer = (int)Math.pow(i+1, 2);
        		break;
        	}else {
        		answer = -1;        		
        	}
        }
        return answer;
    }
}
