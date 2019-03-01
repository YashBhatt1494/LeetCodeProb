package simpleMethods;

import java.util.Arrays;

public class StringMethods {
	
	public static void main(String args[]) {
		
		String name = "Yash Bhatt";
		
		char charName[]=name.toCharArray();
		
		char temp= name.charAt(5);
		
		String x="32424";
		int num= Integer.parseInt(x);
		
		String d = charName.toString();
		
		String f= Integer.toString(num);
		
		boolean bool = (d==f);
		
		System.out.println(bool);
		String test="vwfrv vwg vwt wgv wg vw";
		String[] integerStrings = test.split(" ");
		
		for(String s1: integerStrings)
		System.out.print(s1+" ");
		
		String ntest= test.replaceAll(" ", "xxx");
		String n1test= test.toUpperCase();
		System.out.println(test.toUpperCase());

		System.out.println(test.contains("vwg"));
		
		int[] [] array = {{45,3,65,25,789,3,2},{3,5,2,1}};
		
		//Arrays.sort(array);
		int[] array1 = {5,54,2,23,513} ;
		
		String s2= "vcafez";
		
		s2.replace('z', 'y');
		
		System.out.println(s2.replace('z', 'y'));
		
		//System.out.println(new String());
//		System.out.println(Arrays.deepToString(array));
//		
//		
//		int ff = 'f';
//		System.out.println(s2.codePointCount(2, 6) +" fg fdrw "+ ff);
//		
		
		
	}

}
