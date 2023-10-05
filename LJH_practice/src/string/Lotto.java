package string;

public class Lotto {

	public static void main(String[] args) {
		
		int[] lotto = new int[13];
		
		lotto[0] = (int)(Math.random()*13+1);
		
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random()*9+1);
			
			/*//중복 문제 해결 - 중첩 for
			for(int j = 0; j < i; j++ ) {
				if(lotto[i] == lotto[j])
					i--;
			}*/
		}
		
		for(int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + "");
		}
		
		System.out.println();

	}

}
