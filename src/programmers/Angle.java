package programmers;

public class Angle {

	public int solution(int angle) {
        if(angle == 180){
            return 4;
        }else if(angle > 90){
            return 3;
        }else if(angle == 90){
            return 2;
        }else if(angle > 0){
            return 1;
        }
        return angle;
    }
}
