package programmers_level0;

public class Pizza {

	public int solution(int slice, int n) {
		int answer = 0;
		for(int i = 0; i <= 100; i++) {
			if(slice*i >= n) {
				answer = i;
				break;
			}
		}
		return answer;
	}
}
