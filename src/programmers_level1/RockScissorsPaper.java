package programmers_level1;

public class RockScissorsPaper {
	//가위 2 바위 0 보 5
	public String solution(String rsp) {
        String answer = "";
       for(int i = 0; i < rsp.length(); i++) {
    	  switch (rsp.charAt(i)) {
    	  case '2':
    		  answer += '0';
    		  break;
    	  case '0':
    		  answer += '5';
    		  break;
    	  case '5':
    		  answer += '2';
    		  break;
    	  }
       }
        return answer;
    }
}
