package simpleMethods;

import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeMap;

public class KthClosestPoint973 {
	public static void main(String[] args) {
		System.out.println("ve");
		int[][] ans = kClosest(new int[][]{{3,3},{5,-1},{-2,4}}, 2);
		for(int[] coordi: ans) {
		System.out.println("ans = "+ coordi[0] + " "+coordi[1] );
		}
	}
	
	
	public static int[][] kClosest(int[][] points, int K) {
        TreeMap<Integer, int[]> treeMap = new TreeMap<>(); 
       int distance=0; 
        
        for (int[] coordi: points) {
         
            distance= (int) Math.sqrt((coordi[0]*coordi[0])+(coordi[1]*coordi[1]));
            treeMap.put(distance, coordi);
            
         }
      
        
        int[][] ans = new int[2][K];
        int k=0;
        for (int[] coordi: ans) {
        	coordi = treeMap.get(treeMap.firstKey());
        	treeMap.remove(treeMap.firstKey());
        	ans[k++]=coordi;
        }
        
        
        return ans;
    }
}


//System.out.println(array1D[0]+ " " + array1D[1]);