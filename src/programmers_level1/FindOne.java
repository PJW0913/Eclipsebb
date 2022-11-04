package programmers_level1;

public class FindOne {

	public int solution(int n) {
        int answer = 0;
        int x = 1;
        
        while(true) {
        	if(n%x == 1) {
        		answer = x;
        		break;
        	}else {
        		x++;
        		}
        	}
        return answer;
    }
}
