package simpleMethods;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class KeyPad {
    public static void main(String args[] ) {
      
    	System.out.println("v sbff");
    	List<String> ans = solution("87");
       
        
        System.out.println(Arrays.toString(ans.toArray()));
     
       System.out.println(ans);
       System.err.println(ans.size());
        
    }
    
    
    static List<String> solution(String digits){
         Map<String,String[]> keyPad = new HashMap<String,String[]>();
         
         char[] digitArr = digits.toCharArray();
         
         keyPad.put("2",new String[]{"a","b","c"});
         keyPad.put("3",new String[]{"d","e","f"});
         keyPad.put("4",new String[]{"g","h","i"});
         keyPad.put("5",new String[]{"j","k","l"});
         keyPad.put("6",new String[]{"m","n","o"});
         keyPad.put("7",new String[]{"p","q","r","s"});
         keyPad.put("8",new String[]{"t","u","v"});
         keyPad.put("9",new String[]{"w","x","y","z"});
         
         
         List<String> ansList = new ArrayList<>();
         
         ansList.add("");
         
         
         if(digitArr.length==0) {
        	 return new ArrayList<>();
         }
         for(int i=0; i<digitArr.length;i++) {
        	
        	String[] chars = keyPad.get(String.valueOf(digitArr[i]));
        	List<String> temp = new ArrayList<>();
        	
        	for(String s : ansList ) {
        		for(String ch : chars ) {
        			temp.add(s+ch);
        		}
        	} 
        	ansList=temp;
         }

         return ansList;
    }
}