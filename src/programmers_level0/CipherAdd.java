package programmers_level0;

public class CipherAdd {

	public int solution(int n) {
        int answer = 0;
        int sum = 0;
        int cipher = (int)Math.log10(n)+1;
        
        for(int i = 1; i < cipher; i++) {
        	sum +=( n/(Math.pow(10, i)))%10;
        }
        
        answer = sum + (n%10);
        
        return answer;
    }
	public int solution1(int n) {
        int answer = 0;
        while(n != 0){
            answer += n % 10;
            n /= 10;
        }
        return answer;
    }
}
