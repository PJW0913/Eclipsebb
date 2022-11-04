package programmers_level1;

public class SquareRoot {
	public long solution(long n) {
        long answer = 0;
        int x = 1;
        
        while(n >= x) {
        	if(n == Math.pow(x, 2)) {
        		answer = (long) Math.pow(x+1, 2);
        		break;
        	}
        	if(Math.pow(x, 2) > n) {
        		answer=-1;
        		break;
        	}
        	x++;
        }
        return answer;
    }
}
