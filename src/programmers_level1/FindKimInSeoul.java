package programmers_level1;

public class FindKimInSeoul {

	public String solution(String[] seoul) {
        String answer = "";
        
        for(int i = 0; i < seoul.length; i++) {
        	if(seoul[i].contentEquals("Kim")) {
        		answer = "�輭���� " + i + "�� �ִ�";
        		break;
        	}
        }
        return answer;
    }
}
