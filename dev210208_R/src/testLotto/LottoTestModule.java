package testLotto;

import java.util.Random;
import java.util.Arrays;

public class LottoTestModule {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]  lottoNum = new int[6];
		Random r = new Random();
		int ranNum = 0;
		for (int i = 0; i<6;i++) {
			ranNum = r.nextInt(45);
			
			
			if(ranNum == 0) {
				ranNum = r.nextInt(45);
			}
			//System.out.println(ranNum);

				
					lottoNum[i] = ranNum;
				
		/*aa*/
			
		
	}
		for (int i : lottoNum) {
			System.out.println(i);
		}
	}

}
