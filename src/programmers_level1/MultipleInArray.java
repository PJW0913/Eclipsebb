package programmers_level1;

public class MultipleInArray {
	
	public int[] solution(int n, int[] numlist) {
        int count = 0;
        int[] answer = new int[count];
        
        for(int i = 0; i < numlist.length; i++) {
        	if(numlist[i]%n == 0) {
        		answer[count] = numlist[i];
        		count++;
        	}
        }
        
        for(int i = 0; i < answer.length; i++) {
        	System.out.println(answer[i]);
        }
        
        return answer;
    }
}
