package programmers;

public class IceAmericano {

	public int[] solution(int money) {
		int[] answer = new int[2];
		
		int change = 0;
		int order = 0;
		
		order = money/5500;
		change = money-(5500*order);
		
		answer[0] = order;
		answer[1] = change;
		
		return answer;
	}
	
	public int[] solution1(int money) {
        return new int[] { money / 5500, money % 5500 };
    }
}
