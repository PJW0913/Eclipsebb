package programmers_level0;

public class Pizza1 {

	public int solution(int n) {
			int answer = 0;
			
			for(int i = 0; i <= 100; i++) {
				if(7*i >= n) {
					answer = i;
					break;
				}
			}
			return answer;
	}
	 public int solution1(int n) {
	        return n%7 == 0 ? n/7 : n/7+1;

	    }
}
