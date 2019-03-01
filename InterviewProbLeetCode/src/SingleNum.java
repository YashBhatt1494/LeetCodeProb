package simpleMethods;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class SingleNum {
	
	public static void main(String[] args) {
		System.out.println(singleNumber(new int[] {4,1,2,1,2}));
	}
	
    public static int singleNumber(int[] nums) {
        Map<Integer , Integer> hMap= new HashMap<>();
        //int ans=nums[0];
        LinkedList<Integer> lList = new LinkedList();
       
        for(int i: nums){
            if(hMap.get(i)==null){
                hMap.put(i,1);
               // System.out.println(i);
                lList.add(i);
            }else{
            	   //System.out.println("jhk "+i);
                hMap.put(i,2);
                lList.remove(new Integer(i));
            }
                
        }
        
        
          // System.out.println(lList+" ans");
   return (int) lList.getFirst();
  
//   Map<Integer , Integer> hMap= new HashMap<>();
//
//   List lList = new LinkedList();
//  
//   for(int i: nums){
//       if(hMap.get(i)==null){
//           hMap.put(i,1);
//          // System.out.println(i);
//           lList.add(i);
//       }else{
//       	   //System.out.println("jhk "+i);
//           hMap.put(i,2);
//           lList.remove(new Integer(i));
//       }
//           
//   }
//     // System.out.println(lList+" ans");
//   
//      return (int)lList.getFirst();
// 
//       
    }
}