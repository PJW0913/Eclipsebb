package programmers_level1;

public class HarshadNumber {
	public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        
        while(x != 0) {
        	sum += x%10;
        	x /= 10;
        }
        
        if(x%sum == 0) {
        	answer = true;
        }else {
        	answer = false;
        }
        return answer;
        return answer;
    }
}
