package programmers;

public class ArrayLength {

	public int[] solution(String[] strlist) {
		int[] array = new int[strlist.length];
		for(int i = 0; i < strlist.length; i++) {
			array[i] = strlist[i].length();
		}
		return array;
    }
}
