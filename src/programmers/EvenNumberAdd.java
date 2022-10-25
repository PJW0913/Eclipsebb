package programmers;

public class EvenNumberAdd {
	
	public int solution(int n) {
		for(int i = 0; i < n; i++) {
			if(i%2 == 0) {
				int sum=0;
				sum += sum;
				return sum;
			}
		}
		return n;
	}
}
