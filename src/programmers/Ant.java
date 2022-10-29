package programmers;

public class Ant {
	public int solution(int hp) {
        int answer = 0;
        int generalAntNum= 0;
        int generalAntAttack = 5;
        int soldierAntNum = 0;
        int soldierAntAttack = 3;
        int workerAntNum = 0;
        int workerAntAttack = 1;
        
        generalAntNum = hp / generalAntAttack;
        int rest1 = hp % generalAntAttack;
        
        soldierAntNum = rest1 / soldierAntAttack;
        int rest2 = rest1 % soldierAntAttack;
        
        workerAntNum = rest2 / workerAntAttack;
        
        answer = generalAntNum + soldierAntNum + workerAntNum;
        
        return answer;
    }
}
