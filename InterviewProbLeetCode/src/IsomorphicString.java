package simpleMethods;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class IsomorphicString {
	public static void main(String[] args) {

		//System.out.println(solusion("ada","bdb"));
		
		
		System.out.println(isAnagram("anagram","nagaram"));
	}

	static boolean solusion(String s1, String s2) {

		int[] m = new int[512];

		for (int i = 0; i < s1.length(); i++) {
			if (m[s1.charAt(i)] != m[s2.charAt(i) + 256])
				return false;

			m[s1.charAt(i)] = m[s2.charAt(i) + 256] = i + 1;
		}
		
		String s= "yash";
		
//		 for(char ch : e s.toCharArray()){
//	            System.out.println(ch);
//	        }
//		
//		
		return true;
	}
	
	
	public static boolean isAnagram(String s, String t) {
        Map<Character,Integer> hMap = new HashMap<>();
        
        
        
        boolean[] chack = new boolean[256];
        
        
        
        
        if(s.length()!= t.length())
            return false;
        
        for(char ch : s.toCharArray()){
            if(hMap.containsKey(ch))
                hMap.put(ch,hMap.get(ch)+1);
            else
            	hMap.put(ch,1);
        }
        
        for(char ch : t.toCharArray()){
            if(!hMap.containsKey(ch))
                return false;
            else if(hMap.get(ch)==1)
                hMap.remove(ch);
            else if(hMap.get(ch)>1)
                hMap.put(ch,hMap.get(ch)-1);
            
        }
        
        Hashtable<Integer,Integer> hTable = new Hashtable<>();
        
        boolean a = hTable.put(2, 10) != null;
        
        
        return true;
    }

}
