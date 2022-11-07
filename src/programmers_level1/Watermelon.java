package programmers_level1;

public class Watermelon {

	public String solution(int n) {
        String answer = "";
        
        for(int i = 0; i < n; i++) {
        	if(i%2 == 0) {
        		answer += "¼ö";
        	}else if(i%2 == 1) {
        		answer += "¹Ú";
        	}
        }
        return answer;
        
    }
}
