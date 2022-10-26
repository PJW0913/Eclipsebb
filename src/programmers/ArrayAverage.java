package programmers;

import java.util.Arrays;

public class ArrayAverage {
	
	public double solution(int[] numbers) {
		int sum = 0;
		for(int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		double avg = (double)sum/(numbers.length);
		return avg;
	}
	
	public double solution1(int[] numbers) {
		return Arrays.stream(numbers).average().orElse(0);
	}
}
