package programmers_level0;

public class Triangle {

	public int solution(int[] sides) {
        int answer = 0;
        int max = 0;
        int sum = 0;
        
        for(int i = 0; i < sides.length; i++) {
        	if(sides[i] > max) {
        		max = sides[i];
        	}
        }
        for(int i = 0; i < sides.length; i++) {
        	sum += sides[i];
        }
        if(max < sum-max) {
        	answer = 1;
        }else {
        	answer =2;
        }
        return answer;
    }
}
