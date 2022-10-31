package programmers_level1;

public class Skewers {

	public int solution(int n, int k) {
		int a = 12000;
		int b = 2000;
		int sum = 0;
		
		sum = a*n+b*k;
		for(int i = 1; i <= n; i++) {
			if(i%10 == 0) {
				sum -= b;
			}
		}
		
		return sum;
	}
}
