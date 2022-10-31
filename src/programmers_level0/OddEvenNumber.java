package programmers_level0;

public class OddEvenNumber {

	public int[] solution(int[] num_list) {
        int OddCount = 0;
        int EvenCount = 0;
        int[] new_list = new int[2];
        
		for(int i = 0; i < num_list.length; i++) {
			if(num_list[i]%2 == 0) {
				EvenCount++;
			}else if(num_list[i]%2 == 1){
				OddCount++;
			}
		}
		new_list[0] = EvenCount;
		new_list[1] = OddCount;
		
		return new_list;
    }
}
