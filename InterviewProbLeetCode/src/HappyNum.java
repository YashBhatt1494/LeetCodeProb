package simpleMethods;

import java.util.HashSet;
import java.util.Set;

public class HappyNum {

	public static void main(String[] args) {
		System.out.println(isHappy(19));
	}

	public static boolean isHappy(int n) {

		Set<Integer> set = new HashSet<>();

		int newNum=0;
		int remain=0;

		while(!set.contains(n)){
		

			set.add(n);

			while (n > 0) {
				remain = n%10;
				newNum += remain*remain;
				n /= 10;
			}
			
			if(newNum==1)
				return true;
			n=newNum;

		}
		return false;
	}


}




