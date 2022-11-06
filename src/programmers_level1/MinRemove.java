package programmers_level1;

public class MinRemove {

	public int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];
        int min = 0;
        int count = 0;
        
        for(int i = 0; i < arr.length; i++) {
        	if(min > arr[i]) {
        		min = arr[i];
        	}
        	
        }
        for(int j = 0; j < answer.length; j++) {
    		if(arr[j] == min) {
    			j--;
    			count++;
    		}else {        			
    			answer[j] = arr[count];
    			count++;
    		}
    	}
        if(arr.length==1) {
        	answer[0] = -1;
        }
        return answer;
    }
}
