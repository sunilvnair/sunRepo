package moh.Sample2;

import java.util.Arrays;

public class CompareMyString {

	public static void main(String[] args) {
		
		System.out.println("Start");
		System.out.println(myStr("sunil8kumar d"));
		
	}
	

	
	public static String myStr (String strval) {
		String outStr = "";
		
		char[] stringToCharArray = strval.toCharArray();

		for (char output : stringToCharArray) {
			
			if (Character.isAlphabetic(output))  {
				outStr = outStr+output;
			}
			
		}
		
		char[] stringOutCharArray = outStr.toCharArray();
		
		Arrays.sort(stringOutCharArray);
		
		String myFinal = new String(stringOutCharArray);
		return myFinal;
	}

}

