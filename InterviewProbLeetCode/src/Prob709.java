package simpleMethods;

import java.util.ArrayList;
import java.util.List;

public class Prob709 {

	
	public static void main(String[] args) {
		
		
		String ans= toLowerCase("hello");
		System.out.println(ans);
	}
	
	static public String toLowerCase(String str) {
		 String ans ="";
         
		 for(int i=0; i<str.length();i++) {
	    	   int temp = str.charAt(i)-32;
	           
	    	   ans=ans+(char)temp;
	           
//	           System.out.println(ans);
	       }    
	        
		 double f= 78.9;
		 int i=(int)f;
		 System.out.println(f);
		
	        
		 List<Integer> aList = new ArrayList<>();
		 
		 aList.add((int) f);
	        return ans;
	    }
	
//	
//	 for(int i=0; i<str.length();i++) {
//  	   int temp=str.charAt(i);
//          if(i>=97 && i<= 90)
//              temp = temp-32;
//        
//  	    
//             ans=ans+(char)temp;
//         
////         System.out.println(ans);
//     }    
//      
      
//      return ans;
	    
		
     
}
