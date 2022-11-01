package programmers_level1;

public class NumReverseArray {

	public int[] solution(long n) {
		int length = (int)(Math.log10(n)+1);
        int[] answer = new int[length];
        
        for(int i = 0; i < length; i++) {
        	answer[i] = (int)n%10;
        	n = (int)n/10;
        }
        
        for(int i = 0; i < length; i++) {
        	System.out.print(answer[i] + " ");
        }
        return answer;
    }
}
