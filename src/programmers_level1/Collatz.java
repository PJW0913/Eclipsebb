package programmers_level1;

public class Collatz {

	public int solution(int num) {
        int answer = 0;
        
        while(true) {
        	answer++;
        	if(num == 1) {
        		answer = 0;
        		break;
        	}else if(num%2 == 0) {
        		num /= 2;
        	}else if (num%2 == 1) {
        		num = (num*3)+1;
        	}
        	if(num == 1) {
        		break;
        	}
        	if(answer == 500) {
        		answer = -1;
        		break;
        	}
        }
        return answer;
    }
	public static void main(String args[]) {
		Collatz a = new Collatz();
		System.out.println(a.solution(1));
	}
}
