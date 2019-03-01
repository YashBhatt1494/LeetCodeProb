package simpleMethods;

import java.util.HashSet;
import java.util.Set;

public class Prob771 {

	
	public static void main(String[] args) {
		
	}
	
	
	 public int numJewelsInStones(String J, String S) {
         int count=0;
         char[] arrayJ = J.toCharArray();
         char[] arrayS = S.toCharArray();
         HashSet<Character> setJ = new HashSet<>();
         
         for(char ch : arrayJ ){
             setJ.add(ch);
         }
         
         for(char ch : arrayS ){
             if(setJ.contains(ch)){
                 count++;
             }
             boolean df= false; 
         }
             
             return count;
 }
}
