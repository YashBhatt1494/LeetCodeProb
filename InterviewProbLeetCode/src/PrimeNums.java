package simpleMethods;

import java.util.Arrays;

public class PrimeNums {
	public static void main(String[] args) {
		 solusion(6);
	}
	
	static int solusion(int n) {
		boolean[] notPrime = new boolean[n];
		int	count=0;
		for(int i = 2; i < n; i++ ) {
			
			if(notPrime[i]==false) {
				count++;
				System.out.println(i);
				for(int j=2; i*j<n ; j++) {
					notPrime[i*j]=true;
				}
				
			}
			
			
		}
		//System.out.println("jbkj");
		System.out.println(Arrays.toString(notPrime));
		System.out.println(count);
		return count;
	}
}
