package programmers_level1;

public class MinRemove {

	public int[] solution(int[] arr) {
		
		int[] answer = new int[arr.length-1];			
        int min = 0;
        int index = 0;
        
        for(int i = 0; i < arr.length; i++) {
        	if(min > arr[i]) {
        		min = arr[i];
        	}   	
        }
        for(int j = 0; j < answer.length; j++) {
    		if(arr[j] != min) {
    			answer[j] = arr[index];
    			index++;
    		}else if(arr[j] == min){        			
    			j--;
    			index++;
    		}
    	}
        if(arr.length==1) {
        	answer[0] = -1;
        }
        for(int i = 0; i < answer.length; i++) {
        	System.out.println(answer[i]);
        }
        return answer;
    }
	public static void main(String args[]) {
		int[] arr = {2, 1, 3, 4};
		MinRemove a = new MinRemove();
		a.solution(arr);
	}
}
