package programmers_level1;

public class ClothesSale {

	 public int solution(int price) {
	        int answer = 0;
	        if(price >= 500000) {
	        	answer = (int) (price * 0.8);
	        }else if(price >= 300000) {
	        	answer = (int) (price * 0.9);
	        }else if(price >= 100000) {
	        	answer = (int) (price * 0.95);
	        }else if(price >= 10){
	        	answer = price;
	        }
	        return answer;
	    }
}
