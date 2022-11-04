package programmers_level1;

public class NumReverseArray {

	public int[] solution(long n) {
		int length = (int)(Math.log10(n)+1);
        int[] answer = new int[length];
        long i = n;
        int x = 0;
        int count = 0;
        
        while(i != 0) {
        	x = (int) (i %10);
        	i /= 10;
        	answer[count] = x;
        	count++;
        }
        
        for(int j = 0; j < answer.length; j++) {
        	System.out.println(answer[j]);
        }
        
        
        return answer;
    }
	
	public static void main(String[] args) {
		NumReverseArray reverse = new NumReverseArray();
		reverse.solution(12345);
		
	}
}
