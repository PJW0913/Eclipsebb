package programmers_level1;

public class SquareRoot {
	public long solution(long n) {
        long answer = 0;
        int x = 1;
        
        while(n != Math.pow(x, 2)) {
        	if(n == Math.pow(x, 2)) {
        		answer = (long) Math.pow(x+1, 2);
        		break;
        	}
        	x++;
        	if(x == n) {
        		break;
        	}
        }
        return answer;
    }
}
