package programmers;

public class Division {
	public int solution1(int num1, int num2) {
        return (int) Math.floor((double)num1/num2*1000);
    }
	public int solution2(int num1, int num2) {
        return (int)((double)num1/num2*1000);
    }
}
