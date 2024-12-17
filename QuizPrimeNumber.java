import java.util.Random;

public class QuizPrimeNumber{
	
	public int[] getPrimeNumber(String level,int[] primeNumbers){
		Random rand = new Random();
		int count = 0;
		
		if(level.equals("E")){
			count = rand.nextInt(2)+2;
		}else if(level.equals("N")){
			count = rand.nextInt(3)+2;
		}
		
		int quizNumber[] = new int[count];
		for(int i = 0; i < count; i++){
			quizNumber[i] = primeNumbers[rand.nextInt(primeNumbers.length)];
		}
			
		return quizNumber;
	}
}
