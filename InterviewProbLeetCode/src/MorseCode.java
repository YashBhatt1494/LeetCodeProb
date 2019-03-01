package simpleMethods;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class MorseCode {
   
	public static void main(String[] args) {
		int a;
		Integer v;
		int ans=uniqueMorseRepresentations(new String[] {"ac","xy"});
		
	}
	
	public static int uniqueMorseRepresentations(String[] words) {
       String[] morseCode = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
       Set<String> finalWords = new HashSet<>();
        
       for(String word: words){
        	String morseWord="";
        	
        	for(int i=0 ; i< word.length() ; i++) {
        		int temp= (int) word.charAt(i);
        		morseWord=morseWord+morseCode[temp-97];
        		System.out.println(temp);
        	}
        	
        	finalWords.add(morseWord);
        	
        }
       return finalWords.size();
    }
	Integer v;
	int a;
	
	public  int repeatedNTimes(int[] A) {
        int N = A.length/2;
        Integer v;
        Map<Integer,Integer> hMap = new HashMap<>();
        int a;
        for(int i:A){
            if(hMap.get(i)==null){
                hMap.put(i,1);
            } else{
                hMap.put(i,hMap.get(i)+1);
            }
        }


        for (int k: hMap.keySet())
            if (hMap.get(k) == N)
                return k;
        
        return 0;
    }
	
}