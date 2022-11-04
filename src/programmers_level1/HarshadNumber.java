package programmers_level1;

public class HarshadNumber {
	public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        int i = x;
        
        while(i != 0) {
        	sum += i%10;
        	i /= 10;
        }
        
        if(x%sum == 0) {
        	answer = true;
        }else if(x%sum != 0){
        	answer = false;
        }
        return answer;
    }
	
	public static void main(String[] args) {
		HarshadNumber harshad = new HarshadNumber();
		System.out.println(harshad.solution(13));
		
	}
}
